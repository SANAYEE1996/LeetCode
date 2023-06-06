package easy;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
	public boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int differ = arr[1] - arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(differ != (arr[i] - arr[i-1])) return false;
		}
		return true;
    }
}
