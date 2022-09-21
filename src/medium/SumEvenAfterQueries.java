package medium;

public class SumEvenAfterQueries {
	public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int maxOddSum = 0;
        int index = 0;
        int[] answer = new int[nums.length];
        nums[queries[0][1]] += queries[0][0];
        
        for(int i : nums) {
        	if(i % 2 == 0) {
        		maxOddSum += i;
        	}
        }
        answer[0] = maxOddSum;
        int j = 1;
        for(int i = 1; i < queries.length; i++) {
        	index = queries[i][1];
        	if(nums[index] % 2 == 0) {
        		maxOddSum -= nums[index];
        		nums[index] += queries[i][0];
        	}
        	else {
        		nums[index] += queries[i][0];
        	}
        	if(nums[index] % 2 == 0) {
    			maxOddSum += nums[index];
    		}
        	answer[j] = maxOddSum;
        	j++;
        }
		
		
		return answer;
    }
}
