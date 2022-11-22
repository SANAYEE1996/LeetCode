package medium;

import java.util.ArrayList;


public class NumSquares {
	
	private ArrayList<Integer> list;
	
	public NumSquares() {
		list = new ArrayList<>();
	}
	
	public int numSquares(int n) {
		gogo(n);
		System.out.println(list);
		return 0;
	}
	
	private int gogo(int n) {
		if(n < 4) return n;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			list.add(gogo(n - (int)Math.pow(i, 2)));
		}
		
		return 0;
	}
}
