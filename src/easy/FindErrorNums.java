package easy;

import java.util.Arrays;

public class FindErrorNums {
	public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++){
            if(nums[i] != i+1){
                return new int[]{nums[i], i+1};
            }
        }
        
        return new int[]{0,0};
    }
}
