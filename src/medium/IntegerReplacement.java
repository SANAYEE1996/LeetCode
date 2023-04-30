package medium;

public class IntegerReplacement {
	
	private int minValue;
	
	public int integerReplacement(int n) {
		minValue = Integer.MAX_VALUE;
		gogo((long)n, 0);
		return minValue;
	}
	
	private void gogo(long value, int count) {
		if((long)value == 1) {
			minValue = Math.min(minValue, count);
			return;
		}
		if((long)value % 2 == 0) {
			gogo((long)value/2, count+1);
			return;
		}
		gogo((long)value+1, count+1);
		gogo((long)value-1, count+1);
	}
}
