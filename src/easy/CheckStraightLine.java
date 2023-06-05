package easy;

public class CheckStraightLine {
	
	public boolean checkStraightLine(int[][] coordinates) {
		double inclination = getIncline(coordinates[0], coordinates[1]);
		for(int i = 1; i < coordinates.length-1; i++) {
			if(getIncline(coordinates[i], coordinates[i+1]) != inclination) {
				return false;
			}
		}
		return true;
	}
	
	private double getIncline(int[] a, int[] b) {
		if(a[0] == b[0]) return 10000000;
		if(a[0] < b[0]) return (double)(b[1] - a[1]) / (b[0] - a[0]);
		return (double)(a[1] - b[1]) / (a[0] - b[0]);
	}
}
