package medium;

import java.util.Arrays;

public class LongestConsecutive {
	public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int length = 1;
        int maxLength = 1;
        int beforeValue = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - beforeValue == 1){
                length++;
            }
            else if(nums[i] - beforeValue > 1){
                maxLength = Math.max(length, maxLength);
                length = 1;
            }
            beforeValue = nums[i];
        }
        maxLength = Math.max(length, maxLength);
        
        return maxLength;
    }
}
