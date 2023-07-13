package medium;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
	
	/**
	 * https://leetcode.com/problems/number-of-boomerangs/
	 * */
	
	public int numberOfBoomerangs(int[][] points) {
		int answer = 0;
		for(int i = 0; i < points.length; i++){
			Map<Integer, Integer> map = new HashMap<>();
			for(int j = 0; j < points.length; j++){
				if(i == j) continue;
				int distance = getDistance(points[i], points[j]);
				if(!map.containsKey(distance)) map.put(distance, 0);
				map.put(distance, map.get(distance)+1);
			}
			answer += count(map);
		}
		return answer;
	}

	private int getDistance(int[] a, int[] b){
		return (int)Math.pow(Math.abs(a[0] - b[0]), 2) 
				+ (int)Math.pow(Math.abs(a[1] - b[1]),2);
	}

	private int count(Map<Integer, Integer> map){
		int count = 0;
		for(int key : map.keySet()){
			if(map.get(key) == 1) continue;
			count += gauss(map.get(key)-1)*2;
		}
		return count;
	}

	private int gauss(int n){
		if(n % 2 == 0) return (n+1)*(n/2);
		return (n+1)*(n/2) + n/2 + 1;
	}
}
