package easy;

public class LargestAltitude {
	public int largestAltitude(int[] gain) {
		int before = 0;
		int max = 0;
		for(int i : gain){
			before += i;
			max = Math.max(max,before);
		}
		return max;
	}
}
