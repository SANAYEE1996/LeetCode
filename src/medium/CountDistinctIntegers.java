package medium;

import java.util.HashSet;

public class CountDistinctIntegers {
	public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
        	set.add(i);
        	set.add(reverseInteger(i));
        }
		return set.size();
    }
	private int reverseInteger(int n){
	    return Integer.parseInt(reverseString(String.valueOf(n)));
    }

    private String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
