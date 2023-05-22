package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Merge {
	public int[][] merge(int[][] intervals) {
		twoArraySort(intervals);
		printArray(intervals);
		ArrayList<int[]> answerList = new ArrayList<>();
		answerList.add(new int[] {intervals[0][0], intervals[0][1]});
		int[] start;
		int lastIndex = 0;
		for(int[] part : intervals) {
			lastIndex = answerList.size()-1;
			start = answerList.get(lastIndex);
			if(start[1] < part[0]) {
				answerList.add(part.clone());
				continue;
			}
			answerList.set(lastIndex, new int[] {getMinValue(part,start), getMaxValue(part,start)});
		}
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
	
	private int getMinValue(int[] a, int[] b) {
		if(a.length != 2 && b.length != 2) return 0;
		return getMinValue(a[0],a[1], b[0], b[1]);
	}
	
	private int getMinValue(int a, int b, int c, int d) {
		return Math.min(a, Math.min(b, Math.min(c, d)));
	}
	
	private int getMaxValue(int[] a, int[] b) {
		if(a.length != 2 && b.length != 2) return 0;
		return getMaxValue(a[0],a[1], b[0], b[1]);
	}
	
	private int getMaxValue(int a, int b, int c, int d) {
		return Math.max(a, Math.max(b, Math.max(c, d)));
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
