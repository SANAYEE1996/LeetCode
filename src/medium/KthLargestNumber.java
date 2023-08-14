package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNumber {
	
	/**
	 * https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/
	 * */
	
	public String kthLargestNumber(String[] nums, int k) {
		PriorityQueue<String> que = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return Integer.compare(o2.length(), o1.length());
				}
				return o2.compareTo(o1);
			}});
		for(String s : nums) {
			que.add(s);
		}
		for(int i = 0; i < k-1; i++) {
			que.poll();
		}
		return que.poll();
    }
}
