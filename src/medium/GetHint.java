package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GetHint {
	public String getHint(String secret, String guess) {
		HashMap<Character, ArrayList<Integer>> secretMap = new HashMap<>();
		HashMap<Character, ArrayList<Integer>> guessMap = new HashMap<>();

		for(int i = 0; i < secret.length(); i++){
			if(!secretMap.containsKey(secret.charAt(i))){
				secretMap.put(secret.charAt(i), new ArrayList<>());
			}
			secretMap.get(secret.charAt(i)).add(i);
		}

		for(int i = 0; i < guess.length(); i++){
			if(!guessMap.containsKey(guess.charAt(i))){
				guessMap.put(guess.charAt(i), new ArrayList<>());
			}
			guessMap.get(guess.charAt(i)).add(i);
		}
		
		int bullsCount = 0;
		int duplicateCount = 0;
		int cowsCount = 0;
		int secretMinusDup = 0;
		int guessMinusDup = 0;
		
		int beforeSetSize = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(Character guessKey : guessMap.keySet()) {
			set.clear();
			if(secretMap.containsKey(guessKey)) {
				duplicateCount = 0;
				for(int i : secretMap.get(guessKey)) {
					set.add(i);				
				}
				beforeSetSize = set.size();
				for(int i : guessMap.get(guessKey)) {
					set.add(i);
					if(set.size() == beforeSetSize) {
						bullsCount++;
						duplicateCount++;
					}
					beforeSetSize = set.size();
				}
				secretMinusDup = secretMap.get(guessKey).size() - duplicateCount;
				guessMinusDup = guessMap.get(guessKey).size() - duplicateCount;
				cowsCount += Math.min(secretMinusDup, guessMinusDup);
			}
		}
		
		return String.valueOf(bullsCount) + "A" + String.valueOf(cowsCount) + "B";
    }
}
