package medium;

import java.util.ArrayList;

public class RandomNode {
	
	private ArrayList<Integer> list;
	
	public RandomNode(ListNode head) {
        list = new ArrayList<>();
        putValueToListFromListNode(head);
    }
    
    public int getRandom() {
    	return list.get((int)(Math.random()+list.size()-1));
    }
    
    private void putValueToListFromListNode(ListNode head) {
    	if(head == null) {
    		return;
    	}
    	list.add(head.val);
    	putValueToListFromListNode(head.next);
    }
}
