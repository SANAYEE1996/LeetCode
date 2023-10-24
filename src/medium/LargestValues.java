package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestValues {
	
	/**
	 * https://leetcode.com/problems/find-largest-value-in-each-tree-row/?envType=daily-question&envId=2023-10-24
	 * */
	
	public List<Integer> largestValues(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> answer = new ArrayList<>();
		search(root, 0, map);
		int key = 0;
		while(map.containsKey(key)){
			answer.add(map.get(key));
			key++;
		}
		return answer;
	}

	private void search(TreeNode root, int key, Map<Integer, Integer> map){
		if(root == null) return;
		if(!map.containsKey(key)) map.put(key, Integer.MIN_VALUE);
		map.put(key, Math.max(map.get(key), root.val));
		search(root.right, key+1, map);
		search(root.left, key+1, map);
	}
}
