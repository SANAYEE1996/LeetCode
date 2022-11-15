package medium;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode answer = new ListNode();
		int pivot = 0;
		int sum = 0;
		try {
			while(true) {
				sum = l1.val+l2.val+pivot;
				if(sum >= 10) {
					sum -= 10;
					pivot = 1;
				}
				else {
					pivot = 0;
				}
				answer.val = sum;
				if(l1.next == null) {
					break;
				}
				l1 = l1.next;
				l2 = l2.next;
				answer.next = new ListNode();
				answer = answer.next;
			}
			return answer;
		}
		catch(NullPointerException e) {
			return new ListNode();
		}
    }
	
	void printListNode(ListNode l1) {
		ListNode exam01 = l1;
		while(exam01 != null) {
			System.out.print(exam01.val + " ");
			exam01 = exam01.next;
		}
	}
	
	public static void main(String[] args) {

		
	}
}
