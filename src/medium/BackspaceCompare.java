package medium;

import java.util.Stack;

public class BackspaceCompare {
	public boolean backspaceCompare(String s, String t) {
        
		Stack<Character> sStack = new Stack<>();
		Stack<Character> tStack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '#') {
				if(!sStack.isEmpty()) {
					sStack.pop();
				}
				continue;
			}
			sStack.add(s.charAt(i));
		}
		
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == '#') {
				if(!tStack.isEmpty()) {
					tStack.pop();
				}
				continue;
			}
			tStack.add(t.charAt(i));
		}
		
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder tBuilder = new StringBuilder();
		
		while(!sStack.isEmpty()) {
			sBuilder.append(sStack.pop());
		}
		
		while(!tStack.isEmpty()) {
			tBuilder.append(tStack.pop());
		}
		
		return sBuilder.toString().equals(tBuilder.toString());
    }
}
