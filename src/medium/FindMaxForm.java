package medium;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxForm {
	public int findMaxForm(String[] strs, int m, int n) {
        int[][] map = new int[strs.length][2];
        for(int i = 0; i < map.length; i++) {
        	map[i] = getOneCountAndZeroCountArray(strs[i]);
        }
        sortTwoArray(map);
        printTwoArray(map);
        return 0;
    }
	
	private int[] getOneCountAndZeroCountArray(String s) {
		int oneCount = 0;
		int zeroCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				zeroCount++;
				continue;
			}
			oneCount++;
		}
		return new int[] {zeroCount, oneCount};
	}
	
	private void sortTwoArray(int[][] map) {
		Arrays.sort(map, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] a, int[] b) {
        		if(a[0] == b[0]) {
        			return a[1] - b[1];
        		}
        		return a[0] - b[0];
        	}
        });
	}
	
	private void printTwoArray(int[][] map) {
		for(int[] i : map) {
			System.out.print(Arrays.toString(i) + " ");
		}
		System.out.println();
	}
}
