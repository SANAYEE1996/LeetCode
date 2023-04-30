package medium;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerReplacement {
	
	public int integerReplacement(int n) {
		ArrayList<Integer> countList = new ArrayList<>();
		gogo(countList, (long)n, 0);
		return Collections.min(countList);
	}
	
	private void gogo(ArrayList<Integer> countList, long value, int count) {
		if((long)value == 1) {
			countList.add(count);
			return;
		}
		if((long)value % 2 == 0) {
			gogo(countList, (long)value/2, count+1);
			return;
		}
		gogo(countList, (long)value+1, count+1);
		gogo(countList, (long)value-1, count+1);
	}
}
