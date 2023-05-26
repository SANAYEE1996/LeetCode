package medium;

public class MaxAbsValExpr {
	
	/**
	 * 
	 * https://leetcode.com/problems/maximum-of-absolute-value-expression/
	 * 
	 * Given two arrays of integers with equal lengths, return the maximum value of:
	 * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
	 * 
	 * where the maximum is taken over all 0 <= i, j < arr1.length.
	 * 
	 * 2 <= arr1.length == arr2.length <= 40000
	 * -10^6 <= arr1[i], arr2[i] <= 10^6
	 * 
	 * */
	
	public int maxAbsValExpr(int[] arr1, int[] arr2) {
		int res = 0;
		for (int i = -1; i <= 1; i += 2) {
			for (int j = -1; j <= 1; j += 2) {
				int smallest = i * arr1[0] + j * arr2[0] + 0;
				for (int x = 1; x < arr1.length; ++x) {
					int cur = i * arr1[x] + j * arr2[x] + x;
					res = Math.max(res, cur - smallest);
					smallest = Math.min(smallest, cur);
				}
			}
		}
		return res;
	}
}
