package medium;

import java.util.ArrayList;
import java.util.List;

public class ConstructProductMatrix {
	
	/**
	 * https://leetcode.com/problems/construct-product-matrix/
	 * */
	
	public int[][] constructProductMatrix(int[][] grid) {
		List<Integer> numList = new ArrayList<>();
		long totalSum = 1;
		for(int[] i : grid){
			for(int j : i){
				totalSum = ((totalSum%12345)*(j%12345))%12345;
				numList.add(j);
			}
		}
		
		int[][] answer = new int[grid.length][grid[0].length];
		
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < answer[i].length; j++){
				answer[i][j] = (int)totalSum/numList.get(i*answer.length + j);
			}
		}
		
		return answer;
	}
}
