package medium;

public class MaxSubArray {
	
	/*
	 * -2,1,-3,4,-1,2,1,-5,4
	 *  1,2,3,4,5
	 * 
	 * */
	public int maxSubArray(int[] nums) {
        
		int sum = -9999999;
		int nowValue = 0;
		int maxSum = -9999999;
		
		for(int i = 0; i < nums.length; i++) {
			nowValue = nums[i];
			sum = (sum < nowValue && sum < 0) ? nowValue : sum + nowValue;
			maxSum = Math.max(maxSum, sum);
		}
		
		return maxSum;
    }
}
