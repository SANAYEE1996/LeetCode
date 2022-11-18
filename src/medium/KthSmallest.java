package medium;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallest {
	public int kthSmallest(TreeNode root, int k) {
		try {
			ArrayList<Integer> list = new ArrayList<>();
			gogo(root, list);
			Collections.sort(list);
	        return list.get(k-1);
		}
		catch(NullPointerException e) {
			return 0;
		}
    }
	
	private void gogo(TreeNode root, ArrayList<Integer> list) {
        list.add(root.val);
		if(root.right != null) {
			gogo(root.right,list);
		}
		if(root.left != null) {
			gogo(root.left,list);
		}
	}
}
