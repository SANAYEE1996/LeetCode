package easy;

public class NextGreatestLetter {
	public char nextGreatestLetter(char[] letters, char target) {
		for(char i : letters){
			if((int) target < (int) i) return i;
		}
		return letters[0];
	}
}
