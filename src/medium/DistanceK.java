package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DistanceK {
	
	/**
	 * https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
	 * */
	
	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		Map<TreeNode, TreeNode> childParentMap = new HashMap<>();
		Set<Integer> visited = new HashSet<>();
		List<Integer> answerList = new ArrayList<>();
		if(k == 0) {
			answerList.add(target.val);
			return answerList;
		}
		gogo(root, root.left, childParentMap);
		gogo(root, root.right, childParentMap);
		visited.add(target.val);
		if(childParentMap.containsKey(target)){ //부모가 있을 경우 부모 node로 탐색
			gogo(answerList, childParentMap, visited, childParentMap.get(target), k-1);
		}
		gogo(answerList, childParentMap, visited, target.left, k-1);
		gogo(answerList, childParentMap, visited, target.right, k-1);
		return answerList;
	}

	private void gogo(TreeNode parent, TreeNode me, Map<TreeNode, TreeNode> map){
		if(me == null){
			return;
		}
		map.put(me, parent);
		gogo(me, me.left, map);
		gogo(me, me.right, map);
	}

	private void gogo(List<Integer> list, Map<TreeNode, TreeNode> map, Set<Integer> visited, TreeNode now, int k){
		if(now == null || visited.contains(now.val)){
			return;
		}
		if(k == 0){
			list.add(now.val);
			return;
		}
		visited.add(now.val);
		if(map.containsKey(now)){ //부모가 있을 경우 부모 node로 탐색
			gogo(list, map, visited, map.get(now), k-1);
		}
		gogo(list, map, visited, now.left, k-1);
		gogo(list, map, visited, now.right, k-1);
	}
}
