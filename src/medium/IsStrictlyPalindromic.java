package medium;

public class IsStrictlyPalindromic {
	public boolean isStrictlyPalindromic(int n) {
		for(int i = n; i >= 2; i--) {
			if(isPalindromic(Integer.toBinaryString(i))) {
				return false;
			}
		}
		return true;
    }
	
	private boolean isPalindromic(String s) {
		int size = s.length()/2;
		StringBuilder sb = new StringBuilder();
		StringBuilder sbReverse = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(s.charAt(i));
		}
		for(int i = s.length()-1; i>= (s.length()%2 == 0 ? size : size+1); i--) {
			sbReverse.append(s.charAt(i));
		}
		return sb.toString().equals(sbReverse.toString());
	}
}
