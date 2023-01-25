package medium;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStudents {
	public int[][] sortTheStudents(int[][] score, int k) {
		
        int[][] sortMap = new int[score.length][2];
        for(int i = 0; i < score.length; i++) {
        	sortMap[i][0] = i;
        	sortMap[i][1] = score[i][k];
        }
        Arrays.sort(sortMap, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] a, int[] b) {
        		return b[1] - a[1];
        	}
        });
        
        int[][] answerMap = new int[score.length][score[0].length];
        
        for(int i = 0; i < answerMap.length; i++) {
        	for(int j = 0; j < answerMap[i].length; j++) {
        		answerMap[i][j] = score[sortMap[i][0]][j];
        	}
        }
        
        return answerMap;
    }
}
