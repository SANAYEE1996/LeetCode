package medium;

public class RotateMatrix {
	public void rotate(int[][] matrix) {
        int[][] exam = new int[matrix.length][matrix.length];
        int x = 0, y = 0;
        for(int j = 0; j < matrix.length; j++){
            y = 0;
            for(int i = matrix.length-1; i >= 0; i--){
                exam[x][y] = matrix[i][j];
                y++;
            }
            x++;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = exam[i][j];
            }
        }
    }
}
