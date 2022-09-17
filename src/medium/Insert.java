package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		if(intervals.length == 0) {
			return new int[][] {{newInterval[0],newInterval[1]}};
		}
		ArrayList<int[]> containList = new ArrayList<>();
		ArrayList<int[]> originList = new ArrayList<>();
		for(int[] i : intervals) {
			if((i[0] <= newInterval[0] && newInterval[0] <= i[1]) || 
			   (i[0] <= newInterval[1] && newInterval[1] <= i[1]) ||
			   (newInterval[0] <= i[0] && i[1] <= newInterval[1])) {
				containList.add(i);
				continue;
			}
			originList.add(i);
		}
		int[] inputArray = new int[2];
		inputArray[0] = (newInterval[0] < containList.get(0)[0]) ? newInterval[0] : containList.get(0)[0];
		inputArray[1] = (newInterval[1] < containList.get(containList.size()-1)[1]) ? containList.get(containList.size()-1)[1] : newInterval[1];
        //System.out.println(Arrays.toString(inputArray));
        for(int i = 0; i < originList.size(); i++) {
        	if(inputArray[1] < originList.get(i)[0]) {
        		originList.add(i, inputArray);
        		break;
        	}
        }
        printArrayList(originList);
        int[][] answer = new int[originList.size()][2];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = originList.get(i);
        }
		return answer;
    }
	
	void printArrayList(ArrayList<int[]> originList) {
		for(int[] i : originList) {
			System.out.print(Arrays.toString(i) + " ");
		}
	}
}
