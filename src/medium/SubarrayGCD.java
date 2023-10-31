package medium;

import java.util.Arrays;

public class SubarrayGCD {
	
	/**
	 *  https://leetcode.com/problems/number-of-subarrays-with-gcd-equal-to-k/
	 * */
	
	public int subarrayGCD(int[] nums, int k) {
		int answer = 0;
		System.out.println("input");
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++){
			nums[i] = (nums[i]%k == 0) ? ((nums[i] == k) ? 0 : 1) : -1;
		}
		System.out.println(Arrays.toString(nums));
		int oneCount = 0, zeroCount = 0;
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){
				sum += 2;
				if(oneCount > 0){
					answer += oneCount;
				}
				zeroCount++;
				oneCount = 0;
			}
			else if(nums[i] == 1){
				sum *= 2;
				oneCount++;
				zeroCount = 0;
			}
			else{
				answer += sum;
				oneCount = 0; zeroCount = 0;
			}
		}
		
		return answer;
    }
}
