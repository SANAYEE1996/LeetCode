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
				sIndex++;
			}
			else if(nowChar == '*') {
				star = starString(p,i+1);
				if(star.equals("")) return true;
				i += star.length();
				index = s.lastIndexOf(star);
				if(index < 0) return false;
				sIndex = index + star.length();
			}
			else if(nowChar != s.charAt(sIndex)) {
				return false;
			}
			else if(nowChar == s.charAt(sIndex)) {
				sIndex++;
			}
			
			if(sIndex >= s.length()) {
				p = p.substring(i+1);
				break;
			}
		}
		if(isAllStar(p)) return true;
		return false;
    }
	public boolean isAllStar(String p) {
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i)!='*') return false;
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
