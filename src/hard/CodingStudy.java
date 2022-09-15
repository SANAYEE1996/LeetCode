package hard;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println("가능한 리스트");
        print(possibleList);
        System.out.println("불 가능한 리스트");
        print(impossibleList);
        return answer;
    }
	
	void print(ArrayList<int[]> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(Arrays.toString(list.get(i))+ " ");
		}
		System.out.println();
	}
}
