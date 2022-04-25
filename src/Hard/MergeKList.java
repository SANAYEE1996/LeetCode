package Hard;

import java.util.Arrays;

public class MergeKList {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode a = new ListNode();
        
		return a;
    }

	public static void main(String[] args) {
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		
		
		a.next = new ListNode(2);
		b.next = new ListNode(4);
		c.next = new ListNode(6);
		
		ListNode[] lists = {a,b,c};
		
		System.out.println(lists[0].val);
		System.out.println(lists[0].next.val);
		System.out.println(Arrays.toString(lists));
		for(int i = 0; i < lists.length; i++) {
			System.out.println(lists[i].val);
			while(lists[i].next.equals(null)) {
				
				System.out.println(lists[i].next.val);
			}
		}

	}

}
