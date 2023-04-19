package medium;

import java.util.ArrayList;
import java.util.Collections;

public class LongestZigZag {
	
	private ArrayList<Integer> list;
	
	public int longestZigZag(TreeNode root) {
        
		list = new ArrayList<>();
		gogo(root.left, "left", 0);
		gogo(root.right, "right", 0);
		
		return Collections.max(list);
    }
	
	private void gogo(TreeNode root, String status, int zigzag) {
		if(root == null) {
			list.add(zigzag);
			return;
		}
		
		if(status.equals("right")) {
			gogo(root.left, "left", zigzag+1);
			gogo(root.right, "right", 0);
		}
		else {	//left
			gogo(root.left, "left", 0);
			gogo(root.right, "right", zigzag+1);
		}
	}
}
