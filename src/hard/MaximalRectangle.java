package hard;

import java.util.Arrays;

public class MaximalRectangle {
	
	/**
	 * https://leetcode.com/problems/maximal-rectangle/
	 * rows == matrix.length
	 * cols == matrix[i].length
	 * 1 <= row, cols <= 200
	 * matrix[i][j] is '0' or '1'
	 * */
	
	public int maximalRectangle(char[][] matrix) {
		System.out.println();
		int[][][] map = new int[matrix.length][matrix[0].length][2];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == '0') continue;
				int sum = 0;
				for(; j < matrix[i].length; j++){
					if(matrix[i][j] == '0') { j--; break;}
					sum++;
					map[i][j][0] = sum;
				}
			}
		}
		for(int j = 0; j < matrix[0].length; j++){
			for(int i = 0; i < matrix.length; i++){
				if(matrix[i][j] == '0') continue;
				int sum = 0;
				for(; i < matrix.length; i++){
					if(matrix[i][j] == '0') { i--; break;}
					sum++;
					map[i][j][1] = sum;
				}
			}
		}
		print(map);
		int[][] arr = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = map[i][0][1];
		}
		for(int i = 0; i < arr[0].length; i++) {
			arr[0][i] = map[0][i][0];
		}
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				if(!notZeroMe(map[i][j])) continue;
				if(!isNotZeroHere(map[i-1][j],map[i][j-1],map[i-1][j-1])) {
					arr[i][j] = Math.max(map[i][j][0],map[i][j][1]);
					continue;
				}
				arr[i][j] = getMin(map,i,j);
			}
		}
		System.out.println();
		
		print(arr);
		int maxValue = 0;
		for(int[] i : arr) {
			for(int j : i) {
				maxValue = Math.max(maxValue, j);
			}
		}
		return maxValue;
	}

	private void print(int[][][] map){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(Arrays.toString(map[i][j]) + " ");
			}
			System.out.println();
		}
	}
	
	private void print(int[][] map) {
		for(int[] i : map) System.out.println(Arrays.toString(i));
	}
	
	private boolean isNotZeroHere(int[] a, int[] b, int[] c) {
		return (a[0] != 0 && a[1] != 0) && (b[0] != 0 && b[1] != 0) && (c[0] != 0 && c[1] != 0);
	}
	
	private boolean notZeroMe(int[] a) {
		return a[0] != 0 && a[1] != 0;
	}
	
	private int getMin(int[][][] map, int i, int j) {
		int x = getMin(map[i][j][0],map[i-1][j][0],map[i][j-1][0],map[i-1][j-1][0]);
		int y = getMin(map[i][j][1],map[i-1][j][1],map[i][j-1][1],map[i-1][j-1][1]);
		return (x+1)*(y+1);
	}
	
	private int getMin(int a, int b, int c, int d) {
		return Math.min(a, Math.min(b, Math.min(c, d)));
	}

}
