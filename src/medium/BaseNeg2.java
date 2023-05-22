package medium;

public class BaseNeg2 {
	public String baseNeg2(int n) {

		StringBuilder sb = new StringBuilder();
		
		while(n != 0){
			if(n < 0){
				n = -n;
				if(n%2 == 1) {
					n += 1;
					sb.append(1);
					n /= 2;
					continue;
				}
				sb.append(0);
				n /= 2;
				continue;
			}
			sb.append(n%-2);
			n = n/-2;
		}
		
		return sb.reverse().toString();
	}
}
