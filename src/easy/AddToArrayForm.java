package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> answerList = new LinkedList<>();
		List<Integer> numList = new ArrayList<>();
		List<Integer> kList = new ArrayList<>();
		copyArrayToListReverse(num, numList);
		integerToList(k, kList);
		if(numList.size() <= kList.size()) {
			sumListAndList(numList, kList, answerList);
		}else {
			sumListAndList(kList, numList, answerList);
		}
		return answerList;
    }
	
	private void copyArrayToListReverse(int[] num, List<Integer> list) {
		for(int i = num.length-1; i>= 0; i--) {
			list.add(num[i]);
		}
	}
	
	private void integerToList(int n, List<Integer> list) {
		while(n != 0) {
			list.add(n%10);
			n/=10;
		}
	}
	
	private void sumListAndList(List<Integer> a, List<Integer> b, List<Integer> sum) {
		int pivot = 0;
		int sumValue = 0;
		for(int i = 0; i < a.size(); i++) {
			sumValue = a.get(i) + b.get(i) + pivot;
			sum.add(0,sumValue%10);
			pivot = sumValue/10;
		}
		for(int i = a.size(); i < b.size(); i++) {
			sumValue = b.get(i) + pivot;
			sum.add(0,sumValue%10);
			pivot = sumValue/10;
		}
		if(pivot != 0) {
			sum.add(0,pivot);
		}
	}
	
	public static void main(String[] args) {
		AddToArrayForm s = new AddToArrayForm();
		System.out.println(s.addToArrayForm(new int[] {1,2,0,0}, 34));
		System.out.println(s.addToArrayForm(new int[] {2,7,4}, 181));
		System.out.println(s.addToArrayForm(new int[] {2,1,5}, 806));
	}
}
