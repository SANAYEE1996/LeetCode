package medium;

import java.util.Arrays;

public class MaxStrength {
	public long maxStrength(int[] nums) {
		if(nums.length == 1){
			return nums[0];
		}
		Arrays.sort(nums);
		int minusCount = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] >= 0){
				break;
			}
			minusCount++;
			if(minusCount == 2){
				minusCount = 0;
				nums[i] *= -1;
				nums[i-1] *= -1;
			}
		}
		Arrays.sort(nums);
		long answer = nums[nums.length-1];
		for(int i = nums.length-2; i >= 0; i--){
			if(nums[i] <= 0){
				break;
			}
			answer *= (long) nums[i];
		}
		return answer;
	}
}
