package medium;

public class LongestIdealString {
	public int longestIdealString(String s, int k) {
        char lastCharacter = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(lastCharacter);
        for(int i = 1; i < s.length(); i++) {
        	if(Math.abs(lastCharacter - s.charAt(i)) > k) {
        		continue;
        	}
        	lastCharacter = s.charAt(i);
        	sb.append(s.charAt(i));
        }
		return sb.toString().length();
    }
}
