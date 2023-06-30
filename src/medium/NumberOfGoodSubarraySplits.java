package medium;

public class NumberOfGoodSubarraySplits {
	
	/**
	 * https://leetcode.com/problems/ways-to-split-array-into-good-subarrays/submissions/
	 * 
	 * */
	
	public int numberOfGoodSubarraySplits(int[] nums) {
		long answer = 1;
		int beforeIndex = -1;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0) continue;
			if(beforeIndex == -1){ 
				beforeIndex = i;
				continue;
			}
			answer = ((answer%1000000007)*(long)(i - beforeIndex)%1000000007)%1000000007;
			beforeIndex = i;
		}
		if(beforeIndex == -1) return 0;
		return (int)answer;
	}
}
