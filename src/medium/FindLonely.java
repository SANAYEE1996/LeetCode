package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLonely {
	
	/**
	 * https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/submissions/
	 * */
	
	public List<Integer> findLonely(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		if(nums.length == 1) {
			list.add(nums[0]);
			return list;
		}
		for(int i = 0; i < nums.length; i++) {
			if(i == 0) {
				if(nums[i+1] - nums[i] > 1) list.add(nums[i]);
				continue;
			}
			if(i == nums.length-1) {
				if(nums[i] - nums[i-1] > 1) list.add(nums[i]);
				continue;
			}
			if(nums[i+1] - nums[i] > 1 && nums[i] - nums[i-1] > 1) {
				list.add(nums[i]);
			}
		}
		return list;
    }
}
