package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargest {
	
	/**
	 * https://leetcode.com/problems/kth-largest-element-in-an-array/
	 * */
	
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) {
        	que.add(i);
        }
        for(int i = 0; i < k-1; i++) {
        	que.poll();
        }
		return que.poll();
    }
}
