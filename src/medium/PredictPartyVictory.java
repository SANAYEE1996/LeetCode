package medium;

import java.util.HashMap;

public class PredictPartyVictory {
	public String predictPartyVictory(String senate) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('R',0);
		map.put('D',0);
		char key = 0;
		for(int i = 0; i < senate.length(); i++){
			key = senate.charAt(i);
			map.put(key, map.get(key)+1);
		}
		
		char radiant = 'R';
		char Dire = 'D';
		String winner = "";
		if(!map.containsKey(Dire)){
			return "Radiant";
		}
		if(!map.containsKey(radiant)){
			return "Dire";
		}
		int index = 0;
		String before = "";
		String after = "";
		String changeAfter = "";
		while(winner.equals("")){
			key = senate.charAt(index);
			if(key == radiant){
				if(map.get(Dire) > 0){
					before = senate.substring(0, index);
					after = senate.substring(index+1);
					changeAfter = removeEnemy(after, "D");
					if(after.equals(changeAfter)) {
						senate = removeEnemy(before, "D") + "R" + after;
					}
					else {
						senate = before + "R" + changeAfter;
						index++;
					}
					map.put(Dire, map.get(Dire)-1);
				}
				else if(map.get(Dire) == 0){
					winner = "Radiant";
				}
			}
			else{ //key == Dire
				if(map.get(radiant) > 0){
					before = senate.substring(0, index);
					after = senate.substring(index+1);
					changeAfter = removeEnemy(after, "R");
					if(after.equals(changeAfter)) {
						senate = removeEnemy(before, "R") + "D" + after;
					}
					else {
						senate = before + "D" + changeAfter;
						index++;
					}
					map.put(radiant, map.get(radiant)-1);
				}
				else if(map.get(radiant) == 0){
					winner = "Dire";
				}
			}
			
			if(index >= senate.length()){
				index = 0;
			}
		}
		
		return winner;
	}
	
	private String removeEnemy(String origin, String target){
		origin = origin.replaceFirst(target,"");
		return origin;
	}
}
