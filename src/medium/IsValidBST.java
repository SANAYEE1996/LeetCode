package medium;

import java.util.ArrayList;

public class IsValidBST {
	
	private ArrayList<Integer> list;
	
	public boolean isValidBST(TreeNode root) {
		list = new ArrayList<>();
		gogo(root);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i-1) > list.get(i)) {
				return false;
			}
		}
		return true;
    }
	
	private void gogo(TreeNode root) {
		if(root == null) {
			return;
		}
		gogo(root.left);
		list.add(root.val);
		gogo(root.right);
	}
	
}
