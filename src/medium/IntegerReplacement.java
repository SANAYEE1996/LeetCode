package medium;

import java.util.ArrayList;

public class IntegerReplacement {
	
	public int integerReplacement(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 31; i++) {
			list.add((int)Math.pow(2,i));
		}
		list.add((int)Math.pow(2,31)-1);
		System.out.println(list);
		gogo(list, n);
		int answer = 0;
		
		return answer;
	}
	
	private void gogo(ArrayList<Integer> list, int target) {
		int getIndex = binarySearch(list, target);
		if(list.get(getIndex) == target) {
			System.out.println("the answer is : " +getIndex);
			return;
		}
		System.out.println("target : "+target +"  and its index : " +getIndex);
	}
	
	private int binarySearch(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size()-1;
		int middle = (low + high)/2;
		while(low < high) {
			if(list.get(middle) == target) {
				return middle;
			}
			if(list.get(middle) < target) {
				low = middle + 1;
			}else {
				high = middle - 1;
			}
			middle = (low + high)/2;
		}
		return middle;
	}
	
	public static void main(String[] args) {
		IntegerReplacement s = new IntegerReplacement();
		System.out.println(s.integerReplacement(4));
		System.out.println(s.integerReplacement(513));
		System.out.println(s.integerReplacement(1024));
		System.out.println(s.integerReplacement(7));
	}
}
