package medium;

import java.util.Arrays;

public class MaxDistance {
	public int maxDistance(int[][] grid) {
		int answer = 0;
		int length = grid.length;
		int[][] map = new int[length][length];
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(grid[i][j] == 1) {
					goBack(map, grid, i, j-1);
					gogo(map, grid, i, j+1);
					break;					
				}
			}
		}
		
		for(int j = 0; j < length; j++) {
			for(int i = 0; i < length; i++) {
				if(grid[i][j] == 1) {
					goUpBack(map, grid, i-1, j);
					goDowngo(map, grid, i+1, j);
					break;					
				}
			}
		}
		for(int[] i : map) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println("=============================================");
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(grid[i][j] != 1) {
					fillCross(map, i, j);
				}
			}
		}
		
		for(int[] i : map) {
			System.out.println(Arrays.toString(i));
		}
		
        return answer;
    }
	
	private void goBack(int[][] map, int[][] grid, int i, int j) {
		int value = 0;
		for(; j >= 0; j--) {
			if(isUpOne(grid, i, j) || isDownOne(grid, i, j)) {
				value = 1;
			}
			else {
				value++;
			}
			map[i][j] = value;
		}
	}
	
	private void goUpBack(int[][] map, int[][] grid, int i, int j) {
		int value = 0;
		for(; i >= 0; i--) {
			if(isLeftOne(grid, i, j) || isRightOne(grid, i, j)) {
				value = 1;
			}
			else {
				value++;
			}
			map[i][j] = value;
		}
	}
	
	private void gogo(int[][] map, int[][] grid, int i, int j) {
		int value = 0;
		for(; j < map.length; j++) {
			if(isRightOne(grid, i, j)) {
				map[i][j] = 1;
				gogo(map, grid, i, j+2);
				break;
			}
			if(isUpOne(grid, i, j) || isDownOne(grid, i, j)) {
				value = 1;
			}
			else {
				value++;
			}
			map[i][j] = value;			
		}
	}
	
	private void goDowngo(int[][] map, int[][] grid, int i, int j) {
		int value = 0;
		for(; i < map.length; i++) {
			if(isDownOne(grid, i, j)) {
				map[i][j] = 1;
				goDowngo(map, grid, i+2, j);
				break;
			}
			if(isLeftOne(grid, i, j) || isRightOne(grid, i, j)) {
				value = 1;
			}
			else {
				value++;
			}
			map[i][j] = value;			
		}
	}
	
	private void fillCross(int[][] map, int i, int j) {
		int minValue = Integer.MAX_VALUE;
		if(i > 0 ) {
			minValue = Math.min(minValue, map[i-1][j]);
		}
		if(j > 0 ) {
			minValue = Math.min(minValue, map[i][j-1]);
		}
		if(i < map.length-1) {
			minValue = Math.min(minValue, map[i+1][j]);
		}
		if(j < map.length-1) {
			minValue = Math.min(minValue, map[i][j+1]);
		}
		if(minValue != Integer.MAX_VALUE) {
			map[i][j] = minValue+1;
		}
	}
	
	private boolean isUpOne(int[][] grid, int i, int j) {
		return (i > 0 && grid[i-1][j] == 1);
	}
	
	private boolean isDownOne(int[][] grid, int i, int j) {
		return (i < grid.length-1 && grid[i+1][j] == 1);
	}
	
	private boolean isLeftOne(int[][] grid, int i, int j) {
		return (j > 0 && grid[i][j-1] == 1);
	}
	
	private boolean isRightOne(int[][] grid, int i, int j) {
		return (j < grid.length-1 && grid[i][j+1] == 1);
	}
	
	
	public static void main(String[] args) {
		int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
		MaxDistance s = new MaxDistance();
		System.out.println(s.maxDistance(grid));
		grid = new int[][] {{1,0,0},{0,0,0},{0,0,0}};
		System.out.println(s.maxDistance(grid));
		grid = new int[][] {{1,0,0,0,0,1,0,1,1,0},
							{0,1,0,1,1,0,0,0,0,1},
							{0,0,0,0,0,0,0,0,0,1},
							{0,0,0,0,1,0,0,0,1,0},
							{0,0,1,0,1,0,0,0,0,0},
							{0,0,0,0,0,0,1,0,0,0},
							{0,0,1,1,1,0,0,0,0,0},
							{0,0,0,0,0,0,1,0,0,0},
							{0,0,0,1,0,0,0,0,1,0},
							{0,0,0,0,0,0,0,0,0,0}};
		System.out.println(s.maxDistance(grid));
	}
}
