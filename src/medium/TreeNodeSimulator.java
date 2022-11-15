package medium;

public class TreeNodeSimulator {

	public static void main(String[] args){
		TreeNode tree = new TreeNode(1);
		try {
			System.out.println(tree.val);
			System.out.println(tree.left.val);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		try {
			tree.left = new TreeNode(2);
			tree.right = new TreeNode(3);
			System.out.println(tree.left.val);
			System.out.println(tree.right.val);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}
