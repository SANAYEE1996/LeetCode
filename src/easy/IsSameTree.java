package easy;

public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p != null && q != null) {
			if(p.val == q.val) {
				return isSameTree(p.right, q.right);
			}
		}
        return false;
    }
	
	private void gogo(TreeNode p, TreeNode q) {
		if(p != null && q != null) {
			if(p.val == q.val) {
				isSameTree(p.right, q.right);
			}
		}
		else if(p == null && q == null) {
			return;
		}
	}
}
