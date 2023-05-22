package medium;

public class RemoveDuplicatesString {
	
	/**
	 * 
	 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
	 * 
	 * 1 <= s.length <= 100,000
	 * 
	 * */
	
	public String removeDuplicates(String s, int k) {
		String snake = "!";
		int snakeLastIndex = 0;
		
		for(int i = 0; i < s.length(); i++){
			snakeLastIndex = snake.length()-1;
			if(snake.charAt(snakeLastIndex) == s.charAt(i) && isSame(snake, k-1, s.charAt(i))){
				snake = snake.substring(0,snakeLastIndex-k+2);
				continue;
			}
			snake += String.valueOf(s.charAt(i));
		}
		
		return snake.substring(1);
	}
	
	private boolean isSame(String s, int k, char c){
		
		int last = s.length()-1;
		if(last-k < 0){
			return false;
		}
		for(int i = last; i > last-k; i--){
			if(s.charAt(i) != c){
				return false;
			}
		}
		return true;
	}
}
