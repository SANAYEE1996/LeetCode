package medium;

public class InsertGreatestCommonDivisors {
	
	/**
	 * https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
	 * */
	
	public ListNode insertGreatestCommonDivisors(ListNode head) {
		ListNode current = head;
        while(current.next != null) {
            int gcd = getGcd(current.val, current.next.val);
            ListNode node = new ListNode(gcd);
            node.next = current.next;
            current.next = node;
            current = current.next.next;
        }
        return head;
    }
	
	private int getGcd(int a, int b) {
		while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
		return a;
	}
}
