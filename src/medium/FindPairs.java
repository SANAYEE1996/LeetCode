package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairs {
	
	/**
	 * https://leetcode.com/problems/k-diff-pairs-in-an-array/
	 * */

	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		if(k == 0) return zero(nums);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(nums[0], 0);
		
		int index = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == nums[i-1]) continue;
			map.put(nums[i], index);
			index++;
		}
		boolean[] visited = new boolean[map.size()];
		for(int i = 0; i < nums.length; i++) {
			if(visited[i]) continue;
			gogo(map, visited, nums[i], k, 0);
		}
		return 0;
	}

	private int zero(int[] nums){
		int sameCount = 1;
		int answer = 0;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == nums[i-1]){
				sameCount++;
				continue;
			}
			if(sameCount > 1) answer++;
			sameCount = 1;
		}
		return answer;
	}

	private void gogo(Map<Integer, Integer> map, boolean[] visited, int key, int k, int count) {
		if(!map.containsKey(key+k)) {
			return;
		}
		if(!visited[map.get(key)]){
			gogo(map, visited, key+k, k, count+1);
		}
	}
}
