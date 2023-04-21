package medium;

public class FindPrefixScore {
	public long[] findPrefixScore(int[] nums) {
        int max = nums[0];
        long sum = 0;
        long[] sumArray = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
            nums[i] += max;
            sum += (long) nums[i];
            sumArray[i] = sum;
        }

        return sumArray;
    }
}
