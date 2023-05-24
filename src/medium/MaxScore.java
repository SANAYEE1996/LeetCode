package medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxScore {
	
	/**
	 * 
	 * https://leetcode.com/problems/maximum-subsequence-score/
	 * 
	 * n == nums1.length == nums2.length
	 * 1 <= n <= 100,000
	 * 0 <= nums1[i], nums2[j] <= 100,000
	 * 1 <= k <= n
	 * 
	 * */
	
	public long maxScore(int[] nums1, int[] nums2, int k) {
		int n = nums1.length;
		int[][] pairs = new int[n][2];
		for (int i = 0; i < n; ++i) {
			pairs[i] = new int[]{nums1[i], nums2[i]};
		}
		Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
		
		PriorityQueue<Integer> topKHeap = new PriorityQueue<>(k, (a, b) -> a - b);
		long topKSum = 0;
		for (int i = 0; i < k; ++i) {
			topKSum += pairs[i][0];
			topKHeap.add(pairs[i][0]);
		}
		
		long answer = topKSum * pairs[k - 1][1];
		
		for (int i = k; i < n; ++i) {
			topKSum += pairs[i][0] - topKHeap.poll();
			topKHeap.add(pairs[i][0]);
			
			answer = Math.max(answer, topKSum * pairs[i][1]);
		}
		
		return answer;
	}
}
