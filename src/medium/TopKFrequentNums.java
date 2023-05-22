package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentNums {
	
	public int[] topKFrequent(int[] nums, int k) {

		int[] answer = new int[k];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : nums){
			if(!map.containsKey(i)){
				map.put(i,0);
			}
			map.put(i, map.get(i)+1);
		}
		
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : list_entries) {
			answer[i] = entry.getKey();
			i++;
			if(i == k){
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		TopKFrequentNums s = new TopKFrequentNums();
		int[] nums = {1,1,1,2,2,3};
		System.out.println(Arrays.toString(s.topKFrequent(nums, 2)));
		nums = new int[]{1};
		System.out.println(Arrays.toString(s.topKFrequent(nums, 1)));
		nums = new int[]{-1,-1};
		System.out.println(Arrays.toString(s.topKFrequent(nums, 1)));
	}
}
