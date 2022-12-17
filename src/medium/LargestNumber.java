package medium;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {
	public String largestNumber(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int i : nums) {
        	numsList.add(i);
        }
        Collections.sort(numsList, (a,b) -> {
        	return compareNumberString(String.valueOf(a),String.valueOf(b));
        });
        System.out.println(numsList);
        StringBuilder sb = new StringBuilder();
        for(int i : numsList) {
        	sb.append(i);
        }
        System.out.println();
		return sb.toString();
    }
	
	private int compareNumberString(String a, String b) {
		int size = (a.length() >= b.length()) ? b.length() : a.length();
		for(int i = 0; i < size; i++) {
			if(a.charAt(i) == b.charAt(i)) {
				continue;
			}
			else if(a.charAt(i) > b.charAt(i)) {
				return -1;
			}
			else if(a.charAt(i) < b.charAt(i)) {
				return 1;
			}
		}
		return 1;
	}
}
