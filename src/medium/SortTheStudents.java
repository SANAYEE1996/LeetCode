package medium;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheStudents {
	public int[][] sortTheStudents(int[][] score, int k) {
        ArrayList<Integer> numList = new ArrayList<>();;
        
        for(int i = 0; i <= k; i++) {
        	for(int j = 0; j < score.length; j++) {
        		numList.add(score[j][i]);
        	}
        	Collections.sort(numList,Collections.reverseOrder());
        	for(int j = 0; j < score.length; j++) {
        		score[j][i] = numList.get(j);
        	}
        	numList.clear();
        }
        return score;
    }
}
