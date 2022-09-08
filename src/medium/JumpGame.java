package medium;

public class JumpGame {
	public boolean canJump(int[] nums) {
        
		int nowReach = 0;
		int maxReach = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nowReach = nums[i];
			maxReach = Math.max(nowReach, maxReach);
			if(maxReach == 0 && i < nums.length-1) {
				return false;
			}
			maxReach--;
		}
		
		return true;
    }
	
	
	
	public int jump(int[] nums) {
		
		
		
		
		
		return 0;
    }
}
