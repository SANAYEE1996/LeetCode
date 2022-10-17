package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetZeroes {
	public void setZeroes(int[][] matrix) {
        ArrayList<int[]> originZeroPointList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> zeroAreaList = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
        	for(int j = 0; j < matrix[i].length; j++) {
        		if(matrix[i][j] == 0) {
        			originZeroPointList.add(new int[] {i,j});
        		}
        	}
        }
        for(int[] exam : originZeroPointList) {
        	ArrayList<Integer> examXList = new ArrayList<>();
        	examXList.add(exam[0]);
        	examXList.add(0);
        	examXList.add(exam[0]);
        	examXList.add(matrix[0].length-1);
        	if(!zeroAreaList.contains(examXList)) {
        		zeroAreaList.add(examXList);
        	}
        	
        	ArrayList<Integer> examYList = new ArrayList<>();
        	examYList.add(0);
        	examYList.add(exam[1]);
        	examYList.add(matrix.length-1);
        	examYList.add(exam[1]);
        	if(!zeroAreaList.contains(examYList)) {
        		zeroAreaList.add(examYList);
        	}
        }
        
        for(ArrayList<Integer> examList : zeroAreaList) {
        	for(int i = examList.get(0); i <= examList.get(2); i++) {
        		for(int j = examList.get(1); j <= examList.get(3); j++) {
        			matrix[i][j] = 0;
        		}
        	}
        }
    }
	/*
	 * 0,1,2,0],[3,4,5,2],[1,3,1,5
	 * */
	public static void main(String[] args) {
		SetZeroes s = new SetZeroes();
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		s.setZeroes(matrix);
		for(int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
		matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
		s.setZeroes(matrix);
		for(int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
	}
}
