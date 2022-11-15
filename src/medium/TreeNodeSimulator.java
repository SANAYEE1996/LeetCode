package medium;

public class TreeNodeSimulator {

	public static void main(String[] args){
		TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		tree.left = new TreeNode(tree.left.val, new TreeNode(4),new TreeNode(5));
		tree.right.left = new TreeNode(6);
		System.out.println(tree.val);
		System.out.println(tree.left.val);
		System.out.println(tree.left.left.val);
		System.out.println(tree.left.right.val);
		System.out.println(tree.right.val);
		System.out.println(tree.right.left.val);
		System.out.println(tree.right.right == null);
	}
	
	
	
}
