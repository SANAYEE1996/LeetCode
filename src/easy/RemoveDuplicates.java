package easy;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int nowValue = nums[0];
		int count = 1;
		int nowIndex = 0;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nowValue) {
				count++;
				nowValue = nums[i];
				nowIndex++;
				nums[nowIndex] = nowValue;
			}
		}
		
		
		return count;
    }
}
