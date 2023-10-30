package medium;

import java.util.ArrayList;
import java.util.List;

public class MinOperationsList {
	
	/**
	 * https://leetcode.com/problems/minimum-operations-to-make-all-array-elements-equal/
	 * */
	
	
	public List<Long> minOperations(int[] nums, int[] queries) {
		List<Long> list = new ArrayList<>();
		for(int i : queries){
			long sum = 0;
			for(int j : nums){
				sum += Math.abs(j-i);
			}
			list.add(sum);
		}
		return list;
	}
}
