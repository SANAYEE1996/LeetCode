package medium;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
//		System.out.println("input string : " +s);
		int end = s.length();
		int lastIndex = s.length()-1;
		String max = s.substring(0, 1);
		String maybeMax = "";
		for(int i = 0; i < end; i++) {
			if(i < lastIndex && s.charAt(i) == s.charAt(i+1)) {
				maybeMax = s.substring(i, i+2);
				max = (maybeMax.length() > max.length()) ? maybeMax : max;
				maybeMax = even(s, i, lastIndex);
				max = (maybeMax.length() > max.length()) ? maybeMax : max;
			}
			if(i > 0 && i < lastIndex && (s.charAt(i-1) == s.charAt(i+1))) {
				maybeMax = s.substring(i-1, i+2);
				max = (maybeMax.length() > max.length()) ? maybeMax : max;
				maybeMax = odd(s, i, lastIndex);
				max = (maybeMax.length() > max.length()) ? maybeMax : max;
			}
		}
		return max;
    }
	
	
	public String even(String s, int index, int lastIndex) {
		int i = (index-1 >= 0) ? index-1 : 0;
		int j = (index+2 <= lastIndex) ? index+2 : lastIndex;
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){
				i--;
				j++;
				if((i < 0 || j > lastIndex)|| (s.charAt(i) != s.charAt(j))) {
					i += 1;
					break;
				}
			}
			return s.substring(i,j);
		}
		return "";
	}
	
	public String odd(String s, int index, int lastIndex) {
		int i = (index-2 >= 0) ? index-2 : 0;
		int j = (index+2 <= lastIndex) ? index+2 : lastIndex;
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){
				i--;
				j++;
				if((i < 0 || j > lastIndex) || (s.charAt(i) != s.charAt(j))) {
					i += 1;
					break;
				}
			}
			return s.substring(i,j);
		}
		return "";
	}
	

}
