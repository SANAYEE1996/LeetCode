package easy;

public class NearestValidPoint {
	public int nearestValidPoint(int x, int y, int[][] points) {
		int min = Integer.MAX_VALUE;
        for(int[] i : points) {
        	if(i[0] == x || i[1] == y) {
        		min = Math.min(min, Math.abs(i[0] - x) + Math.abs(i[1] - y));
        	}
        }
		return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
