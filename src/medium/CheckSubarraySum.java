package medium;

import java.util.Arrays;

public class CheckSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
		if(nums.length < 2) return false;
        for(int i = 0; i < nums.length; i++) {
        	nums[i] = nums[i]%k;
        }
		System.out.println(Arrays.toString(nums));
		int sum = nums[0];
		int startIndex = 0;
		for(int i = 1; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("startIndex : "+startIndex+" // nowIndex : "+i+" // sum : "+sum);
			if(sum == k || sum == 0) {
				return true;
			}
			else if(sum > k) {
				sum -= nums[startIndex];
				if((sum == k || sum == 0) && i - startIndex > 1) {
					return true;
				}
				startIndex++;
			}
		}
		return false;
    }
}
