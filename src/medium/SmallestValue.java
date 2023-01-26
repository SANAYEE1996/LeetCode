package medium;

public class SmallestValue {
	
	private int sum;
	
	public int smallestValue(int n) {
		sum = 0;
		gogo(n);
		while(true) {
			if(sum == n) {
				break;
			}
			n = sum;
			sum = 0;
			gogo(n);
		}
        return sum;
    }
	
	private void gogo(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				while(n % i == 0) {
					n /= i;
					sum += i;
				}
				gogo(n);
				return;
			}
		}
		if(n != 1) {
			sum += n;
		}
	}
	
}
