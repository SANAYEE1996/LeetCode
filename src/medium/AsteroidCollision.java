package medium;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollision {
	
	/**
	 * https://leetcode.com/problems/asteroid-collision/
	 * */
	
	public int[] asteroidCollision(int[] asteroids) {
		List<Integer> list = new ArrayList<>();
		list.add(asteroids[0]);
		for(int i = 1; i < asteroids.length; i++){
			if(list.isEmpty() || !isCollide(list.get(list.size()-1), asteroids[i])){
				list.add(asteroids[i]);
				continue;
			}
			gogo(list, asteroids[i]);
		}
		if(list.isEmpty()){
			return new int[]{};
		}
		int[] answer = new int[list.size()];
		copy(answer, list);
		return answer;
	}

	private boolean isCollide(int a, int b){
		if(a > 0 && b < 0){
			return true;
		}
		return false;
	}

	private void copy(int[] a, List<Integer> list){
		if(a.length != list.size()) return;
		for(int i = 0; i < a.length; i++) a[i] = list.get(i);
	}
	
	private void gogo(List<Integer> list, int a){
		int index = 0;
		while(!list.isEmpty()){
			index = list.size()-1;
			int last = list.get(index);
			if(!isCollide(last, a)){
				list.add(a);
				break;
			}
			if(Math.abs(last) == Math.abs(a)){
				list.remove(index);			
				return;
			}
			if(Math.abs(last) > Math.abs(a)){
				break;
			}
			list.remove(index);	
		}
		if(list.isEmpty()){
			list.add(a);
		}
	}
}
