package medium;

public class SearchRange {
	public int[] searchRange(int[] nums, int target) {
		int[] answer = {-1,-1};
		int j = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				answer[0] = i;
				j = i;
				break;
			}
		}
		for(; j < nums.length; j++) {
			if(nums[j] == target) {
				answer[1] = j;
			}
		}
		return answer;
    }
}
