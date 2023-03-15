package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class IsCompleteTree {
	private HashMap<Integer, ArrayList<Integer>> map;
    
    public boolean isCompleteTree(TreeNode root) {
        map = new HashMap<>();
        gogo(root, 0);
        ArrayList<Integer> exam;
        boolean over = false;
        for(int key : map.keySet()){
            exam = new ArrayList<>(map.get(key));
            if(over) {
            	return isAllEmptyList(exam);
            }
            for(int i = 0; i < exam.size(); i++){
                if(i < exam.size()-1 && exam.get(i) == -1 && exam.get(i+1) != -1){
                    return false;
                }
                if(exam.get(i) == -1) {
                	over = true;
                }
            }
        }
        return true;
    }
    
    private void gogo(TreeNode root, int level){
        if(root == null){
            if(!map.containsKey(level)){
                map.put(level, new ArrayList<>());
            }
            map.get(level).add(-1);
            return;
        }
        if(!map.containsKey(level)){
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(root.val);
        gogo(root.left, level+1);
        gogo(root.right, level+1);
    }
    
    private boolean isAllEmptyList(ArrayList<Integer> exam) {
    	for(int i : exam) {
    		if(i != -1) {
    			return false;
    		}
    	}
    	return true;
    }
}
