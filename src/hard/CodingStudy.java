package hard;

import java.util.ArrayList;

/*
 * 
 * 10	10	[[10,15,2,1,2],[20,20,3,3,4]]	15
	0	0	[[0,0,2,1,2],[4,5,3,1,2],[4,11,4,0,2],[10,4,0,4,2]]	13
 * */


public class CodingStudy {
	public int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        ArrayList<int[]> possibleList = new ArrayList<>();
        ArrayList<int[]> impossibleList = new ArrayList<>();
        for(int[] i : problems) {
        	if(alp >= i[0] && cop >= i[1]) {
        		possibleList.add(i);
        		continue;
        	}
        	impossibleList.add(i);
        }
        
        return answer;
    }
}
