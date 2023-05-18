package medium;

import java.util.Arrays;

public class ValidSquare {
	
	/**
	 * 
	 * https://leetcode.com/problems/valid-square/
	 * 
	 * 
	 * */
	
	public boolean validSquare(int[] a, int[] b, int[] c, int[] d) {
		if(	Arrays.equals(a, b) || 
			Arrays.equals(b, c) || 
			Arrays.equals(c, d) || 
			Arrays.equals(a, c) || 
			Arrays.equals(a, d) ||
			Arrays.equals(b, d)) {
			return false;
		}
		boolean case1 = gogo(a,b,c,d);
		boolean case2 = gogo(a,c,b,d);
		boolean case3 = gogo(a,d,b,c);
		return case1 || case2 || case3;
	}

	private boolean gogo(int[] a, int[] b, int[] c, int[] d){
		double lengthAC = getLength(a,c);
		double lengthAD = getLength(a,d);
		double lengthBC = getLength(b,c);
		double lengthBD = getLength(b,d);
		if(!(lengthAC == lengthAD && lengthAD == lengthBC && lengthBC == lengthBD)){
			return false;
		}
		double lengthAB = getLength(a,b);
		if(lengthAB == lengthAC*2){
			return true;
		}
		return false;
	}

	private double getLength(int[] a, int[] b){
		return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
	}
}
