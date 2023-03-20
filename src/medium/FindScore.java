package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class FindScore {
	public long findScore(int[] nums) {
        long answer = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        	if(!map.containsKey(nums[i])){
        		map.put(nums[i], new ArrayList<>());
        	}
        	map.get(nums[i]).add(i);
        }
        while(!map.isEmpty()){
        	PriorityQueue<Integer> que = new PriorityQueue<>(map.keySet());
        	int key = que.poll();
        	answer += (long)key;
        	int index = map.get(key).get(0);
        	map.get(key).remove(0);
        	if(map.get(key).isEmpty()){
        		map.remove(key);
        	}
        	//System.out.println("key : " +key +" and index : " +index);
        	if(index < nums.length-1){
        		int keyPlus = nums[index+1];
        		if(map.containsKey(keyPlus) && !map.get(keyPlus).isEmpty() && map.get(keyPlus).contains(index+1)) {
        			//System.out.println("keyPlus : "+keyPlus+" // "+map.get(keyPlus));
	        		map.get(keyPlus).remove(map.get(keyPlus).indexOf(index+1));
	        		if(map.get(keyPlus).isEmpty()){
	        			map.remove(keyPlus);
	        		}
        		}
        	}
        	if(index > 0){
        		int keyMinus = nums[index-1];
        		if(map.containsKey(keyMinus) && !map.get(keyMinus).isEmpty() && map.get(keyMinus).contains(index-1)) {
        			//System.out.println("keyMinus : "+keyMinus+" // "+map.get(keyMinus));
	        		map.get(keyMinus).remove(map.get(keyMinus).indexOf(index-1));
	        		if(map.get(keyMinus).isEmpty()){
	        			map.remove(keyMinus);
	        		}
        		}
        	}
        }
        return answer;
    }
}
