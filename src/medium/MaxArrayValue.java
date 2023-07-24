package medium;

public class MaxArrayValue {
	
	/**
	 * https://leetcode.com/problems/largest-element-in-an-array-after-merge-operations/
	 * */
	
	public long maxArrayValue(int[] nums) {
		long max = 0;
		long sum = nums[nums.length-1];
		for(int i = nums.length-2; i >= 0; i--){
			if(nums[i] <= sum){
				sum += nums[i];
				continue;
			}
			max = Math.max(max, sum);
			sum = nums[i];
		}
		return Math.max(max, sum);
	}
}
