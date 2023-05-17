package medium;

import java.util.ArrayList;

public class PairSum {
	public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null) {
        	list.add(head.val);
        	head = head.next;
        }
        int max = 0;
        for(int i = 0; i < list.size()/2; i++) {
        	max = Math.max(max, list.get(i) + list.get(list.size()-1-i));
        }
		return max;
    }
}
