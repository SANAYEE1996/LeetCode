package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSumOfHeights {
	
	/**
	 * https://leetcode.com/problems/beautiful-towers-i/
	 * */
	
	public long maximumSumOfHeights(List<Integer> maxHeights) {
		System.out.println("input list : " +maxHeights);
		List<Integer> findMaxList = new ArrayList<>(maxHeights);
		int maxHeight = Collections.max(findMaxList);
		List<Integer> maxIndexList = new ArrayList<>();
		for(int i = 0; i < maxHeights.size(); i++){
			if(maxHeights.get(i) < maxHeight) continue;
			maxIndexList.add(i);
		}
		long answer = 0;
		for(int i : maxIndexList){
			answer = Math.max(getMaxSum(maxHeights, i), answer);
		}
		return answer;
	}

	private long getMaxSum(List<Integer> list, int index){
		int lastMax = list.get(index);
		long sum = lastMax;
		for(int i = index+1; i < list.size(); i++){
			sum = (lastMax >= list.get(i)) ? sum + list.get(i) : sum + lastMax;
			lastMax = list.get(i);
		}
		System.out.println("right sum : " +(sum-list.get(index)));
		lastMax = list.get(index);
		System.out.println("lastMax : " +lastMax);
		for(int i = index-1; i >= 0; i--){
			sum = (lastMax >= list.get(i)) ? sum + list.get(i) : sum + lastMax;
			lastMax = list.get(i);
		}
		return sum;
	}
}
