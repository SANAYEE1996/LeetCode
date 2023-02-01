package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) {
        	return new ArrayList<>();
        }
		
		List<Integer> answerList = new ArrayList<>();
		
		int[] originCharacterArray = new int[26];
		int[] compareCharacterArray = new int[26];
		
		for(int i = 0; i < p.length(); i++) {
			originCharacterArray[p.charAt(i)-97]++;
			compareCharacterArray[s.charAt(i)-97]++;
		}
		
		if(equalTwoIntegerArray(originCharacterArray, compareCharacterArray)) {
			answerList.add(0);
		}
		
		int startIndex = 0;
		int lastIndex = p.length();
		for(int i = 0; i < s.length() - p.length(); i++) {
			compareCharacterArray[s.charAt(startIndex)-97]--;
			compareCharacterArray[s.charAt(lastIndex)-97]++;
			if(equalTwoIntegerArray(originCharacterArray, compareCharacterArray)) {
				answerList.add(startIndex+1);
			}
			startIndex++;
			lastIndex++;
		}
		
		return answerList;
    }
	
	private boolean equalTwoIntegerArray(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		FindAnagrams s= new FindAnagrams();
		System.out.println(s.findAnagrams("cbaebabacd", "abc"));
		System.out.println(s.findAnagrams("abab", "ab"));
		
		System.out.println(s.findAnagrams("abcd", "abcd"));
		System.out.println(s.findAnagrams("abcd", "abcde"));
		System.out.println(s.findAnagrams("aaaaaa", "a"));
	}
}
