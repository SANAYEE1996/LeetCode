package medium;

public class IsValidBST {
	
	private boolean isValidBinarySearchTree = true;
	
	public boolean isValidBST(TreeNode root) {
		isGoGo(root, root.val, root.val);
		return isValidBinarySearchTree;
    }
	
	private void isGoGo(TreeNode root, int max, int min) {
		if(root.left != null) {
			if(root.left.val < min) {
				isGoGo(root.left, Math.max(root.left.val, max), Math.min(root.left.val, min));
			}
			else {
				isValidBinarySearchTree = false;
				return;
			}
		}
		if(root.right != null) {
			if(root.right.val > max) {
				isGoGo(root.right, Math.max(root.right.val, max), Math.min(root.right.val, min));
			}
			else {
				isValidBinarySearchTree = false;
				return;
			}
		}
	}
}
