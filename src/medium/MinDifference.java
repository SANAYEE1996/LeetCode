package medium;

import java.util.Arrays;

public class MinDifference {
	
	/**
	 * 
	 * https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
	 * 
	 * You are given an integer array nums. 
	 * In one move, you can choose one element of nums and change it to any value. 
	 * Return the minimum difference between the largest and smallest value of nums 
	 * after performing at most three moves.
	 * 
	 * 1 <= nums.length <= 100,000
	 * -1,000,000,000 <= nums[i] <= 1,000,000,000
	 * 
	 * */
	
	
	public int minDifference(int[] nums) {
		if(nums.length <= 4) {
			return 0;
		}
		Arrays.sort(nums);
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++){
			if(i == 0){
				minValue = Math.min(minValue, nums[nums.length-4] - nums[0]);
				continue;
			}
			else if(i == nums.length-1){
				minValue = Math.min(minValue, nums[i] - nums[3]);
				continue;
			}
			int low = 0, high = nums.length-1;
			for(int j = 0; j < 3; j++){
				if(nums[i] - nums[low] < nums[high] - nums[i]){
					high = (i < high) ? high-1 : high;
				}
				else if(nums[i] - nums[low] == nums[high] - nums[i]) {
					high = (i < high) ? high-1 : high;
					low = (low < i) ? low+1 : low;
					j++;
				}
				else{
					low = (low < i) ? low+1 : low;
				}
			}
			minValue = Math.min(minValue, Math.abs(nums[high] - nums[low]));
		}
		return minValue;
	}
}
