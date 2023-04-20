package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class WidthOfBinaryTree {
	
	HashMap<Integer, ArrayList<Integer>> map;
	
	public int widthOfBinaryTree(TreeNode root) {
        map = new HashMap<>();
        gogo(root, 0);
        
        int startIndex = 0;
        int endIndex = 0;
        ArrayList<Integer> examList;
        int max = 0;
        for(int key : map.keySet()){
        	examList = map.get(key);
        	startIndex = 0;
        	endIndex = 0;
        	for(int i= 0; i < examList.size(); i++){
        		if(examList.get(i) != -500){
        			startIndex = i;
        			break;
        		}
        	}
        	for(int i = examList.size()-1; i >= 0; i--){
        		if(examList.get(i) != -500){
        			endIndex = i;
        			break;
        		}
        	}
        	max = Math.max(max, endIndex - startIndex);
        }
		return max;
    }
	
	private void gogo(TreeNode root, int level) {
		if(!map.containsKey(level)) {
			map.put(level, new ArrayList<>());
		}
		if(root == null) {
			map.get(level).add(-500);
			return;
		}
		map.get(level).add(root.val);
		
		gogo(root.left, level+1);
		gogo(root.right, level+1);
	}
}
