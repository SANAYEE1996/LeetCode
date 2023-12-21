package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaxWidthOfVerticalArea {
	
	/**
	 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points
	 * */
	
	public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] a, int[] b) {
        		return a[0] - b[0];
        	}
        });
        int max = 0;
        int before = points[0][0];
        for(int[] a : points) {
        	max = Math.max(max, a[0] - before);
        	before = a[0];
        }
		return max;
    }
}
