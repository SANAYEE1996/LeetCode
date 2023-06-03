package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class JumpGame {
	
	public int jump(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
		System.out.println("들어온 배열 : " +Arrays.toString(nums));
		int answer = 0;
		
		int[] way = new int[nums.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < way.length; i++) {
			way[i] = (nums[i] + i) >= way.length ? way.length-1 : (nums[i] + i);
			if(!map.containsKey(way[i])) {
				map.put(way[i], i);
			}
		}
		
		System.out.println("도달 할 수 있는 배열 : " +Arrays.toString(way));
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		System.out.println("value list : " +list);
		
		int limit = way.length-1;
		
		while(way[0] < limit) {
			int binaryIndex = search(list, limit);
			int key = list.get(binaryIndex);
			limit = map.get(key);
			System.out.println("key : " +key);
			System.out.println("limit : " +limit);
			answer++;
			if(answer > 10) break;
		}
		
		return answer + 1;
    }
	
	private int search(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size()-1;
		int middle = (low + high)/2;
		
		while(low <= high) {
			if(list.get(middle) < target) {
				low = middle + 1;
				middle = (low + high)/2;
				continue;
			}
			else if(target < list.get(middle)) {
				high = middle - 1;
				middle = (low + high)/2;
				continue;
			}
			
			return middle;
		}
		
		if(list.get(middle) < target && middle < list.size()-1) {
			return middle + 1;
		}
		
		return middle;
	}
}
