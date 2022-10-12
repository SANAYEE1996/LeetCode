package easy;

import java.util.Arrays;

public class LargestPerimeter {
	public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i >= 2; i--) {
        	if(nums[i-2] + nums[i-1] <= nums[i]) {
            	continue;
            }
        	return nums[i-2] + nums[i-1] + nums[i];
        }
		return 0;
    }
}
