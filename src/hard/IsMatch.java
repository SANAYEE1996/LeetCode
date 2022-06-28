package hard;

public class IsMatch {
	public boolean isMatch(String s, String p) {
		if(!p.contains("*") && (p.length() != s.length())) return false;
		int sIndex = 0;
		char nowChar = 0;
		int index = 0;
		String star = "";
		
		for(int i = 0; i < p.length(); i++) {
			nowChar = p.charAt(i);
			if(nowChar == '?') {
				sIndex = (sIndex + 1 <= s.length()-1) ? sIndex+1 : s.length()-1;
				continue;
			}
			else if(nowChar == '*') {
				star = starString(p,i+1);
				if(star.equals("")) return true;
				i += star.length();
				index = s.lastIndexOf(star);
				if(index < 0) {
					return false;
				}
				sIndex = (index + star.length() <= s.length()-1) ? index + star.length() : s.length()-1;
				continue;
			}
			else if(nowChar != s.charAt(sIndex)) {
				return false;
			}
			sIndex = (sIndex + 1 <= s.length()-1) ? sIndex+1 : s.length()-1;
		}
		
		return true;
    }
	
	
	public String starString(String p, int i) {
		int start = i;
		for(; i < p.length(); i++) {
			if(p.charAt(i) == '?' || p.charAt(i) == '*' ) {
				return p.substring(start,i);
			}
		}
		return "";
	}
}
