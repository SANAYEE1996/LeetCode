package hard;

import java.util.Arrays;

public class MaximumGap {
	public int maximumGap(int[] nums) {
		if(nums.length < 2) return 0;
		Arrays.sort(nums);
		int maxGap = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length-1; i++){
			maxGap = Math.max(maxGap, nums[i+1]-nums[i]);
		}
		return maxGap;
	}
}
