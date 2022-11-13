package medium;

public class ReverseWords {
	public String reverseWords(String s) {
		s = s.trim();
		StringBuilder sb = new StringBuilder();
		StringBuilder partSb = new StringBuilder();
		char beforeChar = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == ' ' && beforeChar == ' ') {
				beforeChar = ' ';
				continue;
			}
			else if(s.charAt(i) == ' ' && beforeChar != ' ') {
				beforeChar = ' ';
				sb.append(partSb.toString());
				sb.append(' ');
				partSb.setLength(0);
				continue;
			}
			partSb.insert(0, s.charAt(i));
			beforeChar = s.charAt(i);
		}
		sb.append(partSb.toString());
		return sb.toString();
    }
	
	public static void main(String[] args) {
		ReverseWords s = new ReverseWords();
		
		System.out.println(s.reverseWords("the sky is blue"));
		System.out.println(s.reverseWords("  hello world  "));
		System.out.println(s.reverseWords("a good   example"));
	}
}
