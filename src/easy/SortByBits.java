package easy;

import java.util.Arrays;
import java.util.Comparator;

public class SortByBits {
	
	/**
	 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
	 * */

	public int[] sortByBits(int[] arr) {
		Integer arr2[] = Arrays.stream(arr).boxed().toArray(Integer[]::new); 
		Arrays.sort(arr2, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				int aOne = getBinaryOneCount(a);
				int bOne = getBinaryOneCount(b);
				if(aOne == bOne){
					return a-b;
				}
				return Integer.compare(aOne, bOne);
			}
		});
		return Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();
	}

	private int getBinaryOneCount(int num){
		int count = 0;
		while(num > 0){
			if(num%2 == 1) count++;
			num /= 2;
		}
		return count;
	}
}
