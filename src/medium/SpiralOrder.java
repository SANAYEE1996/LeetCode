package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	
	private boolean[][] visitedMap;
	private List<Integer> answerList;
	
	public List<Integer> spiralOrder(int[][] matrix) {
		answerList = new ArrayList<>();
		visitedMap = new boolean[matrix.length][matrix[0].length];
		goRight(matrix, 0, 0);
		return answerList;
    }
	
	private void goRight(int[][] map, int i, int j){
		for(; j < map[i].length; j++){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		try {
			if(!visitedMap[i+1][j-1]) {
				goDown(map,i+1,j-1);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return;
		}
	}

	private void goDown(int[][] map, int i, int j){
		for(; i < map.length; i++){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		try {
			if(!visitedMap[i-1][j-1]) {
				goLeft(map,i-1,j-1);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return;
		}
	}

	private void goLeft(int[][] map, int i, int j){
		for(; j >= 0; j--){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		try {
			if(!visitedMap[i-1][j+1]) {
				goUp(map,i-1,j+1);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return;
		}
	}

	private void goUp(int[][] map, int i, int j){
		for(; i >= 0; i--){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		try {
			if(!visitedMap[i+1][j+1]) {
				goRight(map,i+1,j+1);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return;
		}
	}
}
