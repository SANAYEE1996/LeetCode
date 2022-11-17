package medium;

import java.util.Arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i == 0 && nums.length > 2){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            else if(i == nums.length-1 && nums.length > 2){
                if(nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
            else{
                if(nums.length > 2 && nums[i-1] != nums[i] && nums[i] != nums[i+1]){
                    return nums[i];
                }
            }   
        }
        return nums[0];
    }
}
