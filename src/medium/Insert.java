package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		ArrayList<int[]> containList = new ArrayList<>();
		ArrayList<int[]> originList = new ArrayList<>();
		for(int[] i : intervals) {
			if((i[0] <= newInterval[0] && newInterval[0] <= i[1]) || 
			   (i[0] <= newInterval[1] && newInterval[1] <= i[1]) ) {
				containList.add(i);
			}
			originList.add(i);
		}
		int[] inputArray = new int[2];
		inputArray[0] = (newInterval[0] < containList.get(0)[0]) ? newInterval[0] : containList.get(0)[0];
		inputArray[1] = (newInterval[1] < containList.get(containList.size()-1)[1]) ? newInterval[1] : containList.get(containList.size()-1)[1];
        System.out.println(Arrays.toString(inputArray));
		return new int[][] {};
    }
}
