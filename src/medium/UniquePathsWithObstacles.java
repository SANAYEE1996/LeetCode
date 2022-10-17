package medium;

import java.util.Arrays;

public class UniquePathsWithObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if(m <= 1 || n <= 1) {
			return onlyStraightWayCount(obstacleGrid);
		}
		setDefault(obstacleGrid);
		printTwoArray(obstacleGrid);
		System.out.println("=====");
		fillIn(obstacleGrid);
		printTwoArray(obstacleGrid);
		return obstacleGrid[m-1][n-1] == Integer.MAX_VALUE ? 0 : obstacleGrid[m-1][n-1];
	}
	
	private void setDefault(int[][] obstacleGrid) {
		for(int i = 0; i < obstacleGrid.length; i++) {
			if(obstacleGrid[i][0] != 1) {
				obstacleGrid[i][0] = 1;
				continue;
			}
			for(; i < obstacleGrid.length; i++) {
				obstacleGrid[i][0] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 1; i < obstacleGrid[0].length; i++) {
			if(obstacleGrid[0][i] != 1 && obstacleGrid[0][0] != Integer.MAX_VALUE) {
				obstacleGrid[0][i] = 1;
				continue;
			}
			for(; i < obstacleGrid[0].length; i++) {
				obstacleGrid[0][i] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 1; i < obstacleGrid.length; i++) {
			for(int j = 1; j < obstacleGrid[i].length; j++) {
				if(obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = Integer.MAX_VALUE;
				}
			}
		}
	}
	
	private void fillIn(int[][] obstacleGrid) {
		for(int i = 1; i < obstacleGrid.length; i++) {
			for(int j = 1; j < obstacleGrid[i].length; j++) {
				if(obstacleGrid[i][j] != 0) {
					continue;
				}
				if(obstacleGrid[i-1][j] == Integer.MAX_VALUE && obstacleGrid[i][j-1] == Integer.MAX_VALUE) {
					obstacleGrid[i][j] = Integer.MAX_VALUE;
				}
				else if(obstacleGrid[i-1][j] == Integer.MAX_VALUE) {
					obstacleGrid[i][j] = obstacleGrid[i][j-1];
				}
				else if(obstacleGrid[i][j-1] == Integer.MAX_VALUE) {
					obstacleGrid[i][j] = obstacleGrid[i-1][j];
				}
				else {
					obstacleGrid[i][j] = obstacleGrid[i][j-1] + obstacleGrid[i-1][j];
				}
			}
		}
	}
	
	private int onlyStraightWayCount(int[][] obstacleGrid) {
		for(int i = 0; i < obstacleGrid.length; i++) {
			for(int j = 0; j < obstacleGrid[i].length; j++) {
				if (obstacleGrid[i][j] == 1) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	private void printTwoArray(int[][] map) {
		for(int [] i : map) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void main(String[] args) {
		UniquePathsWithObstacles s = new UniquePathsWithObstacles();
		int[][] map01 = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(s.uniquePathsWithObstacles(map01));
		map01 = new int[][]{{0,1,0}};
		System.out.println(s.uniquePathsWithObstacles(map01));
		map01 = new int[][]{{1,0},{0,0}};
		System.out.println(s.uniquePathsWithObstacles(map01));
	}
}
