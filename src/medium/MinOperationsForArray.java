package medium;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsForArray {
	
	/**
	 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
	 * */
	
	public int minOperations(int[] nums) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : nums){
			if(!map.containsKey(i)) map.put(i,0);
			map.put(i, map.get(i)+1);
		}
		int value = 0;
		for(int key : map.keySet()){
			value = map.get(key);
			if(value == 1) return -1;
			answer += getMinCount(value);
		}
		return answer;
	}

	public int getMinCount(int value){
		if(value % 3 == 0) return value/3;
		else if(value % 3 == 2) return value/3 + 1;
		return ((value-(value/3-1)*3)/2 + (value/3-1)*3);
	}
}
