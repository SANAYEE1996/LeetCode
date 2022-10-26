package medium;

public class CheckSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
        	nums[i] = nums[i]%k;
        }
		
		return false;
    }
}
