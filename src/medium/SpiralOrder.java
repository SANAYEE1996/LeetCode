package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	
	boolean[][] isVisitedMap;
	List<Integer> answerList;
	
	public List<Integer> spiralOrder(int[][] matrix) {
		answerList = new ArrayList<>();
		isVisitedMap = new boolean[matrix.length][matrix[0].length];
		
		
		return answerList;
    }
	
	private void goRight(int[][] map, boolean[][] visitedMap, int i, int j){
		for(; j < map[i].length; j++){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		goDown(map,visitedMap,i+1,j-1);
	}

	private void goDown(int[][] map, boolean[][] visitedMap, int i, int j){
		for(; i < map.length; i++){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		goLeft(map,visitedMap,i-1,j-1);
	}

	private void goLeft(int[][] map, boolean[][] visitedMap, int i, int j){
		for(; j >= 0; j--){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		goUp(map,visitedMap,i-1,j+1);
	}

	private void goUp(int[][] map, boolean[][] visitedMap, int i, int j){
		for(; i >= 0; i--){
			if(visitedMap[i][j]){
				break;
			}
			answerList.add(map[i][j]);
			visitedMap[i][j] = true;
		}
		goRight(map,visitedMap,i+1,j+1);
	}
}
