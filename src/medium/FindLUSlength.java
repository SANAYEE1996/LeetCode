package medium;

import java.util.HashMap;

public class FindLUSlength {
	public int findLUSlength(String[] strs) {
		int answer = 0;
		HashMap<String, Boolean> map = new HashMap<>();
		for(int i = 0; i < strs.length; i++) {
			for(int j = 0; j < strs.length; j++) {
				if(i == j) continue;
				if(!map.containsKey(strs[i])) {
					map.put(strs[i], true);
				}
				if(!map.containsKey(strs[j])) {
					map.put(strs[j], true);
				}
				if(isUnCommonRelation(strs[i], strs[j])) {
					answer = Math.max(answer, Math.max(strs[i].length(), strs[j].length()));
				}
				else {
					
				}
			}
		}
        return (answer == 0) ? -1 : answer;
    }
	
	private boolean isUnCommonRelation(String a, String b) {
		if(a.length() >= b.length()) {
			for(int i = 0; i < a.length(); i++) {
				if("".equals(b)) {
					return false;
				}
				if(a.charAt(i) == b.charAt(0)) {
					b = b.substring(1);
				}
			}
			return "".equals(b);
		}
		for(int i = 0; i < b.length(); i++) {
			if("".equals(a)) {
				return false;
			}
			if(a.charAt(0) == b.charAt(i)) {
				a = a.substring(1);
			}
		}
		return "".equals(a);
	}
}
