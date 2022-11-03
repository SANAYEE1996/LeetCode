package medium;

import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindromeFromArray {
	public int longestPalindrome(String[] words) {
		System.out.println("input : " +Arrays.toString(words));
		HashMap<String, int[]> map = new HashMap<>();
		HashMap<String, Integer> sameCharMap = new HashMap<>();
		String reverseKey;
		for(String s : words) {
			reverseKey = getReverseString(s);
			if(s.charAt(0) == s.charAt(1)) {
				if(sameCharMap.containsKey(s)) {
					sameCharMap.put(s, sameCharMap.get(s) + 1);
					continue;
				}
				sameCharMap.put(s, 1);
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
//			System.out.println("not same key : " +key + "  and count : " +Arrays.toString(map.get(key)));
			answer += 4*Math.min(map.get(key)[0], map.get(key)[1]);
		}
		int maxSameCount = 0;
		String maxSameKey = "";
		for(String key : sameCharMap.keySet()) {
//			System.out.println("same key : " +key + "  and count : " +sameCharMap.get(key));
			if(maxSameCount < sameCharMap.get(key)) {
				maxSameCount = sameCharMap.get(key);
				maxSameKey = key;
			}
		}
		sameCharMap.remove(maxSameKey);
		int sameCount = 0;
		int value = 0;
        boolean onlyOneChance = (maxSameCount > 1) ? true: false;
		for(String key : sameCharMap.keySet()) {
			value = sameCharMap.get(key);
//			System.out.println("same key : " +key + "  's count : " +value + " total count : " +sameCount);
            if(onlyOneChance && value == 1){
                sameCount += 1;
                onlyOneChance = false;
                continue;
            }
			if(maxSameCount >= value) {
				if(value % 2 == 0) {
					sameCount += value;
				}
				else {
					sameCount += (value-1);
				}
			}
		}
//		System.out.println("not same String Length : " +answer);
//		System.out.println("same String Length : " +((maxSameCount+sameCount)*2));
        return answer + ((maxSameCount+sameCount)*2);
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
		System.out.println(s.longestPalindrome(new String[] {"ll","lb","bb","bx","xx","lx","xx","lx","ll","xb","bx","lb","bb","lb","bl","bb","bx","xl","lb","xx"}));
		System.out.println(s.longestPalindrome(new String[] {"nn","nn","hg","gn","nn","hh","gh","nn","nh","nh"}));
		System.out.println(s.longestPalindrome(new String[] {"ga","ac","aa","ag","gc","cg","aa","ac","cg","ga","ga","gg","cg","ca","cg","gg","ca","ag","cc","ag","aa","cg","gg"}));
	}
}
