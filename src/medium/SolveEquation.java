package medium;

import java.util.ArrayList;

public class SolveEquation {
	public String solveEquation(String equation) {
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < equation.length(); i++){
			if(isMark(equation.charAt(i))) {
				list.add(equation.substring(i,i+1));
				continue;
			}
			StringBuilder sb = new StringBuilder();
			for(; i < equation.length(); i++) {
				if(isMark(equation.charAt(i))) {
					i--;
					break;
				}
				sb.append(equation.charAt(i));
			}
			list.add(sb.toString());
		}
		int middleIndex = 0;
		char status = '+';
		int leftValue = 0, rightValue = 0;
		String leftX = "", rightX = "";
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("=")) {
				middleIndex = i+1;
				break;
			}
			else if(list.get(i).equals("+")) {
				status = '+';
				continue;
			}
			else if(list.get(i).equals("-")) {
				status = '-';
				continue;
			}
			else if(list.get(i).contains("x")) {
				leftX = getX(leftX, list.get(i), status);
				continue;
			}
			if(status == '+') {
				leftValue += Integer.parseInt(list.get(i));
			}
			else {
				leftValue -= Integer.parseInt(list.get(i));
			}
		}
		status = '+';
		for(int i = middleIndex; i < list.size(); i++) {
			if(list.get(i).equals("+")) {
				status = '+';
				continue;
			}
			else if(list.get(i).equals("-")) {
				status = '-';
				continue;
			}
			else if(list.get(i).contains("x")) {
				rightX = getX(rightX, list.get(i), status);
				continue;
			}
			if(status == '+') {
				rightValue += Integer.parseInt(list.get(i));
			}
			else {
				rightValue -= Integer.parseInt(list.get(i));
			}
		}
		if(rightX.equals(leftX) && leftValue == rightValue) {
			return "Infinite solutions";
		}
		String totalX = getX(leftX, rightX, '-');
		int totalValue = rightValue - leftValue;
		if(totalX.equals("")) {
			return "No solution";
		}
		return "x="+String.valueOf(totalValue/getInteger(totalX));
	}
	
	private boolean isMark(char a) {
		return a == '+' || a == '-' || a == '=';
	}
	
	private String getX(String a, String b, char status) {
		int aInteger = getInteger(a);
		int bInteger = getInteger(b);
		int calculate = 0;
		if(status == '+') {
			calculate = aInteger + bInteger;
		}
		else {
			calculate = aInteger - bInteger;
		}
		if(calculate == 0) {
			return "";
		}
		else if(calculate == 1) {
			return "x";
		}
		else if(calculate == -1) {
			return "-x";
		}
		return String.valueOf(calculate) + "x";
	}
	
	private int getInteger(String x) {
		if(x.equals("")) {
			return 0;
		}
		else if(x.length() == 1) {
			return 1;
		}
		else if(x.equals("-x")) {
			return -1;
		}
		return Integer.parseInt(x.substring(0, x.length()-1));
	}
}
