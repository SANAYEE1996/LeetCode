package medium;

import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindromeFromArray {
	public int longestPalindrome(String[] words) {
		System.out.println("input : " +Arrays.toString(words));
		HashMap<String, int[]> map = new HashMap<>();
		HashMap<String, Integer> sameCharmap = new HashMap<>();
		String reverseKey;
		for(String s : words) {
			reverseKey = getReverseString(s);
			if(s.charAt(0) == s.charAt(1)) {
				if(sameCharmap.containsKey(s)) {
					sameCharmap.put(s, sameCharmap.get(s) + 1);
					continue;
				}
				sameCharmap.put(s, 1);
				continue;
			}
			if(map.containsKey(s)) {
				map.get(s)[0]++;
			}
			else if(map.containsKey(reverseKey)) {
				map.get(reverseKey)[1]++;
			}
			else {
				map.put(s, new int[] {1,0});
			}
		}
		int answer = 0;
		for(String key : map.keySet()) {
			System.out.println("not same key : " +key + "   and count : " +Arrays.toString(map.get(key)));
			answer += 4*Math.min(map.get(key)[0], map.get(key)[1]);
		}
		int maxSameCount = 0;
		for(String key : sameCharmap.keySet()) {
			System.out.println("same key : " +key + "  and count : " +sameCharmap.get(key));
			maxSameCount = (maxSameCount < sameCharmap.get(key)) ? sameCharmap.get(key) : maxSameCount;
		}
		System.out.println("same String Length : " +answer);
		System.out.println("not same String Length : " +(maxSameCount*2));
        return answer + 2*maxSameCount;
    }
	
	private String getReverseString(String a) {
		StringBuilder sb = new StringBuilder();
		for(int i = a.length()-1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		LongestPalindromeFromArray s = new LongestPalindromeFromArray();
		System.out.println(s.longestPalindrome(new String[] {"lc","cl","gg"}));
		System.out.println(s.longestPalindrome(new String[] {"ab","ty","yt","lc","cl","ab"}));
		System.out.println(s.longestPalindrome(new String[] {"cc","ll","xx"}));
		System.out.println(s.longestPalindrome(new String[] {"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"}));
	}
}
