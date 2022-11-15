package medium;

public class CountNodes {
	public int countNodes(TreeNode root) {
		int[] countFlag = {1};
		try {
			gogo(root, countFlag);
	        return countFlag[0];
		}
		catch(NullPointerException e) {
			return 0;
		}
    }
	
	private void gogo(TreeNode root, int[] countFlag) {
		if(root.right != null) {
			countFlag[0]++;
			gogo(root.right, countFlag);
		}
		if(root.left != null) {
			countFlag[0]++;
			gogo(root.left, countFlag);
		}
	}
	
	public static void main(String[] args){
		TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		tree.left = new TreeNode(tree.left.val, new TreeNode(4),new TreeNode(5));
		tree.right.left = new TreeNode(6);
		CountNodes s = new CountNodes();
		System.out.println(s.countNodes(tree));
		
		tree = new TreeNode(1);
		System.out.println(s.countNodes(tree));
		tree = new TreeNode(0);
		System.out.println(s.countNodes(tree));
		tree = new TreeNode();
		System.out.println(s.countNodes(null));
	}
	
}