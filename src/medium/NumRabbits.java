package medium;

import java.util.HashMap;

public class NumRabbits {
	public int numRabbits(int[] answers) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : answers){
			if(!map.containsKey(i)){
				map.put(i,0);
			}
			map.put(i,map.get(i)+1);
		}
		int answer = 0;
		int mot = 0, nam = 0;
		
		for(int key : map.keySet()){
			if(key == 0) {
				answer+= map.get(key);
				continue;
			}
			if(map.get(key) == 1){
				answer += key+1;
				continue;
			}
			mot = map.get(key)/(key+1);
			nam = map.get(key)%(key+1);
			answer += mot*(key+1) + ((nam == 0) ? 0 : (key+1));
		}
		return answer;
	}
}
