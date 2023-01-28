package easy;

import java.util.ArrayList;

public class MiddleNode {
	public ListNode middleNode(ListNode head) {
		ListNode answer = new ListNode();
		ArrayList<Integer> list = new ArrayList<>();
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		ListNode copy = answer;
		for(int i = list.size()/2; i < list.size(); i++) {
			copy.val = list.get(i);
			if(i == list.size()-1) {
				break;
			}
			copy.next = new ListNode();
			copy = copy.next;
		}
		return answer;
    }
}
