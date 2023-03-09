package medium;

import java.util.Arrays;

public class CountFairPairs {
	
	public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int newLower = 0;
        int newUpper = 0;
        int lowerIndex = 0;
        int upperIndex = 0;
        long answer = 0;
        for(int i = 0; i < nums.length-1; i++) {
        	newLower = (lower - nums[i]);
        	newUpper = (upper - nums[i]);
        	lowerIndex = getBinaryIndexLower(nums, i+1, nums.length-1, newLower);
        	upperIndex = getBinaryIndexUpper(nums, i+1, nums.length-1, newUpper);
        	if(upperIndex >= lowerIndex) {
        		answer += (long)((long)upperIndex - (long)lowerIndex + 1);
        	}
        }
		return answer;
    }
	
	private int getBinaryIndexLower(int[] nums, int low, int high, int target){
		int middle = (low+high)/2;
		int initialLow = low;
		while(low <= high){
			if(nums[middle] < target){
				low = middle+1;
				middle = (low+high)/2;
			}else{	// target < nums[middle]
				high = middle-1;
				middle = (low+high)/2;
			}
		}
		if(nums[middle] < target) {
			return middle+1;
		}
		return middle <= initialLow ? initialLow : middle;
	}
	
	private int getBinaryIndexUpper(int[] nums, int low, int high, int target){
		int middle = (low+high)/2;
		while(low <= high){
			if(nums[middle] <= target){
				low = middle+1;
				middle = (low+high)/2;
			}else{	// target < nums[middle]
				high = middle-1;
				middle = (low+high)/2;
			}
		}
		if(nums[middle] > target) {
			return middle-1;
		}
		return middle;
	}
}
