package easy;

import java.util.HashMap;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
        	if(map.containsKey(i)) {
        		map.put(i, map.get(i)+1);
        		continue;
        	}
        	map.put(i, 1);
        }
        for(int key : map.keySet()) {
        	if(map.get(key)==1) {
        		return key;
        	}
        }
		return 0;
    }
}
