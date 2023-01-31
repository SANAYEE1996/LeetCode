package easy;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
	
	private List<Integer> answerList;
	
	public List<Integer> preorder(Node root) {
		if(root == null) {
			return new ArrayList<>();
		}
		answerList = new ArrayList<>();
		answerList.add(root.val);
		gogo(root);
		return answerList;
    }
	
	private void gogo(Node root) {
		if(root.children == null || root.children.isEmpty()) {
			return;
		}
		List<Node> list = root.children;
		
		for(int i = 0; i < list.size(); i++) {
			answerList.add(list.get(i).val);
			gogo(list.get(i));
		}
	}
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};