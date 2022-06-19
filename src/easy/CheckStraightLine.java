package easy;

import java.util.Arrays;
import java.util.Comparator;

public class CheckStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		//정렬
		ArraySort(coordinates);
		int inclination = getIncline(coordinates);
		for(int i = 1; i < coordinates.length-1; i++) {
			if(getIncline(coordinates, i) != inclination) {
				return false;
			}
		}
		return true;
    }
	
	public void ArraySort(int[][] coordinates) {
		Arrays.sort(coordinates, new Comparator<int[]>() {
			@Override
			public int compare(int[] before, int[] after) {
				if(before[0] == after[0]) return before[1] - after[1];
				return before[0] - after[0];
			}
			
		});
		//for(int[] i : coordinates) System.out.println(Arrays.toString(i));
	}
	
	
	public int getIncline(int[][] coordinates) {
		int x = coordinates[1][0] - coordinates[0][0];
		int y = coordinates[1][1] - coordinates[0][1];
		if (x == 0) return 10000000;
		return y/x;
	}
	
	public int getIncline(int[][] coordinates, int i) {
		
		int x = coordinates[i+1][0] - coordinates[i][0];
		int y = coordinates[i+1][1] - coordinates[i][1];
		if (x == 0) return 10000000;
		return y/x;
	}
}
