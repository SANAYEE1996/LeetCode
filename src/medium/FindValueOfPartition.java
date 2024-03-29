package medium;

import java.util.Arrays;

public class FindValueOfPartition {
	public int findValueOfPartition(int[] nums) {
		Arrays.toString(nums);
		int min = nums[1] - nums[0];
		for(int i = 1; i < nums.length; i++){
			min = Math.min(min, nums[i] - nums[i-1]);
		}
		return min;
	}
}
