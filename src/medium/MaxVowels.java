package medium;

public class MaxVowels {
	public int maxVowels(String s, int k) {
		int vowelCount = 0;
		int copy = 0;
		int startIndex = 0;
		for(int i = 0; i < k; i++) {
			if(isVowel(s.charAt(i))) {
				vowelCount++;
			}
		}
		copy = vowelCount;
		for(int i = k; i < s.length(); i++) {
			if(isVowel(s.charAt(startIndex))) {
				copy--;
			}
			if(isVowel(s.charAt(i))) {
				copy++;
			}
			vowelCount = Math.max(copy, vowelCount);
			startIndex++;
		}
		
		return vowelCount;
    }
	
	private boolean isVowel(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		MaxVowels s = new MaxVowels();
		
		System.out.println(s.maxVowels("leetcode", 3));
	}
}
