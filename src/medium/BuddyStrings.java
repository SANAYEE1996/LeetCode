package medium;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {
	public boolean buddyStrings(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		List<Integer> notMatchIndexList = new ArrayList<>();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == goal.charAt(i)){
				continue;
			}
			if(notMatchIndexList.size() > 2){
				return false;
			}
			notMatchIndexList.add(i);
		}
		if(notMatchIndexList.isEmpty()){
			if(checkTwo(s)) return true;
			return false;
		}
		if(notMatchIndexList.size() == 1){
			return false;
		}
		if(s.charAt(notMatchIndexList.get(1)) == goal.charAt(notMatchIndexList.get(0)) &&
		   s.charAt(notMatchIndexList.get(0)) == goal.charAt(notMatchIndexList.get(1))){
			return true;
	    }
		return false;
	}

	private boolean checkTwo(String s){
		int[] charArray = new int[26];
		for(int i = 0; i < s.length(); i++){
			int index = (int)s.charAt(i) - 97;
			charArray[index]++;
			if(charArray[index] > 1){
				return true;
			}
		}
		return false;
	}
}
