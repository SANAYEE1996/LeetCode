package medium;

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
        ListNode copy = head;
        int swap = 0;
        while(copy != null){
            ListNode before = copy;
            copy = copy.next;
            ListNode after = copy;
            if(after == null){
                break;
            }
            swap = after.val;
            after.val = before.val;
            before.val = swap;
            copy = copy.next;
        }
        return head;
    }
}
