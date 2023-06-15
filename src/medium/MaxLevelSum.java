package medium;

import java.util.HashMap;

public class MaxLevelSum {
	/**
	* https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
	* 
	* 
	* 
	**/

	public int maxLevelSum(TreeNode root) {
		HashMap<Integer, Integer> levelSumMap = new HashMap<>();
		gogo(root, levelSumMap, 1);
		int max = Integer.MIN_VALUE;
		int maxKey = 1;
		for(int key : levelSumMap.keySet()){
			if(max < levelSumMap.get(key)){
				max = levelSumMap.get(key);
				maxKey = key;
			}
		}
		return maxKey;
	}

	private void gogo(TreeNode root, HashMap<Integer, Integer> map, int level){
		if(root == null){ return; }
		if(!map.containsKey(level)) {map.put(level, 0);}
		map.put(level, map.get(level) + root.val);
		gogo(root.right, map, level+1);
		gogo(root.left, map, level+1);
	}
}
