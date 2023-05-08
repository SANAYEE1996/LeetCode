package medium;

import java.util.HashSet;

public class NumSplits {
	
	/**
	 * 
	 * https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
	 * 
	 * **/
	
	public int numSplits(String s) {
		HashSet<Character> leftSet = new HashSet<>();
		HashSet<Character> rightSet = new HashSet<>();
		int[] rightCharCount = new int[26];
		int answer = 0;
		
		leftSet.add(s.charAt(0));
		for(int i = 1; i < s.length(); i++){
			rightSet.add(s.charAt(i));
			rightCharCount[(int)s.charAt(i) - 97]++;
		}
		if(leftSet.size() == rightSet.size()){
			answer++;
		}
		int rightIndex = 0;
		for(int i = 1; i < s.length(); i++){
			leftSet.add(s.charAt(i));
			rightIndex = (int)s.charAt(i) - 97;
			rightCharCount[rightIndex]--;
			if(rightCharCount[rightIndex] == 0){
				rightSet.remove(s.charAt(i));
			}
			if(leftSet.size() == rightSet.size()){
				answer++;
			}
		}
		return answer;
	}
}
