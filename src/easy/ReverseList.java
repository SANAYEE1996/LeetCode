package easy;

import java.util.ArrayList;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		ListNode answer = new ListNode();
		ArrayList<Integer> list = new ArrayList<>();
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		if(list.isEmpty()) {
			return answer.next;
		}
		ListNode copy = answer;
		for(int i = list.size()-1; i >= 0; i--) {
			copy.val = list.get(i);
			if(i == 0) {
				break;
			}
			copy.next = new ListNode();
			copy = copy.next;
		}
		return answer;
    }
}
