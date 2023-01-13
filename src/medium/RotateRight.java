package medium;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
		ListNode tail = new ListNode();
		ListNode tail2 = tail;
		
		for(int i = 0; i < k; i++){
			tail2.val = head.val;
			tail2.next = new ListNode();
			tail2 = tail2.next;
			head = head.next;
		}
		
		ListNode head2 = head;
		tail2 = tail;

		while(true){
			head2 = head2.next;
			if(head2 == null){
				head2 = new ListNode(tail.val);
				if(tail.next == null){
					break;
				}
				tail = tail.next;
			}
		}
		
		return head;
    }
}
