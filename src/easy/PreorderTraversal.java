package easy;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> answerList = new ArrayList<>();
		putList(answerList, root);
		return answerList;
    }
	
	private void putList(List<Integer> list, TreeNode node) {
		if(node != null) {
			list.add(node.val);
			if(node.left != null) {
				putList(list, node.left);
			}
			if(node.right != null) {
				putList(list, node.right);
			}
		}
	}
}
