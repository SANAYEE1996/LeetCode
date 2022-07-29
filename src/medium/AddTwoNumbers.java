package medium;

import java.util.ArrayList;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode exam01 = l1;
		ListNode exam02 = l2;
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0;
		int b = 0;
		int sum = 0;  
		int pivot = 0;
		int count = 0;
		while(exam01 != null || exam02 != null) {
			count++;
			if(exam01 != null && exam02 != null) {
				a = exam01.val;
				b = exam02.val;
				sum = a+b+pivot;
				if(sum >= 10) {
					sum -= 10;
					pivot = 1;
				}
				else pivot = 0;
				list.add(sum);
				exam01 = exam01.next;
				exam02 = exam02.next;
				continue;
			}
			else if(exam01 == null) {
				list.add(exam02.val);
				exam02 = exam02.next;
			}
			else if(exam02 == null) {
				list.add(exam01.val);
				exam01 = exam01.next;
			}
		}
		System.out.println(list + " " +count);
		
		ListNode imshi = new ListNode();
		ListNode answer = new ListNode();
		answer.next = imshi;
		printListNode(answer);
		for(int i=0; i < list.size(); i++) {
			ListNode ball = new ListNode(list.get(i));
			imshi.next = ball;
			imshi = imshi.next;
		}
		System.out.print("임시 : ");
		printListNode(imshi);
		System.out.println();
		return answer;
    }
	
	void printListNode(ListNode l1) {
		ListNode exam01 = l1;
		while(exam01 != null) {
			System.out.print(exam01.val + " ");
			exam01 = exam01.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode m1 = new ListNode(5);
		ListNode m2 = new ListNode(6);
		ListNode m3 = new ListNode(4);
		m1.next = m2;
		m2.next = m3;
		
		AddTwoNumbers s = new AddTwoNumbers();
		s.printListNode(s.addTwoNumbers(n1, m1));
		
	}
}
