package medium;

public class IsItPossible {
	
	/**
	 * https://leetcode.com/problems/make-number-of-distinct-characters-equal/
	 * 
	 * 1 <= word1.length, word2.length <= 105 
	 * word1 and word2 consist of only lowercase English letters.
	 * 
	 * 
	 * */
	
	public boolean isItPossible(String w1, String w2) {
        int[] m1 = new int[26], m2 = new int[26];
        int c1 = 0, c2 = 0;
        for (char c : w1.toCharArray()) if (m1[c-'a']++ == 0) c1++;
        for (char c : w2.toCharArray()) if (m2[c-'a']++ == 0) c2++;

        if (Math.abs(c1 - c2) > 2) return false; 
        
        for (int i = 0; i < 26; i++) {
            if (m1[i] == 0) continue;
            int a1 = c1, a2 = c2; 
            if (m1[i] == 1) a1--;
            if (m2[i] == 0) a2++;
            for (int j = 0; j < 26; j++) {
                if (m2[j] == 0) continue;

                int b1 = a1, b2 = a2;
                if (i == j) {if (m1[i] == 1) b1++;} 
                else if (m2[j] == 1) b2--; 
                
                if (m1[j] == 0) b1++;
                if (b1 == b2) return true;
            }
        }

        return false;
    }
}
