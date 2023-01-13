package medium;

import java.util.HashMap;

public class IsItPossible {
	public boolean isItPossible(String word1, String word2) {
		System.out.println("input word1 : "+word1+ " // input word2 : " +word2);
        HashMap<Character, Integer> word1Map = new HashMap<>();
        HashMap<Character, Integer> word2Map = new HashMap<>();
        putCharToMap(word1Map, word1);
        putCharToMap(word2Map, word2);
        
        if(word1Map.size() == word2Map.size()) {
        	System.out.println("차이가 같음");
        	return true;
        }
        else if(Math.abs(word1Map.size() - word2Map.size()) > 2) {
        	System.out.println("차이가 2를 초과함");
        	return false;
        }
        else if(Math.abs(word1Map.size() - word2Map.size()) == 2) {
        	System.out.println("차이가 2일 때");
        	if(word1Map.size() > word2Map.size()) {
        		return differTwoCheck(word1Map, word2Map);
        	}
        	return differTwoCheck(word2Map, word1Map);
        }
        System.out.println("차이가 1일 때");
        if(word1Map.size() > word2Map.size()) {
    		return differOneCheck(word1Map, word2Map);
    	}
    	return differOneCheck(word2Map, word1Map);
    }
	
	private void putCharToMap(HashMap<Character, Integer> map, String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 0);
			}
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
	}
	
	private boolean differTwoCheck(HashMap<Character, Integer> bigMap, HashMap<Character, Integer> smallMap) {
		for(Character bigKey : bigMap.keySet()) {
			if(bigMap.get(bigKey) == 1) {
				if(!smallMap.containsKey(bigKey)) {
					for(Character smallKey : smallMap.keySet()) {
						if(smallMap.get(smallKey) >= 2) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private boolean differOneCheck(HashMap<Character, Integer> bigMap, HashMap<Character, Integer> smallMap) {
		for(Character bigKey : bigMap.keySet()) {
			if(bigMap.get(bigKey) >= 2) {
				if(!smallMap.containsKey(bigKey)) {
					for(Character smallKey : smallMap.keySet()) {
						if(smallMap.get(smallKey) >= 2) {
							return true;
						}
					}
				}
			}
			else {
				if(smallMap.containsKey(bigKey)) {
					for(Character smallKey : smallMap.keySet()) {
						if(smallMap.get(smallKey) >= 2) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		IsItPossible s = new IsItPossible();
		System.out.println(s.isItPossible("ac", "b"));
		System.out.println(s.isItPossible("abcc", "aab"));
		System.out.println(s.isItPossible("abcde", "fghij"));
		System.out.println(s.isItPossible("a", "bb"));
	}
}
