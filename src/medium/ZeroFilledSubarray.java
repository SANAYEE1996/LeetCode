package medium;

public class ZeroFilledSubarray {
	public long zeroFilledSubarray(int[] nums) {
        long answer = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count = 0;
                for(; i < nums.length; i++){
                    if(nums[i] != 0){
                        break;
                    }
                    count++;
                }
                answer += getGausSum(count);
            }
        }
        return answer;
    }

    private long getGausSum(int n){
        if(n == 1){
            return 1;
        }
        if(n % 2 == 0){
            return (long)(n+1)*(n/2);
        }
        return (long)( (long)(n+1)*(n/2) + (long)n/2 + 1);
    }
}
