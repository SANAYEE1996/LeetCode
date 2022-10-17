package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Merge {
	public int[][] merge(int[][] intervals) {
		twoArraySort(intervals);
		printArray(intervals);
		ArrayList<int[]> answerList = new ArrayList<>();
		int[] start;
		int[] end;
		for(int i = 0; i < intervals.length; i++) {
			if(i < intervals.length-1 && !isTwoArrayMix(intervals[i], intervals[i+1])) {
				answerList.add(intervals[i]);
				continue;
			}
			start = intervals[i];
			for(; i < intervals.length-1; i++) {
				if(!isTwoArrayMix(intervals[i], intervals[i+1]) && !isTwoArrayMix(start, intervals[i+1])) {
					break;
				}
			}
			end = intervals[i];
			System.out.println("before : " +Arrays.toString(start));
			System.out.println("after : " +Arrays.toString(end));
			answerList.add(getMaxMinArray(start, end));
		}
		System.out.print("list : ");
		printArrayList(answerList);
        return getArrayFromList(answerList);
    }
	
	private void twoArraySort(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>(){
			@Override
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0]) {
					return a[1]- b[1];
				}
				return a[0] - b[0];
			}
		});
	}
	
	private boolean isTwoArrayMix(int[] a, int[] b) {
		if( (b[0] <= a[0] && a[0] <= b[1]) ||
			(b[0] <= a[1] && a[1] <= b[1]) ||
			(a[0] <= b[0] && b[0] <= a[1]) ||
			(a[0] <= b[1] && b[1] <= a[1]) ){
			return true;
		}
		return false;
	}
	
	private int[] getMaxMinArray(int[] start, int[] end) {
		return new int[] {Math.min(start[0], end[0]), Math.max(start[1], end[1])};
	}
	
	private int[][] getArrayFromList(ArrayList<int[]> answerList){
		int[][] answer = new int[answerList.size()][2];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}
	
	private void printArray(int[][] intervals) {
		for(int[] i : intervals) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	private void printArrayList(ArrayList<int[]> originList) {
		for(int[] i : originList) {
			System.out.print(Arrays.toString(i) + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Merge s = new Merge();
		int[][] map = {{15,18},{2,6},{8,10},{1,3}};
		System.out.println(s.merge(map));
		map = new int[][] {{15,18},{2,6},{2,5},{1,3}};
		System.out.println(s.merge(map));
		map = new int[][] {{15,18},{16,24},{2,6},{2,5},{1,3}};
		System.out.println(s.merge(map));
		map = new int[][] {{1,1}};
		System.out.println(s.merge(map));
		map = new int[][] {{0,0},{0,0},{0,0}};
		System.out.println(s.merge(map));
		map = new int[][] {{1,4},{2,3},{0,0}};
		System.out.println(s.merge(map));
		map = new int[][] {{2,3},{4,5},{6,7},{8,9},{1,10}};
		System.out.println(s.merge(map));
		map = new int[][] {{2,3},{4,5},{11,29},{6,7},{8,9},{1,10}};
		System.out.println(s.merge(map));
		
	}
}
