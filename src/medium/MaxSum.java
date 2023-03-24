package medium;

public class MaxSum {
	public int maxSum(int[][] grid) {
		int part = 0;
		int maxValue = -1;
		for(int i = 2; i < grid.length; i++){
			for(int j = 2; j < grid[i].length; j++){
				part = grid[i-2][j-2] + grid[i-2][j-1] + grid[i-2][j];
				part += grid[i-1][j-1];
				part += grid[i][j-2] + grid[i][j-1] + grid[i][j];
				maxValue = Math.max(maxValue, part);
			}
		}
		return maxValue;
    }
	
	public static void main(String[] args) {
		MaxSum s = new MaxSum();
		int[][] grid = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
		System.out.println(s.maxSum(grid));
	}
}
