package easy;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode answer = new ListNode();
		ArrayList<Integer> list = new ArrayList<>();
		while(list1 != null) {
			list.add(list1.val);
			list1 = list1.next;
		}
		while(list2 != null) {
			list.add(list2.val);
			list2 = list2.next;
		}
		if(list.isEmpty()){
            return new ListNode().next;
        }
		Collections.sort(list);
		ListNode copy = answer;
		for(int i = 0; i < list.size(); i++) {
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
