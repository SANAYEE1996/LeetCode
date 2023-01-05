package medium;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {
	public int findMinArrowShots(int[][] points) {
		arrayTwoMap(points);
		int[] beforeRange = points[0].clone();
		int answer = 1;
		for(int i = 1; i < points.length; i++) {
			if(beforeRange[1] < points[i][0]) {
				answer++;
				beforeRange = points[i].clone();
			}
			else {
				beforeRange[0] = Math.max(beforeRange[0], points[i][0]);
				beforeRange[1] = Math.min(beforeRange[1], points[i][1]);
			}
		}
		return answer;
    }
	
	private void arrayTwoMap(int[][] points) {
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] > o2[0]) {
					return 1;
				}
				else if(o1[0] < o2[0]) {
					return -1;
				}
				else {
					if(o1[1] > o2[1]) {
						return 1;
					}
					else if(o1[1] < o2[1]) {
						return -1;
					}
					else {
						return 0;
					}
				}
			}
		});
	}
	
}
