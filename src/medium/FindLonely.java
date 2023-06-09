package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLonely {
	
	/**
	 * https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/submissions/
	 * */
	
	public List<Integer> findLonely(int[] nums) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			if(!map.containsKey(i)) map.put(i, 0);
			map.put(i, map.get(i)+1);
		}
		for(int i : nums) {
			if(map.get(i) == 1 && !map.containsKey(i-1) && !map.containsKey(i+1)) list.add(i);
		}
		return list;
    }
}
