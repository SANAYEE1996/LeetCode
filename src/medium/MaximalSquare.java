package medium;

import java.util.Arrays;

public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
        int answer = 0;
		fillMap(matrix);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				answer = Math.max(answer, matrix[i][j]-48);
			}
		}
		print(matrix);
		return answer;
    }
	
	private void fillMap(char[][] map){
		for(int i = 1; i < map.length; i++) {
			for(int j = 1; j < map[i].length; j++) {
				if(map[i][j] != '0') {
					if(map[i-1][j] == map[i][j-1]) {
						map[i][j] = (char)((int)Math.pow((Math.sqrt(map[i-1][j]-48) + 1), 2) + '0');
					}
					else {
						map[i][j] = (char)((int)(Math.pow(Math.sqrt(Math.min(map[i-1][j]-48, map[i][j-1]-48))+1, 2)) + '0');
					}
				}
			}
		}
	}
	
	private void print(char[][] map) {
		for(char[] i : map) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void main(String[] args) {
		char[][] matrix = { {'1','1','1','1','0'},
							{'1','1','1','1','0'},
							{'1','1','1','1','1'},
							{'1','1','1','1','1'},
							{'0','0','1','1','1'}};
		
		MaximalSquare s = new MaximalSquare();
		
		System.out.println(s.maximalSquare(matrix));
	}
}
