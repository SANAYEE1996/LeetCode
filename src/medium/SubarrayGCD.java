package medium;

public class SubarrayGCD {
	public int subarrayGCD(int[] nums, int k) {
		int answer = 0;
		for(int i = 0; i < nums.length; i++){
			nums[i] = (nums[i]%k == 0) ? ((nums[i] == k) ? 0 : 1) : -1;
		}
		int oneCount = 0, zeroCount = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){
				zeroCount++;
			}
			else if(nums[i] == 1){
				oneCount++;
			}
			else{
				oneCount = 0;
				zeroCount = 0;
			}
		}
		
		return answer;
    }
}
