package medium;

public class MinPathSum {
	public int minPathSum(int[][] grid) {
        defaultSetMap(grid);
        for(int i = 1; i < grid.length; i++) {
        	for(int j = 1; j < grid[i].length; j++) {
        		grid[i][j] = Math.min(grid[i][j] + grid[i-1][j], grid[i][j] + grid[i][j-1]);
        	}
        }
		return grid[grid.length-1][grid[0].length-1];
    }
	
	private void defaultSetMap(int[][] grid) {
		for(int i = 1; i < grid.length; i++) {
			grid[i][0] += grid[i-1][0];
		}
		for(int i = 1; i < grid[0].length; i++) {
			grid[0][i] += grid[0][i-1];
		}
	}
}
