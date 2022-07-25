package easy;

import java.util.ArrayList;

public class IsValid {
	public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('!');
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == ')' && list.get(list.size()-1) == '(') list.remove(list.size()-1);
        	else if(s.charAt(i) == ']' && list.get(list.size()-1) == '[') list.remove(list.size()-1);
        	else if(s.charAt(i) == '}' && list.get(list.size()-1) == '{')  list.remove(list.size()-1);
        	else list.add(s.charAt(i));
        }
		
        if(list.size() == 1) return true;
		return false;
    }
}
