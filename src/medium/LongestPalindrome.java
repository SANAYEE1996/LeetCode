package medium;

import java.util.ArrayList;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
		int end = s.length()/2;
		int lastIndex = s.length()-1;
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i <= end; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				even(s, i, lastIndex, list);
			}
			if(i > 0 && (s.charAt(i-1) == s.charAt(i+1))) {
				odd(s, i, lastIndex, list);
			}
		}
		System.out.println(list);
		return "";
    }
	
	public void even(String s, int index, int lastIndex, ArrayList<String> list) {
		int i = (index-1 >= 0) ? index-1 : 0;
		int j = (index+2 <= lastIndex) ? index+2 : lastIndex;
		System.out.println(index);
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){
				System.out.println("i : " + i + " // j : " +j);
				i--;
				j++;
				if((i < 0 || j > lastIndex)) {
					i += 1;
					j -= 1;
					break;
				}
			}
			list.add(s.substring(i, j));
		}
	}
	
	public void odd(String s, int index, int lastIndex, ArrayList<String> list) {
		int i = index-1;
		int j = (index+1 <= lastIndex) ? index+1 : lastIndex;
		if(s.charAt(i) == s.charAt(j)) {
			while(s.charAt(i) == s.charAt(j)){			
				i--;
				j++;
				if((i < 0 || j > lastIndex)) {
					i += 1;
					j -= 1;
					break;
				}
			}
			list.add(s.substring(i, j));
		}
	}
	

}
