package easy;

public class RunningSum {
	public void runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
    }
}