package medium;

public class MatrixSum {
	public int matrixSum(int[][] nums) {
        int sum = 0;
        int max = 0;
        
        for(int j = 0; j < nums[0].length; j++) {
        	max = 0;
        	for(int i = 0; i < nums.length; i++) {
        		max = Math.max(max, nums[i][j]);
        	}
        	sum += max;
        }
        
        return sum;
    }
}
