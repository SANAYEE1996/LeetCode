package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	
	boolean[][] isVisitedMap;
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> answerList = new ArrayList<>();
		isVisitedMap = new boolean[matrix.length][matrix[0].length];
		
		
		return answerList;
    }
	
	void goRight(int[][] matrix, List<Integer> answerList, int[] coordinates) {
		int i = coordinates[0];
		int j = coordinates[1];
		answerList.add(matrix[i][j]);
		if(isVisitedMap[i][j+1]) {
			return;
		}
		for(; j < matrix[0].length; j++) {
			answerList.add(matrix[i][j]);
			isVisitedMap[i][j] = true;
			if(j == matrix[0].length-1 || isVisitedMap[i][j+1]) {
				break;
			}
		}
		coordinates[0] = i+1;
		coordinates[1] = j;
	}
}
