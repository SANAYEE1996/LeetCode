package medium;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumRounds {
	public int minimumRounds(int[] tasks) {
		System.out.println("input : " +Arrays.toString(tasks));
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : tasks) {
        	if(!map.containsKey(i)) {
        		map.put(i, 0);
        	}
        	map.put(i, map.get(i)+1);
        }
        printMap(map);
        int answer = 0;
        int key = 0;
        for(int i : map.keySet()) {
        	key = i;
        	while(true) {
	        	if(map.get(key) == 1) {
	        		answer = -1;
	        		break;
	        	}
	        	else if(map.get(key) == 0) {
	        		break;
	        	}
	        	else if(map.get(key) == 2){
	        		map.put(key, map.get(key)-2);
	        	}
	        	else {
	        		map.put(key, map.get(key)-3);
	        	}
	        	answer++;
        	}
        	if(answer == -1) {
        		return -1;
        	}
        }
		return answer;
    }
	
	private void printMap(HashMap<Integer, Integer> map) {
		for(int i : map.keySet()) {
        	System.out.println("key : "+i+" // value : " +map.get(i));
        }
	}
}
