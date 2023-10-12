package medium;

import java.util.List;

public class MaximumSumOfHeights {
	
	/**
	 * https://leetcode.com/problems/beautiful-towers-i/
	 * */
	
	public long maximumSumOfHeights(List<Integer> maxHeights) {
		long answer = 0;
		for(int i = 0; i < maxHeights.size(); i++){
			answer = Math.max(getMaxSum(maxHeights, i), answer);
		}
		return answer;
	}

	private long getMaxSum(List<Integer> list, int index){
		int lastMax = list.get(index);
		long sum = lastMax;
		for(int i = index+1; i < list.size(); i++){
			sum = (lastMax >= list.get(i)) ? sum + list.get(i) : sum + lastMax;
			lastMax = Math.min(list.get(i), lastMax);
		}
		lastMax = list.get(index);
		for(int i = index-1; i >= 0; i--){
			sum = (lastMax >= list.get(i)) ? sum + list.get(i) : sum + lastMax;
			lastMax = Math.min(list.get(i), lastMax);
		}
		return sum;
	}
}
