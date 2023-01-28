package easy;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		if("".equals(s)) {
			return true;
		}
		char start = s.charAt(0);
		
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == start) {
				s = s.substring(1);
			}
			if("".equals(s)) {
				break;
			}
			start = s.charAt(0);
		}
		
		return "".equals(s);
    }
}
