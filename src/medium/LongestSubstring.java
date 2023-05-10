package medium;


public class LongestSubstring {
	
	/**
	 * 
	 * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
	 * 
	 * Given a string s and an integer k, return the length of the longest substring of s 
	 * such that the frequency of each character in this substring is greater than or equal to k.
	 * 
	 * 
	 * */
	
	private int maxLength;
	
	public int longestSubstring(String s, int k) {
		maxLength = 0;
		gogo(s,k);
		return maxLength;
	}
	
	private void gogo(String s, int k){
		if("".equals(s)){
			return;
		}
		int[] charFrequencyArray = getCharFrequencyArray(s);
		String splitString = splitString(charFrequencyArray, k);
		if("".equals(splitString)){
			maxLength = Math.max(maxLength, s.length());
			return;
		}
		String[] sArray = s.split(splitString);
		for(String part : sArray){
			gogo(part, k);
		}
	}

	private int[] getCharFrequencyArray(String s){
		int[] charFrequencyArray = new int[26];
		for(int i = 0; i < s.length(); i++){
			charFrequencyArray[(int)s.charAt(i) - 97]++;
		}
		return charFrequencyArray;
	}

	private String splitString(int[] charFrequencyArray, int k){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < charFrequencyArray.length; i++){
			if(0 < charFrequencyArray[i] && charFrequencyArray[i] < k){
				sb.append((char)(i+97));
				sb.append('|');
			}
		}
		String answer = sb.toString();
		if(answer.equals("")){
			return "";
		}
		return answer.substring(0,answer.length()-1);
	}

}
