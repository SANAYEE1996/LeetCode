package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountFairPairs {
	
	public long countFairPairs(int[] nums, int lower, int upper) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++) {
        	if(!map.containsKey(nums[i])) {
        		map.put(nums[i], new ArrayList<>());
        	}
        	map.get(nums[i]).add(i);
        }
        int minusLower = 0;
        int minusUpper = 0;
        int lowIndex = 0;
        int upIndex = 0;
        long answer = 0;
        long part = 0;
        for(int key : map.keySet()) {
        	minusLower = lower - key;
        	minusUpper = upper - key;
        	lowIndex = binarySearch(nums, minusLower);
        	upIndex = binarySearch(nums, minusUpper);
        	System.out.println("key : " +key);
        	upIndex = (nums[upIndex] > minusUpper) ? upIndex-1 : upIndex;
        	lowIndex = (nums[lowIndex] < minusLower) ? lowIndex+1 : lowIndex;
        	System.out.println("minusLower : " +minusLower + " minusUpper : " +minusUpper);
        	System.out.println("lowIndex : " +lowIndex + " upIndex : " +upIndex);
        	part = (long)((long)upIndex - (long)lowIndex + (long)1);
        	answer += part;
        }
		return answer;
    }
	
	private int binarySearch(int[] array, int target){
		int low = 0;
		int high = array.length-1;
		int mid = (low+high)/2;
		while(low < high){
			if(array[mid] == target){
				break;
			}
			else if(array[mid] < target){
				low = mid+1;
				mid = (low+high)/2;
			}
			else{ //target < array[mid]
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		CountFairPairs s = new CountFairPairs();
		System.out.println(s.countFairPairs(new int[] {0,1,4,4,5,7}, 3, 6));
		System.out.println(s.countFairPairs(new int[] {0,1,4,4,5,7}, 2, 6));
	}
}
