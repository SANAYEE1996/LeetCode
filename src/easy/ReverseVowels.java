package easy;

import java.util.ArrayList;

public class ReverseVowels {
	public String reverseVowels(String s) {
        ArrayList<Character> stringCharList = new ArrayList<>();
        ArrayList<Character> vowelList = new ArrayList<>();
        ArrayList<Integer> vowelsIndexList = new ArrayList<>();
        char charOfS = 0;
        for(int i = 0; i < s.length(); i++) {
        	charOfS = s.charAt(i);
        	stringCharList.add(charOfS);
        	if( charOfS == 'a' || charOfS == 'e' || charOfS == 'i' || charOfS == 'o' || charOfS == 'u' ||
        		charOfS == 'A' || charOfS == 'E' || charOfS == 'I' || charOfS == 'O' || charOfS == 'U') {
        		vowelList.add(charOfS);
        		vowelsIndexList.add(i);
        	}
        }
        int j = vowelList.size()-1;
        for(int i = 0; i < vowelsIndexList.size(); i++) {
        	stringCharList.set(vowelsIndexList.get(i), vowelList.get(j));
        	j--;
        }
        StringBuilder sb = new StringBuilder();
        for(char a : stringCharList) {
        	sb.append(a);
        }
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		ReverseVowels s = new ReverseVowels();
		System.out.println(s.reverseVowels("leetcode"));
	}
}
