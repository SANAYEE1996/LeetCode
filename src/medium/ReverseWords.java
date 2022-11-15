package medium;

import java.util.Arrays;

public class ReverseWords {
	public String reverseWords(String s) {
		String[] strArray = s.split("\\s+");
		System.out.println(Arrays.toString(strArray));
		StringBuilder sb = new StringBuilder();
		for(int i = strArray.length-1; i >= 0; i--) {
			sb.append(strArray[i]);
			if(i != 0) {
				sb.append(' ');
			}
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		ReverseWords s = new ReverseWords();
		
		System.out.println(s.reverseWords("the sky is blue")+ "||");
		System.out.println(s.reverseWords("  hello world  ") + "||");
		System.out.println(s.reverseWords("a good   example")+ "||");
	}
}
