package medium;

public class PredictWinner {
	
	private int maxDiff(int[] nums, int left, int right, int n) {
        if (left == right) {
            return nums[left];
        }
        return Math.max(nums[left] - maxDiff(nums, left + 1, right, n), nums[right] - maxDiff(nums, left, right - 1, n));
    }
    
    public boolean PredictTheWinner(int[] nums) {
        return maxDiff(nums, 0, nums.length - 1, nums.length) >= 0;
    }
}
