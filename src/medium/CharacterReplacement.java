package medium;

public class CharacterReplacement {
	public int characterReplacement(String s, int k) {
		int answer = 1;
		
		int length = 1;
		char lastChar = s.charAt(0);
		int changeCount = k;
		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == lastChar) {
				length++;
			}
			else {
				if(changeCount > 0) {
					length++;
					changeCount--;
				}
				else {
					answer = Math.max(answer, length);
					length = 1;
					lastChar = s.charAt(i);
					changeCount = k;
				}
			}
		}
		
		
        return Math.max(answer, length);
    }
	
	public static void main(String[] args) {
		CharacterReplacement s= new CharacterReplacement();
		
		System.out.println(s.characterReplacement("ABAB", 2));
		System.out.println(s.characterReplacement("AABABBA", 1));
	}
}
