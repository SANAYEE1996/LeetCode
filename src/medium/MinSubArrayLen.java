package medium;

public class MinSubArrayLen {
	
	/**
	 * https://leetcode.com/problems/minimum-size-subarray-sum/
	 * */
	
	public int minSubArrayLen(int target, int[] nums) {
		int min = Integer.MAX_VALUE;
		int startIndex = 0;
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
			if(sum < target) continue;
			min = Math.min(min, i - startIndex + 1);
			if(i - startIndex < 2){
				sum -= nums[startIndex];
				if(sum >= target) {
					min = Math.min(min, i - startIndex);
				}
				startIndex++;
				continue;
			}
			sum -= nums[startIndex];
			if(sum >= target) {
				min = Math.min(min, i - startIndex);
			}
			startIndex++;
			while(sum >= target){
				sum -= nums[startIndex];
				if(sum >= target){
					min = Math.min(min, i - startIndex);
				}
				startIndex++;
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
