package hard;

import java.util.PriorityQueue;

public class MergeKList {
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode list : lists){
            while(list!=null){
                minHeap.add(list);
                list = list.next;
            }
        }

        ListNode newHead = new ListNode(0);
        ListNode sentinel = newHead;
        while(!minHeap.isEmpty()){
            ListNode temp = minHeap.poll();
            newHead.next = temp;
            newHead = newHead.next;
            temp.next = null;
        }
        return sentinel.next;
    }
}
