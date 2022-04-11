package Hard;

public class IsMatch {
	public boolean isMatch(String s, String p) {
		
		if(s.equals(p) || s.equals(".*") || p.equals(".*")) {
			return true;
		}
		else {
			if(getIndex(s) != -1) {
				
			}
			
			if(getIndex(p) != -1) {
				
			}
			return false;
		}
    }
	
	public static int getIndex(String str) {
		int flag = -1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '*') {
				flag = i;
				break;
			}
		}
		
		
		return flag;
	}

	public static void main(String[] args) {
		IsMatch s = new IsMatch();
		
		System.out.println("the answer is : " +s.isMatch("aa", "a"));
		System.out.println("the answer is : " +s.isMatch("aa", "a*"));
		System.out.println("the answer is : " +s.isMatch("ab", ".*"));

	}

}
