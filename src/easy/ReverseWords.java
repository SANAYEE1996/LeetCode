package easy;

public class ReverseWords {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] strArray = s.split(" ");
		for(String i : strArray) {
			sb.append(GetReverseWords(i));
			sb.append(" ");
		}
		sb.deleteCharAt(sb.toString().length()-1);
        return sb.toString();
    }
	
	String GetReverseWords(String word) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = word.length()-1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		
		return sb.toString();
	}
}
