package medium;

import java.util.ArrayList;

public class MultiplyWithNoUseLibrary {
	
	public String multiply(String num1, String num2) {
        int num1Length = num1.length();
        int num2Length = num2.length();
        int maxSize = num1Length + num2Length;
		if(num1Length >= num2Length) {
			return calculate(num1, num2, maxSize);
		}
		return calculate(num2,num1, maxSize);
    }
	
	String calculate(String a, String b, int maxSize) {
		int j = 0;
		ArrayList<String> list = new ArrayList<>();
		for(int i = b.length()-1; i >= 0; i--) {
			list.add(getMultipleStringAndOneNumber(a, b.charAt(i)-48, j, maxSize));
			j++;
		}
		return addAllValue(list);
	}
	
	String getMultipleStringAndOneNumber(String a, int b, int index, int maxSize) {
		StringBuilder sb = new StringBuilder();
		getMiddleValue(sb, a, b);
		int attachHeadSize = maxSize - sb.toString().length() - index;
		attachTail(sb, index);
		attachHead(sb, attachHeadSize);
		return sb.toString();
	}
	
	void getMiddleValue(StringBuilder sb, String a, int b) {
		int pivot = 0;
		int multipleChar = 1;
		for(int i = a.length()-1; i >= 0; i--) {
			multipleChar = (a.charAt(i)-48)*b + pivot;
			pivot = multipleChar/10;
			sb.insert(0, multipleChar%10);
		}
		if(pivot != 0) {
			sb.insert(0, pivot);
		}
	}
	
	void attachTail(StringBuilder sb, int count) {
		for(int i = 0; i < count; i++) {
			sb.append(0);
		}
	}
	
	void attachHead(StringBuilder sb, int count) {
		for(int i = 0; i < count; i++) {
			sb.insert(0,0);
		}
	}
	
	String addAllValue(ArrayList<String> list) {
		int pivot = 0;
		int lastIndex = list.get(0).length()-1;
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = lastIndex; i >= 0; i--) {
			sum = pivot;
			for(String j : list) {
				sum += (j.charAt(i)-48);
			}
			pivot = sum/10;
			sb.insert(0,sum % 10);
		}
		if(pivot != 0) {
			sb.insert(0, pivot);
		}
		return sb.toString().substring(getNotZeroIndex(sb.toString()));
	}
	
	int getNotZeroIndex(String a) {
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != '0') {
				return i;
			}
		}
		return a.length()-1;
	}
	
}
