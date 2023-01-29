package easy;

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
        
        boolean isOnlyOneCharacter = false;
        
        int answer = 0;
        for(Character key : map.keySet()) {
        	if(map.get(key) == 1 && !isOnlyOneCharacter) {
        		answer += 1;
        		isOnlyOneCharacter = true;
        	}
        	else if(map.get(key) % 2 == 0) {
        		answer += map.get(key);
        	}
        	else if(map.get(key) % 2 != 0) {
        		answer += map.get(key)-1;
        	}
        }
		
		return answer;
    }
	
	public static void main(String[] args) {
		LongestPalindrome s = new LongestPalindrome();
		
		System.out.println(s.longestPalindrome("abccccdd"));
		System.out.println(s.longestPalindrome("a"));
	}
}
