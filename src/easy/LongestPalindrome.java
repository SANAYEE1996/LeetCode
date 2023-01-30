package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), 0);
        	}
        	map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        
        
        int answer = 0;
        
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        
        for(Character key : map.keySet()) {
        	if(map.get(key) % 2 == 0) {
        		evenList.add(map.get(key));
        	}
        	else {
        		oddList.add(map.get(key));
        	}
        }
        
        for(int i : evenList) {
        	answer += i;
        }
        
        if(!oddList.isEmpty()) {
	        Collections.sort(oddList);
	        
	        for(int i = 0; i < oddList.size()-1; i++) {
	        	answer += (oddList.get(i)-1);
	        }
	        answer += oddList.get(oddList.size()-1);
        }
		return answer;
    }
	
	public static void main(String[] args) {
		LongestPalindrome s = new LongestPalindrome();
		
		System.out.println(s.longestPalindrome("abccccdd"));
		System.out.println(s.longestPalindrome("a"));
		System.out.println(s.longestPalindrome("ccc"));
	}
}
