package medium;

import java.util.ArrayList;

public class SumNumbers {
	
	private ArrayList<Integer> list;
	
	public int sumNumbers(TreeNode root) {
        list = new ArrayList<>();
        gogo(root, new StringBuilder());
        int sum = 0;
        for(int i : list) {
        	sum += i;
        }
		return sum;
    }
	
	private void gogo(TreeNode root, StringBuilder sb){
		if(root == null){
			return;
		}
		if(root.left == null && root.right == null){
			sb.append(root.val);
			list.add(Integer.parseInt(sb.toString()));
			return;
		}
		StringBuilder sbLeft = new StringBuilder();
		StringBuilder sbRight = new StringBuilder();
		sbLeft.append(sb.toString());
		sbRight.append(sb.toString());
		sbLeft.append(root.val);
		sbRight.append(root.val);
		gogo(root.left,sbLeft);
		gogo(root.right,sbRight);
	}
}
