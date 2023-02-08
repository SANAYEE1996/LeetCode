package easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		for(int i : stones) {
			que.add(i);
		}
		
		int mostMax = 0;
		int nextMax = 0;
		
		while(!que.isEmpty()) {
			mostMax = que.poll();
			if(!que.isEmpty()) {
				nextMax = que.poll();
			}
			else {
				break;
			}
			if(mostMax == nextMax) {
				mostMax = 0;
				continue;
			}
			que.add(mostMax - nextMax);
		}
		
		
		return mostMax;
    }
}
