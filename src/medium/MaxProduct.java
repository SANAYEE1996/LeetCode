package medium;

import java.util.Arrays;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		System.out.println("input : " +Arrays.toString(nums));
		int sumProductValue = 1;
		int beforeSumProductValue = 1;
		int beforeMinusOrZero = -11;
		
		for(int i : nums) {
			if(i > 0) {
				sumProductValue *= i;
			}
			else if(i == 0) {
				if(sumProductValue < 0) {
					sumProductValue *= i;
				}
				else if(sumProductValue == 0) {
					
				}
				else {
					beforeSumProductValue = sumProductValue;
					sumProductValue = 1;
					beforeMinusOrZero = 1;
				}
			}
			else {
				if(sumProductValue < 0) {
					sumProductValue *= i;
				}
				else if(sumProductValue == 0) {
					System.out.println("패치 중");
					beforeSumProductValue = sumProductValue;
					sumProductValue = 1;
					beforeMinusOrZero = i;
				}
				else {
					sumProductValue *= i;
					beforeSumProductValue = sumProductValue;
					beforeMinusOrZero = i;
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
