package easy;

public class MaxScore {
	
	/**
	 * https://leetcode.com/problems/maximum-score-after-splitting-a-string
	 * */

	public int maxScore(String s) {
		int one = 0, zero = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') one++;
			else zero++;
		}
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				one--;
			}
			else {
				zero--;
			}
			max = Math.max(max, one + zero);
		}
		return max;
    }
}
