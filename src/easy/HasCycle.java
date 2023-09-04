package easy;

public class HasCycle {
	
	/**
	 * https://leetcode.com/problems/linked-list-cycle/submissions/
	 * */
	
	public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null && runner.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
