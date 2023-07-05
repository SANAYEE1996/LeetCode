package medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubarray {
	
	/**
	 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	 * */
	
	public int longestSubarray(int[] nums) {
		int answer = 0;
		int oneCount = (nums[0] == 0) ? 0 : 1;
		int zeroCount = (nums[0] == 0) ? 1 : 0;
		List<Integer> countList = new ArrayList<>();
		List<Integer> flagList = new ArrayList<>();
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[i-1]){
				if(nums[i] == 0){
					countList.add(oneCount);
					flagList.add(1);
					zeroCount = 1;
					if(i == nums.length-1) {
						countList.add(zeroCount);
						flagList.add(0);
					}
				}
				else{
					countList.add(zeroCount);
					flagList.add(0);
					oneCount = 1;
					if(i == nums.length-1) {
						countList.add(oneCount);
						flagList.add(1);
					}
				}
				continue;
			}
			if(nums[i] == 0){
				zeroCount++;
				if(i == nums.length-1) {
					countList.add(zeroCount);
					flagList.add(0);
				} 
			}
			else{
				oneCount++;
				if(i == nums.length-1) {
					countList.add(oneCount);
					flagList.add(1);
				} 
			}
		}
		
		if(flagList.size() == 1){
			if(flagList.get(0) == 0) return 0;
			return countList.get(0)-1;
		}
		
		for(int i = 0; i < countList.size(); i++){
			if(flagList.get(i) == 0) {
				if(countList.get(i) > 1) continue;
				if(0 < i && i < countList.size()-1){
					answer = Math.max(answer, countList.get(i-1) + countList.get(i+1));
				}
				continue;
			}
			answer = Math.max(answer, countList.get(i));
		}
		
		return answer;
	}
}
