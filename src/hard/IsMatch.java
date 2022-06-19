package Hard;

public class IsMatch {
	public boolean isMatch(String s, String p) {
		
		String str = "";
		
		if(s.equals(p) || p.equals(".*")) {
			return true;
		}
		else {
			if(p.substring(p.length()-1).equals("*")) {
				str = p.substring(0, p.length()-1);
				if(repeat(str,s)) {
					return true;
				}
			}
			
			return false;
		}
    }
	
	public static boolean repeat(String str, String s) {
		int count = s.length()/str.length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count; i++) {
			sb.append(str);
		}
		if(sb.toString().equals(s)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		IsMatch s = new IsMatch();
		
		System.out.println("the answer is : " +s.isMatch("aa", "a"));
		System.out.println("the answer is : " +s.isMatch("aa", "a*"));
		System.out.println("the answer is : " +s.isMatch("ab", ".*"));
		System.out.println("the answer is : " +s.isMatch("aab", "c*a*b*"));

	}

}
