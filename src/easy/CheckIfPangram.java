package easy;

import java.util.Arrays;

public class CheckIfPangram {
	public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        char[] str = sentence.toCharArray();
        Arrays.sort(str);
        int sum = 0;
        for(int i = 0; i < str.length-1; i++) {
        	if(str[i+1] - str[i] > 1) {
        		return false;
        	}
        	sum += (str[i+1] - str[i]);
        }
        return sum==25;
    }
	
	public static void main(String[] args) {
		CheckIfPangram s = new CheckIfPangram();
		System.out.println(s.checkIfPangram("abcde"));
		System.out.println(s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(s.checkIfPangram("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbb"));
	}
}
