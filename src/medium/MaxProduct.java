package medium;

import java.util.Arrays;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		System.out.println("input : " +Arrays.toString(nums));
		int sumProductValue = nums[0];
		int beforeSumProductValue = nums[0];
		int beforeMinusOrZero = -11;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > 0) {
				sumProductValue *= nums[i];
			}
			else if(nums[i] == 0) {
				if(sumProductValue < 0) {
					beforeSumProductValue = sumProductValue;
					sumProductValue *= nums[i];
					beforeMinusOrZero = 1;
				}
				else {
					beforeSumProductValue = sumProductValue;
					beforeMinusOrZero = 1;
				}
			}
			else {
				if(sumProductValue < 0) {
					sumProductValue *= nums[i];
				}
				else if(sumProductValue == 0) {
					beforeSumProductValue = sumProductValue;
					sumProductValue = 1;
					beforeMinusOrZero = nums[i];
				}
				else {
					sumProductValue *= nums[i];
					beforeSumProductValue = sumProductValue;
					beforeMinusOrZero = nums[i];
				}
			}
		}
		if (sumProductValue < 0) {
			sumProductValue = Math.max(sumProductValue/beforeSumProductValue, beforeSumProductValue/beforeMinusOrZero);
		}
		
		System.out.println("sum Product : " +sumProductValue);
		
		return 0;
    }
}
