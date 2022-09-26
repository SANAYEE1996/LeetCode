package medium;

import java.util.ArrayList;

public class EquationsPossible {
	
	/*
	 * ["c==c","b==d","x!=z"]
	 * 
	 * */
	
	public boolean equationsPossible(String[] equations) {
		
		ArrayList<Character> sameList = new ArrayList<>();
		ArrayList<Character> differList = new ArrayList<>();
		
		char head = 0;
		char tail = 0;
		
		for(String s : equations) {
			head = s.charAt(0);
			tail = s.charAt(3);
			if(s.contains("==")) {
				if(differList.contains(head) && differList.contains(tail)) {
					return false;
				}
				if(!sameList.contains(head)) {
					sameList.add(head);
				}
				if(!sameList.contains(tail)) {
					sameList.add(tail);
				}
			}
			else if(s.contains("!=")) {
				if(sameList.contains(head) && sameList.contains(tail)) {
					return false;
				}
				if(!differList.contains(head)) {
					differList.add(head);
				}
				if(!differList.contains(tail)) {
					differList.add(tail);
				}
			}
		}
		
        return true;
    }
}
