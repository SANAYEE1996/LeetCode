package medium;

import java.util.Arrays;

public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
        int answer = 0;
        int[][] map = new int[matrix.length][matrix[0].length];
        copyMapCharToInteger(matrix, map);
		fillMap(map);
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				answer = Math.max(answer, map[i][j]);
			}
		}
		print(map);
		return answer;
    }
	
	private void copyMapCharToInteger(char[][] matrix, int[][] map) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				map[i][j] = matrix[i][j] - 48;
			}
		}
	}
	
	private void fillMap(int[][] map){
		for(int i = 1; i < map.length; i++) {
			for(int j = 1; j < map[i].length; j++) {
				if(isNotAllZero(i, j, map)) {
					map[i][j] = getSquareArea(i, j, map);
				}
			}
		}
	}
	
	private boolean isNotAllZero(int i, int j, int[][] map) {
		return map[i-1][j-1] != 0 && map[i-1][j] != 0 && map[i][j-1] != 0 && map[i][j] != 0;
	}
	
	private int getSquareArea(int i, int j, int[][] map) {
		int min = (int)Math.sqrt(Math.min(map[i-1][j], Math.min(map[i][j-1], map[i-1][j-1])));
		return (int)Math.pow(min+1, 2);
	}
	
	private void print(int[][] map) {
		for(int[] i : map) {
			System.out.println(Arrays.toString(i));
		}
	}
	
}
