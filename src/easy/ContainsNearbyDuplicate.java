package easy;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int beforeSetSize = 0;
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
			if(beforeSetSize == set.size() && Math.abs(map.get(nums[i]) - i) <= k) {
				return true;
			}
			beforeSetSize = set.size();
			map.put(nums[i], i);
		}
        return false;
    }
}	
