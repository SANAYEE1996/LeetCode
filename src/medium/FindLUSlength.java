package medium;

public class FindLUSlength {
	public int findLUSlength(String[] strs) {
		int answer = 0;
		for(int i = 0; i < strs.length; i++) {
			for(int j = 0; j < strs.length; j++) {
				if(i == j) continue;
				if(isUnCommonRelation(strs[i], strs[j])) {
					answer = Math.max(answer, Math.max(strs[i].length(), strs[j].length()));
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
