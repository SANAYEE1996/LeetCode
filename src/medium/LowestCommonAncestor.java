package medium;

import java.util.ArrayList;

public class LowestCommonAncestor {
	
	private ArrayList<TreeNode> pList;
	private ArrayList<TreeNode> qList;
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode answerNode = new TreeNode();
        pList = new ArrayList<>();
        qList = new ArrayList<>();
        
        gogo(root, p, new ArrayList<>(), "p");
        gogo(root, q, new ArrayList<>(), "q");
        
        for(int i = pList.size()-1; i >= 0; i--) {
        	for(int j = qList.size()-1; j >= 0; j--) {
        		if(pList.get(i) == qList.get(j)) {
        			return pList.get(i);
        		}
        	}
        }
        
        return answerNode;
    }
	
	private void gogo(TreeNode root, TreeNode target, ArrayList<TreeNode> list, String flag) {
		if(root == null) {
			return;
		}
		if(root == target) {
			if("p".equals(flag)) {
				pList = new ArrayList<>(list);
				pList.add(root);
				return;
			}
			qList = new ArrayList<>(list);
			qList.add(root);
			return;
		}
		ArrayList<TreeNode> leftList = new ArrayList<>(list);
		leftList.add(root);
		gogo(root.left, target, leftList,flag);
		
		ArrayList<TreeNode> rightList = new ArrayList<>(list);
		rightList.add(root);
		gogo(root.right, target, rightList,flag);
	}
}
