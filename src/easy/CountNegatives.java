package easy;

public class CountNegatives {
	
	/**
	 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
	 * 
	 * */
	
	public int countNegatives(int[][] grid) {
		int count = 0;
		for(int i = grid.length-1; i >= 0; i--){
			if(grid[i][grid[i].length-1] >= 0) break;
			for(int j = grid[i].length-1; j >= 0; j--){
				if(grid[i][j] >= 0) break;
				count++;
			}
		}
		return count;
	}
}
