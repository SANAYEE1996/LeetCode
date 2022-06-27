package hard;

import java.util.Arrays;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int min = 1;
		Arrays.sort(nums);
		for(int i : nums) {
			if(i <= 0) {
				continue;
			}
			
			if(i == min) min = i+1;
			else if(i > min) return min;
		}
		if(nums[nums.length-1] <= 0) return 1;
		return nums[nums.length-1]+1;
    }
}
