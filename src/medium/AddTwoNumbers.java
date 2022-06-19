package Medium;



public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		return l1;
    }
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode();
		n1.val = 2;
		n1.next = n1;
		System.out.println(n1.val);
		System.out.println(n1.next.next.val);
	}
}
