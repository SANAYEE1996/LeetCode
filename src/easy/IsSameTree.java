package easy;

public class IsSameTree {
	
	private boolean isSameTreeFlag = true;
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		gogo(p, q);
        return isSameTreeFlag;
    }
	
	private void gogo(TreeNode p, TreeNode q) {
		if(p != null && q != null) {
			if(p.val == q.val) {
				isSameTree(p.right, q.right);
				isSameTree(p.left, q.left);
			}
			else {
				isSameTreeFlag = false;
			}
		}
		else if(p == null && q == null) {
			return;
		}
		else {
			isSameTreeFlag = false;
		}
	}
}
