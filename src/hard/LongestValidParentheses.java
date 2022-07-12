package hard;

import java.util.ArrayList;
import java.util.Collections;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		ArrayList<Integer> indexList = new ArrayList<>();
		ArrayList<Integer> countList = new ArrayList<>();
		if(isRight(s, indexList)) {
			return s.length();
		}
		countList.add(indexList.get(0));
		for(int i = 0; i < indexList.size()-1; i++) {
			countList.add(indexList.get(i+1)-indexList.get(i)-1);
		}
		countList.add(s.length()-indexList.get(indexList.size()-1)-1);
		return Collections.max(countList);
    }
	
	boolean isRight(String s, ArrayList<Integer> indexList) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('!');
        for(int i = 0; i < s.length(); i++) {
        	if(list.get(list.size()-1) =='(' && s.charAt(i) == ')') {
        		list.remove(list.size()-1);
        		indexList.remove(indexList.size()-1);
        	}
        	else {
        		list.add(s.charAt(i));
        		indexList.add(i);
        	}
        }
        if(list.size() == 1) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
}
