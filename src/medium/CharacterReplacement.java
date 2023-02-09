package medium;

public class CharacterReplacement {
	public int characterReplacement(String s, int k) {
        int start = 0;
        int[] frequencyMap = new int[26];
        int maxFrequency = 0;
        int longestSubstringLength = 0;

        for (int end = 0; end < s.length(); end += 1) {
        	
            int currentChar = s.charAt(end) - 'A';

            frequencyMap[currentChar] += 1;

            maxFrequency = Math.max(maxFrequency, frequencyMap[currentChar]);

            Boolean isValid = (end + 1 - start - maxFrequency <= k);
            if (!isValid) {
                int outgoingChar = s.charAt(start) - 'A';

                frequencyMap[outgoingChar] -= 1;

                start += 1;
            }

            longestSubstringLength = end + 1 - start;
        }

        return longestSubstringLength;
    }
	
	public static void main(String[] args) {
		CharacterReplacement s= new CharacterReplacement();
		
		System.out.println(s.characterReplacement("ABAB", 2));
		System.out.println(s.characterReplacement("AABABBA", 1));
	}
}
