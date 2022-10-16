package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Insert {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		System.out.println("input : " + Arrays.toString(newInterval));
		printArray(intervals);
		ArrayList<int[]> answerList = new ArrayList<>();
		int[] start = new int[2];
		int[] end = new int[2];
		boolean isHere = false;
		for(int i = 0; i < intervals.length; i++) {
			if(intervals[i][0] > newInterval[1] || intervals[i][1] < newInterval[0]) {
				answerList.add(intervals[i]);
				continue;
			}
			isHere = true;
			start = intervals[i];
			for(;i< intervals.length; i++) {
				if(intervals[i][0] > newInterval[1] || intervals[i][1] < newInterval[0]) {
					break;
				}
			}
			i = i > 0 ? i - 1 : 0;
			end = intervals[i];
			answerList.add(getOptimizeArray(start, end, newInterval));
		}
		if(!isHere) {
			answerList.add(newInterval);
			sortList(answerList);
		}
		System.out.print("answer List : ");
		printArrayList(answerList);
		return getArrayFromList(answerList);
    }
	
	private void sortList(ArrayList<int[]> answerList) {
		Collections.sort(answerList, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
	}
	
	private int[][] getArrayFromList(ArrayList<int[]> answerList){
		int[][] answer = new int[answerList.size()][2];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}
	
	private int[] getOptimizeArray(int[] start, int[] end, int[] newInterval) {
		int min = Math.min(start[0], Math.min(end[0], newInterval[0]));
		int max = Math.max(start[1], Math.max(end[1], newInterval[1]));
		return new int[] {min,max};
	}
	
	private void printArray(int[][] intervals) {
		for(int[] i : intervals) {
			System.out.print(Arrays.toString(i) + " ");
		}
		System.out.println();
	}
	
	private void printArrayList(ArrayList<int[]> originList) {
		for(int[] i : originList) {
			System.out.print(Arrays.toString(i) + " ");
		}
		System.out.println();
	}
	
}
