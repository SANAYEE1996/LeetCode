package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinAbsoluteDifference {
	
	/**
	 * https://leetcode.com/problems/minimum-absolute-difference-between-elements-with-constraint/
	 * */
	
	public int minAbsoluteDifference(List<Integer> nums, int x) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		putValue(nums, map);
		Collections.sort(nums);
		return getMinValue(nums, map, x);
	}

	private void putValue(List<Integer> nums, Map<Integer, List<Integer>> map){
		for(int i = 0; i < nums.size(); i++){
			if(!map.containsKey(nums.get(i))){
				map.put(nums.get(i), new ArrayList<>());
			}
			map.get(nums.get(i)).add(i);
		}
	}

	private int getMinValue(List<Integer> nums, Map<Integer, List<Integer>> map, int x){
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < nums.size()-1; i++){
			int before = nums.get(i);
			int after = nums.get(i+1);
			if(after - before < answer && isDifferUnder(map.get(before), map.get(after), x)){
				answer = after - before;
			}
		}
		return answer;
	}

	private boolean isDifferUnder(List<Integer> a, List<Integer> b, int differ){
		int aMin = a.get(0);
		int aMax = a.get(a.size()-1);
		int bMin = b.get(0);
		int bMax = b.get(b.size()-1);
		if(Math.abs(bMin - aMax) >= differ || Math.abs(aMin - bMax) >= differ){
			return true;
		}
		return false;
	}
}
