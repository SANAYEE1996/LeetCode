package medium;

import java.util.ArrayList;
import java.util.Collections;


public class NumSquares {
	
	private ArrayList<Integer> list;
	
	public NumSquares() {
		list = new ArrayList<>();
	}
	
	public int numSquares(int n) {
		if(n < 4) {
			return n;
		}
//		System.out.println("input : " +n);
		gogo(n, 0);
//		System.out.println(list);
		return Collections.min(list);
	}
	
	private void gogo(int n, int count) {
		if(n < 4) {
			list.add(count + n);
			return;
		}
		
		int cnt = count;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			cnt = count;
			gogo(n - (int)Math.pow(i, 2), cnt+1);
		}
		
	}
}
