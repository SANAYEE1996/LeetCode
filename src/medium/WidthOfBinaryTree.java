package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class WidthOfBinaryTree {
	
HashMap<Integer, ArrayList<Integer>> map;
	
	public int widthOfBinaryTree(TreeNode root) {
        map = new HashMap<>();
        gogo(root, 0, 0);
        
        int startIndex = 0;
        int endIndex = 0;
        ArrayList<Integer> examList;
        int max = 0;
        for(int key : map.keySet()){
        	examList = map.get(key);
            if(examList.isEmpty()){
                continue;
            }
        	startIndex = examList.get(0);
        	endIndex = examList.get(examList.size()-1);
            System.out.println(examList);
        	max = Math.max(max, endIndex - startIndex+1);
        }
		return max;
    }
	
	private void gogo(TreeNode root, int level, int value) {
		if(!map.containsKey(level)) {
			map.put(level, new ArrayList<>());
		}
		if(root == null) {
			return;
		}
		map.get(level).add(value);
		
		gogo(root.left, level+1, value*2);
		gogo(root.right, level+1, value*2 + 1);
	}
}
