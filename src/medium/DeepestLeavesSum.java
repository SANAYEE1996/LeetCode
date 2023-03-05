package medium;

import java.util.HashMap;

public class DeepestLeavesSum {
	
	private HashMap<Integer, Integer> map;
	private int maxKey;
	
	public int deepestLeavesSum(TreeNode root) {
		map = new HashMap<>();
		maxKey = 0;
		putTreeNodeValToMap(root, 0);
		return map.get(maxKey);
    }
	
	private void putTreeNodeValToMap(TreeNode root, int level) {
		if(root == null) {
			return;
		}
		maxKey = Math.max(level, maxKey);
		if(!map.containsKey(level)) {
			map.put(level, 0);
		}
		map.put(level, map.get(level) + root.val);
		putTreeNodeValToMap(root.left, level+1);
		putTreeNodeValToMap(root.right, level+1);
	}
}
