package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LevelOrder {
	
	private List<List<Integer>> list;
	private HashMap<Integer, List<Integer>> map;
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) {
			return new ArrayList<>();
		}
		list = new ArrayList<>();
		map = new HashMap<>();
		gogo(root, 0);
		
		int keySize = map.keySet().size();
		
		for(int i = 0; i < keySize; i++) {
			List<Integer> exam = new ArrayList<>();
			for(int j : map.get(i)) {
				exam.add(j);
			}
			list.add(exam);
		}
		
		return list;
    }
	
	private void gogo(TreeNode root, int level) {
		if(!map.containsKey(level)) {
			map.put(level, new ArrayList<>());
		}
		map.get(level).add(root.val);
		
		
		if(root.left != null) {
			gogo(root.left, level+1);
		}
		if(root.right != null) {
			gogo(root.right, level+1);
		}
	}
}
