package easy;

import java.util.ArrayList;

public class IsSymmetric {
	private ArrayList<Integer> leftList;
	private ArrayList<Integer> rightList;
	
	public boolean isSymmetric(TreeNode root) {
		leftList = new ArrayList<>();
		rightList = new ArrayList<>();
		gogoLeft(root);
		gogoRight(root);
		return isSameList(leftList, rightList);
    }
	
	private void gogoLeft(TreeNode root){
		if(root == null){
			leftList.add(-101);
			return;
		}
		leftList.add(root.val);
		gogoLeft(root.left);
		gogoLeft(root.right);
	}

	private void gogoRight(TreeNode root){
		if(root == null){
			rightList.add(-101);
			return;
		}
		rightList.add(root.val);
		gogoRight(root.right);
		gogoRight(root.left);
	}
	
	private boolean isSameList(ArrayList<Integer> leftList, ArrayList<Integer> rightList){
		if(leftList.size() != rightList.size()){
			return false;
		}
		for(int i = 0; i < leftList.size(); i++){
			if(leftList.get(i) != rightList.get(i)){
				return false;
			}
		}
		return true;
	}
}
