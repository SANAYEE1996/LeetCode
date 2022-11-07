package medium;

import java.util.ArrayList;

public class SubarrayGCD {
	public int subarrayGCD(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] % k == 0) {
        		
        	}
        }
		
		return 0;
    }
	
	private int getCaseCount(ArrayList<Integer> list) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 1) {
				count += list.size();
			}
		}
		return count;
	}
}
