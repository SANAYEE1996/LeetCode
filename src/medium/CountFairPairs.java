package medium;

import java.util.Arrays;

public class CountFairPairs {
	
	public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int newLower = 0;
        int newUpper = 0;
        int lowerIndex = 0;
        int upperIndex = 0;
        boolean lowerUnder = false;
        boolean upperUnder = false;
        boolean lowerOver = false;
        boolean upperOver = false;
        int answer = 0;
        for(int i = 0; i < nums.length-1; i++) {
        	newLower = (lower - nums[i]);
        	newUpper = (upper - nums[i]);
        	lowerIndex = getBinaryIndex(nums, i, nums.length, newLower);
        	upperIndex = getBinaryIndex(nums, i, nums.length, newUpper);
        	if(nums[i+1] >= newLower) {
        		lowerIndex = i+1;
        	}
        	if(nums[nums.length-1] <= newUpper) {
        		upperIndex = nums.length-1;
        	}
        	lowerUnder = newLower < nums[lowerIndex];
        	upperUnder = newUpper < nums[upperIndex];
        	lowerOver = newLower > nums[lowerIndex];
        	upperOver = newUpper > nums[upperIndex];
        	if((lowerOver && upperOver) || (lowerUnder && upperUnder)) {
        		continue;
        	}
        	answer += ((upperUnder ? upperIndex-1 : upperIndex) - (lowerOver ? lowerIndex+1 : lowerIndex) + 1);
        }
		return answer;
    }
	
	private int getBinaryIndex(int[] nums, int low, int high, int target){
		int middle = (low+high)/2;
		while(low <= high && low < middle && middle < high){
			if(nums[middle] == target){
				return middle;
			}else if(nums[middle] < target){
				low = middle+1;
				middle = (low+high)/2;
			}else{	// target < nums[middle]
				high = middle-1;
				middle = (low+high)/2;
			}
		}
		return middle < 0 ? 0 : middle > nums.length-1 ? nums.length-1 : middle;
	}
	
	public static void main(String[] args) {
		CountFairPairs s = new CountFairPairs();
		System.out.println(s.countFairPairs(new int[] {0,1,4,4,5,7}, 3, 6));
		System.out.println(s.countFairPairs(new int[] {1,7,9,2,5}, 11, 11));
		System.out.println(s.countFairPairs(new int[] {0,0,0,0,0,0}, 0, 0));
		System.out.println(s.countFairPairs(new int[] {0,0,0,0,0,0}, -10, 10));
	}
}
