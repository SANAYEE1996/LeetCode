package medium;

public class GetAverages {
	
	/**
	 * https://leetcode.com/problems/k-radius-subarray-averages/
	 * 
	 * */
	
	public int[] getAverages(int[] nums, int k) {
		int[] answer = new int[nums.length];
		long sum = 0;
		for(int i = 0; i <= k*2; i++){
			if(i > nums.length-1) break;
			sum += (long)nums[i];
		}
		int head = 0, tail = k*2;
		for(int i = k; i <= nums.length-k; i++){
			if(i > nums.length-1) break;
			answer[i] = (int) (sum/(int)(k*2+1));
			tail++;
			sum -= nums[head];
			if(tail < nums.length) sum += nums[tail];
			head++;
		}
		for(int i = 0; i < k; i++){
			if(i > nums.length-1) break;
			answer[i] = -1;
		}
		for(int i = answer.length-k; i < answer.length; i++){
			if(i > nums.length-1 || i < 0) break;
			answer[i] = -1;
		}
		return answer;
	}
}
