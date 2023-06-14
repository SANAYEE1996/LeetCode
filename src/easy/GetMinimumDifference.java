package easy;

import java.util.PriorityQueue;

public class GetMinimumDifference {
	
	/**
	 * https://leetcode.com/problems/minimum-absolute-difference-in-bst
	 * The number of nodes in the tree is in the range [2, 104].
	 * */
	
	private PriorityQueue<Integer> que;

	public int getMinimumDifference(TreeNode root) {
		que = new PriorityQueue<>();
		gogo(root);
		int before = que.poll();
		int min = Integer.MAX_VALUE;
		while(!que.isEmpty()){
			int now = que.poll();
			min = Math.min(min, now - before);
			before = now;
		}
		return min;
	}

	private void gogo(TreeNode root){
		if(root == null){
			return;
		}
		que.add(root.val);
		gogo(root.left);
		gogo(root.right);
	}
}
