package medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumCardPickup {
	
	/**
	 * https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/
	 * */

	public int minimumCardPickup(int[] cards) {
		int answer = Integer.MAX_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < cards.length; i++){
			if(!map.containsKey(cards[i])){
				map.put(cards[i], i);
				continue;
			}
			answer = Math.min(answer, i - map.get(cards[i])+1);
			map.put(cards[i], i);
		}
		return (answer == Integer.MAX_VALUE ? -1 : answer);
	}
}
