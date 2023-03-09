package medium;

import java.util.Arrays;

public class CountFairPairs {
	
	public long countFairPairs(int[] nums, int lower, int upper) {
		System.out.println("input : " +Arrays.toString(nums));
        Arrays.sort(nums);
        int newLower = 0;
        int newUpper = 0;
        int lowerIndex = 0;
        int upperIndex = 0;
        long answer = 0;
        for(int i = 0; i < nums.length-1; i++) {
        	newLower = (lower - nums[i]);
        	newUpper = (upper - nums[i]);
        	System.out.println("value : "+nums[i]);
        	lowerIndex = getBinaryIndexLower(nums, i+1, nums.length-1, newLower);
        	upperIndex = getBinaryIndexUpper(nums, i+1, nums.length-1, newUpper);
        	System.out.println("newLower : " +newLower+" and its index : "+lowerIndex);
        	System.out.println("newUpper : " +newUpper+" and its index : "+upperIndex);
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
	
	public static void main(String[] args) {
		CountFairPairs s = new CountFairPairs();
		int[] exam = {0,1,4,4,5,7};
		System.out.println(s.countFairPairs(exam, 3, 6));
		System.out.println(s.countFairPairs(new int[] {1,7,9,2,5}, 11, 11));
		System.out.println(s.countFairPairs(new int[] {0,0,0,0,0,0}, 0, 0));
		System.out.println(s.countFairPairs(new int[] {0,0,0,0,0,0}, -10, 10));
	}
}
