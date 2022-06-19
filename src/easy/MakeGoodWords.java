package easy;

public class MakeGoodWords {
	public String makeGood(String s) {
		
		
		return remove(s);
    }
	
	public String remove(String s) {
		StringBuilder sb = new StringBuilder();
		boolean isRecursive = false;
		for(int i = 0; i < s.length()-1; i++) {
			if(	s.charAt(i) + 32 == s.charAt(i+1) || 
				s.charAt(i) - 32 == s.charAt(i+1)) {
				sb.append(s.substring(i+2));
				isRecursive = true;
				break;
			}
			sb.append(s.charAt(i));
		}
		
		if(isRecursive)	return remove(sb.toString());
		return s;
	}
}
