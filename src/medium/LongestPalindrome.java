package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
//		System.out.println("input string : " +s);
		int end = s.length();
		int lastIndex = s.length()-1;
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < end; i++) {
			if(i < lastIndex && s.charAt(i) == s.charAt(i+1)) {
				list.add(s.substring(i, i+2));
				even(s, i, lastIndex, list);
			}
			if(i > 0 && i < lastIndex && (s.charAt(i-1) == s.charAt(i+1))) {
				list.add(s.substring(i-1, i+2));
				odd(s, i, lastIndex, list);
			}
		}
		if(list.size() == 0) return s.substring(0, 1);
		
		Collections.sort(list, new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) {
	            return s2.length()-s1.length();
	        }
	    });
		System.out.println(list);
		return list.get(0);
    }
	
	public void even(String s, int index, int lastIndex, ArrayList<String> list) {
		int i = (index-1 >= 0) ? index-1 : 0;
		int j = (index+2 <= lastIndex) ? index+2 : lastIndex;
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){
				i--;
				j++;
				if((i < 0 || j > lastIndex)|| (s.charAt(i) != s.charAt(j))) {
					i += 1;
					break;
				}
			}
			list.add(s.substring(i, j));
		}
	}
	
	public void odd(String s, int index, int lastIndex, ArrayList<String> list) {
		int i = (index-2 >= 0) ? index-2 : 0;
		int j = (index+2 <= lastIndex) ? index+2 : lastIndex;
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){
				i--;
				j++;
				if((i < 0 || j > lastIndex) || (s.charAt(i) != s.charAt(j))) {
					i += 1;
					break;
				}
			}
			list.add(s.substring(i, j));
		}
	}
	

}
