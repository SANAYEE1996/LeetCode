package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		System.out.println("input : " +Arrays.toString(nums));
		int minusCount = 0;
		int zeroCount = 0;
		for(int i : nums) {
			if(i == 0) {
				zeroCount++;
			}
			if(i < 0) {
				minusCount++;
			}
		}
		
		
		ArrayList<Integer> numList = new ArrayList<>();
		int value = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			numList.add(value);
			
			value = Math.max(value, Math.max(nums[i], nums[i]*value));
		}
		
		System.out.println("sum Product : " +value);
		
		return 0;
    }
}
