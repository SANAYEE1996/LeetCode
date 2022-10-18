package medium;

import java.util.Arrays;

public class Search {
	public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
	
	public boolean search81(int[] nums, int target) {
        Arrays.sort(nums);
        return isHere(nums, target);
    }
    
    private boolean isHere(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start <= end){
            mid = (end + start)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
