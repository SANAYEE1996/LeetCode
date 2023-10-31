package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinOperationsList {
	
	/**
	 * https://leetcode.com/problems/minimum-operations-to-make-all-array-elements-equal/
	 * */
	
	
	public List<Long> minOperations(int[] nums, int[] queries) {
		Arrays.sort(nums);
		List<Long> list = new ArrayList<>();
		Map<Integer, int[]> map = new HashMap<>();
		Map<Integer, Long> sumMap = new HashMap<>();
		long sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += (long) nums[i];
			if(!map.containsKey(nums[i])){
				map.put(nums[i], new int[]{i,i});
			}
			map.get(nums[i])[1] = i;
			sumMap.put(i, sum);
		}
		long totalSum = sumMap.get(nums.length-1);
		for(int i : queries){
			int middle = getBinaryIndex(nums, i);
			int leftIndex = nums[middle] >= i ? map.get(nums[middle])[0]-1 : middle;
			int rightIndex = nums[middle] <= i ? map.get(nums[middle])[1]+1 : middle;
			int leftSum = (int) (i*(leftIndex+1) - sumMap.get(leftIndex));
			int rightSum = (int) (i*(nums.length-rightIndex) - (totalSum - sumMap.get(rightIndex)));
			list.add((long) (leftSum + rightSum));
		}
		return list;
	}

	private int getBinaryIndex(int[] nums, int target){
		int low = 0, high = nums.length;
		int middle = (low+high)/2;
		while(low <= high){
			if(nums[middle] == target) break;
			else if(nums[middle] < target){
				low = middle+1;
			}
			else{ //target < nums[middle]
				high = middle-1;
			}
			middle = (low+high)/2;
		}
		return middle;
	}
}
