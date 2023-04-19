package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> answerList = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i : nums) {
			if(!map.containsKey(i)) {
				map.put(i, false);
				continue;
			}
			if(!map.get(i)) {
				answerList.add(i);
				map.put(i, true);
			}
		}
		
		return answerList;
    }
}
