package medium;

import java.util.ArrayList;

public class SwapNodes {
	public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        putValueToList(head, list);
        ListNode answer = new ListNode();
        int swap = list.get(k-1);
        list.set(k-1, list.get(list.size()-k));
        list.set(list.size()-k, swap);
        gogo(answer, list);
        return answer;
    }

    private void putValueToList(ListNode head, ArrayList<Integer> list){
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }

    private void gogo(ListNode head, ArrayList<Integer> list){
        ListNode copy = head;
        for(int i = 0; i < list.size(); i++){
            copy.val = list.get(i);
            if(i == list.size()-1) {
				break;
			}
            copy.next = new ListNode();
			copy = copy.next;
        }
    }
}
