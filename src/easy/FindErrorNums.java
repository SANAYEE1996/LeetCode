package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindErrorNums {
	
	/*
	 * [3,2,3,4,6,5]
	 * 
	 * */
	
	
	
	public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int beforeSetSize = 0;
        int repeatedNumber = 0;
        boolean[] isExistedFlagList = new boolean[nums.length];
        for(int i=0; i< nums.length; i++){
            set.add(nums[i]);
            if(set.size() == beforeSetSize) {
            	repeatedNumber = nums[i];
            }
            isExistedFlagList[nums[i]-1] = true;
            beforeSetSize = set.size();
        }
        for(int i = 0; i < isExistedFlagList.length; i++) {
        	if(!isExistedFlagList[i]) {
        		return new int[] {repeatedNumber, i+1};
        	}
        }
        return new int[]{0,0};
    }
	
	public int[] findErrorNumsTimeImproved(int[] nums) {
        Arrays.sort(nums);
        int startIndex = 0;
        int notExistedNumber = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != i+1) {
        		notExistedNumber = i+1;
        		startIndex = (i > 0) ? i : 1;
        		break;
        	}
        }
        for(int i = startIndex; i < nums.length; i++) {
        	if(nums[i] == nums[i-1]) {
        		return new int[] {nums[i], notExistedNumber};
        	}
        }
        return new int[]{0,0};
    }
	
	public static void main(String[] args) {
		FindErrorNums s = new FindErrorNums();
		System.out.println(Arrays.toString(s.findErrorNums(new int[] {1,2,2,4})));
		System.out.println(Arrays.toString(s.findErrorNums(new int[] {1,1})));
		System.out.println(Arrays.toString(s.findErrorNums(new int[] {3,2,3,4,6,5})));
		
		System.out.println(Arrays.toString(s.findErrorNumsTimeImproved(new int[] {1,2,2,4})));
		System.out.println(Arrays.toString(s.findErrorNumsTimeImproved(new int[] {1,1})));
		System.out.println(Arrays.toString(s.findErrorNumsTimeImproved(new int[] {3,2,3,4,6,5})));
	}
}
