package medium;

import java.util.HashMap;

public class MinimumRounds {
	public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : tasks) {
        	if(!map.containsKey(i)) {
        		map.put(i, 0);
        	}
        	map.put(i, map.get(i)+1);
        }
        int answer = 0;
        int value = 0;
        for(int i : map.keySet()) {
        	value = map.get(i);
        	if(value== 1) {
        		answer = -1;
        		break;
        	}
        	else if(value%3 == 2 || value%3 == 1){
        		answer += (value/3) + 1;
        	}
        	else if(value%3 == 0){
        		answer += (value/3);
        	}
        }
        if(answer == -1) {
    		return -1;
    	}
		return answer;
    }
	
}
