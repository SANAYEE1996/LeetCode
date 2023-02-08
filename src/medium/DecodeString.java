package medium;

import java.util.Stack;

public class DecodeString {
	
	
	public String decodeString(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ']') {
				gogo(stack);
				continue;
			}
			stack.add(s.charAt(i));
		}
		
		while(!stack.empty()) {
			sb.insert(0, stack.pop());
		}
		
		return sb.toString();
    }
	
	private void gogo(Stack<Character> stack) {
		StringBuilder partSb = new StringBuilder();
		while(!stack.empty()) {
			if(stack.peek() == '[') {
				stack.pop();
				break;
			}
			partSb.insert(0, stack.pop());
		}
		StringBuilder numberSb = new StringBuilder();
		while(!stack.empty()) {
			if(!Character.isDigit(stack.peek())) {
				break;
			}
			numberSb.insert(0, stack.pop());
		}
		int frequentNumber = (numberSb.length() == 0) ? 1 : Integer.parseInt(numberSb.toString());
		StringBuilder ship = new StringBuilder();
		String part = partSb.toString();
		for(int i = 0; i < frequentNumber; i++) {
			ship.append(part);
		}
		String attachString = ship.toString();
		for(int i = 0; i < attachString.length(); i++) {
			stack.add(attachString.charAt(i));
		}
	}
	
}
