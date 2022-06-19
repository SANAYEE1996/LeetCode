package easy;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] strArray = s.split(" ");
		HashMap<Character, String> mapPattern = new HashMap<>();
		HashMap<String, Character> mapS = new HashMap<>();
		
		if(strArray.length != pattern.length()) return false;
		
		for(int i = 0; i < pattern.length(); i++) {
			if(!mapPattern.containsKey(pattern.charAt(i))) {
				mapPattern.put(pattern.charAt(i), strArray[i]);
				continue;
			}
			if(!mapPattern.get(pattern.charAt(i)).equals(strArray[i])) return false;
		}
		
		for(int i = 0; i < pattern.length(); i++) {
			if(!mapS.containsKey(strArray[i])) {
				mapS.put(strArray[i], pattern.charAt(i));
				continue;
			}
			if(mapS.get(strArray[i]) != (pattern.charAt(i))) return false;
		}
		
		return true;
    }
}
