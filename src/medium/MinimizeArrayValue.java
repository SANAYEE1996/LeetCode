package medium;

public class MinimizeArrayValue {
	public int minimizeArrayValue(int[] nums) {
        int value = nums[0];
        int max = nums[0];
        
        for(int i = nums.length-1; i >= 1; i--) {
        	if(nums[i] > value) {
        		max = nums[i];
        		break;
        	}
        }
        
        int differ = max - value;
        differ /= 2;
        
		
		return Math.max(value+differ, max-differ);
    }
}
