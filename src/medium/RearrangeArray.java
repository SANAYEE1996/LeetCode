package medium;

public class RearrangeArray {
	public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
		int positiveIndex = 0;
		int negativeIndex = 1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0) {
				answer[negativeIndex] = nums[i];
				negativeIndex += 2;
			}
			else {
				answer[positiveIndex] = nums[i];
				positiveIndex += 2;
			}
		}
        return answer;
    }
}
