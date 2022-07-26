package medium;



public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode exam01 = l1;
		ListNode exam02 = l2;
		
		
		while(exam01 != null || exam02 != null) {
			exam01 = (exam01 != null) ? exam01.next;
			exam02 = exam02.next;
		}
		
		
		return l1;
    }
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
//		System.out.println(n1.val);
//		System.out.println(n1.next.next.val);
//		System.out.println(n1.next == null);
//		System.out.println(n1.next.next == null);
//		System.out.println(n1.next.next.next == null);
		
		ListNode exam = n1;
		
		while(exam != null) {
			System.out.println(exam.val);
			exam = exam.next;
		}
		
	}
}
