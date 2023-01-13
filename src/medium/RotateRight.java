package medium;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
		ListNode tail = new ListNode();
		ListNode tail2 = tail;
		ListNode head2 = head;

		for(int i = 0; i < k; i++){
			tail2.val = head2.val;
			tail2.next = new ListNode();
			tail2 = tail2.next;
			head2 = head2.next;
		}

		tail2 = tail;
		head2 = head;

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
