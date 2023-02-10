package medium;

import java.util.Arrays;

public class MaxDistance {
	public int maxDistance(int[][] grid) {
		int answer = 0;
		int length = grid.length;
		int[][] map = new int[length][length];
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(grid[i][j] == 1) {continue;}
				fillCross(map, grid, i, j);
				if(map[i][j] == 1) {continue;}
				fillAxe(map, grid, i, j);
				if(map[i][j] == 2) {continue;}
				fillCross(map, i, j);
			}
		}
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(map[i][j] == 0) {continue;}
				fillCross(map, grid, i, j);
				if(map[i][j] == 1) {continue;}
				fillAxe(map, grid, i, j);
				if(map[i][j] == 2) {continue;}
				fillCross(map, i, j);
			}
		}
		
		for(int[] i : map) {
			System.out.println(Arrays.toString(i));
		}
		
        return answer;
    }
	
	private void fillCross(int[][] map, int[][] grid, int i, int j) {
		if(isUpOne(grid, i, j) || isDownOne(grid, i, j) || isLeftOne(grid, i, j) || isRightOne(grid, i, j)) {
			map[i][j] = 1;
		}
	}
	
	private void fillAxe(int[][] map, int[][] grid, int i, int j) {
		if(upright(grid, i, j) || downleft(grid, i, j) || downright(grid, i, j) || upleft(grid, i, j)) {
			map[i][j] = 2;
		}
	}
	
	private void fillCross(int[][] map, int i, int j) {
		int minValue = Integer.MAX_VALUE;
		if(i > 0 && map[i-1][j] != 0) {
			minValue = Math.min(minValue, map[i-1][j]);
		}
		if(j > 0 && map[i][j-1] != 0) {
			minValue = Math.min(minValue, map[i][j-1]);
		}
		if(i < map.length-1 && map[i+1][j] != 0) {
			minValue = Math.min(minValue, map[i+1][j]);
		}
		if(j < map.length-1 && map[i][j+1] != 0) {
			minValue = Math.min(minValue, map[i][j+1]);
		}
		map[i][j] = minValue+1;
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
	
	private boolean upright(int[][] grid, int i, int j) {
		return (i > 0 && j < grid.length-1 && grid[i-1][j+1] == 1);
	}
	
	private boolean downright(int[][] grid, int i, int j) {
		return (i < grid.length-1 && j < grid.length-1 && grid[i+1][j+1] == 1);
	}
	
	private boolean downleft(int[][] grid, int i, int j) {
		return (i < grid.length-1 && j > 0 && grid[i+1][j-1] == 1);
	}
	
	private boolean upleft(int[][] grid, int i, int j) {
		return (i > 0 && j > 0 && grid[i-1][j-1] == 1);
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
