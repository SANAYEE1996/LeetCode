package hard;

public class IsMatch {
	public boolean isMatch(String s, String p) {
		if(isAllStar(p) || s.equals(p)) return true;
		if(!p.contains("*") && (p.length() != s.length())) return false;
		int[] sIndex = {0};
		char nowChar = 0;
		char imshi = 0;
		
		for(int i = 0; i < p.length(); i++) {
			nowChar = p.charAt(i);
			if(nowChar == '?') {
				sIndex[0] = (s.length()-1 > sIndex[0]) ? sIndex[0]++:sIndex[0];
			}
			else if(nowChar == '*') {
				i++;
				if(i == p.length()) return true;
				imshi = p.charAt(i);
				if(!pass(s, imshi, sIndex)) return false;
			}
			else if(nowChar != s.charAt(sIndex[0]))	return false;
			sIndex[0] = (s.length()-1 > sIndex[0]) ? sIndex[0]++:sIndex[0];
		}
		
		return true;
    }
	
	public boolean isAllStar(String p) {
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) != '*') {
				return false;
			}
		}
		return true;
	}
	
	public boolean pass(String s, char imshi, int[] sIndex) {
		int start = sIndex[0];
		for(int i = start; i < s.length(); i++) {
			sIndex[0] = (s.length()-1 > sIndex[0]) ? sIndex[0]++:sIndex[0];
			if(s.charAt(i) == imshi) {
				return true;
			}
		}
		return false;
	}
}
