package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	/**
	* https://leetcode.com/problems/summary-ranges/
	* 
	**/
	
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++){
			int origin = i;
			for(; i < nums.length-1; i++){
				if((long)nums[i+1] - (long)nums[i] > (long)1){
					break;
				}
			}
			if(i == origin){
				list.add(String.valueOf(nums[i]));
				continue;
			}
			list.add(String.valueOf(nums[origin])+"->"+String.valueOf(nums[i]));
		}
		return list;
	}
}
