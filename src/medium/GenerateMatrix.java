package medium;

public class GenerateMatrix {
	public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        goRight(matrix, 0, 0, 1);
        printMatrix(matrix);
        return matrix;
    }
	
	private void goRight(int[][] matrix, int x, int y, int value) {
		if(value > matrix.length*matrix.length) {
			return;
		}
		for(; y < matrix.length; y++) {
			matrix[x][y] = value;
			if(y < matrix.length-1 && matrix[x][y+1] != 0) {
				goDown(matrix, x+1, y, value+1);
				return;
			}
			value++;
		}
		goDown(matrix, x+1, y-1, value);
	}
	
	private void goDown(int[][] matrix, int x, int y, int value) {
		if(value > matrix.length*matrix.length) {
			return;
		}
		for(; x < matrix.length; x++) {
			matrix[x][y] = value;
			if(x < matrix.length-1 && matrix[x+1][y] != 0) {
				goLeft(matrix, x, y-1, value+1);
				return;
			}
			value++;
		}
		goLeft(matrix, x-1, y-1, value);
	}
	
	private void goLeft(int[][] matrix, int x, int y, int value) {
		if(value > matrix.length*matrix.length) {
			return;
		}
		for(; y >= 0; y--) {
			matrix[x][y] = value;
			if(y > 0 && matrix[x][y-1] != 0) {
				goUp(matrix, x-1, y, value+1);
				return;
			}
			value++;
		}
		goUp(matrix, x-1, y+1, value);
	}
	
	private void goUp(int[][] matrix, int x, int y, int value) {
		if(value > matrix.length*matrix.length) {
			return;
		}
		for(; x >= 0; x--) {
			matrix[x][y] = value;
			if(x > 0 && matrix[x-1][y] != 0) {
				goRight(matrix, x, y+1, value+1);
				return;
			}
			value++;
		}
		goRight(matrix, x+1, y+1, value);
	}
	
	private void printMatrix(int[][] matrix) {
		System.out.println();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		GenerateMatrix s = new GenerateMatrix();
		for(int i = 1; i <= 20; i++) {
			System.out.println(s.generateMatrix(i));
		}
	}
}
