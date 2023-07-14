package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubsequence {
	public int longestSubsequence(int[] arr, int difference) {
		int max = 0;
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i : arr){
			map.put(i, false);
		}
		Arrays.sort(arr);
		go(arr, difference, map);
		return max;
	}
	
	private void go(int[] arr, int differ, Map<Integer, Boolean> map){
		for(int i = 0; i < arr.length; i++){
			int key = arr[i]+differ;
			if(!map.containsKey(key)) continue;
			if(map.get(key)) continue;
			map.put(key, true);
			count(key, differ, map, 2);
		}
	}
	
	private void count(int key, int differ, Map<Integer, Boolean> map, int cnt){
		int newKey = key + differ;
		if(!map.containsKey(newKey)) return;
		if(map.get(newKey)) return;
		map.put(newKey, true);
		count(newKey, differ, map, cnt+1);
	}
}
