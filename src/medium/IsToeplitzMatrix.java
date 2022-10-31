package medium;

public class IsToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
        int beforeIndex;
        int beforeValue;
        for(int i = 0; i < matrix[0].length; i++){
            beforeIndex = i;
            beforeValue = matrix[0][i];
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] != beforeValue){
                    return false;
                }
                beforeValue = matrix[j][i];
                i++;
                if(i == matrix[0].length){
                    break;
                }
            }
            i = beforeIndex;
        }
        for(int i = 1; i < matrix.length; i++){
            beforeIndex = i;
            beforeValue = matrix[i][0];
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] != beforeValue) {
                	return false;
                }
                beforeValue = matrix[i][j];
                i++;
                if(i == matrix.length) {
                	break;
                }
            }
            i = beforeIndex;
        }
        
        return true;
    }
}
