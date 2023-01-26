package medium;

public class SubarraysDivByK {
	public int subarraysDivByK(int[] nums, int k) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	sum = nums[i];
        	if(Math.abs(sum) % k == 0) answer++;
        	for(int j = i+1; j < nums.length; j++) {
        		sum += nums[j];
        		if(Math.abs(sum) % k == 0) answer++;
        	}
        }
		return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(-2/5);
		System.out.println(-2%5);
	}
}
