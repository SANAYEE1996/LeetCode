package easy;

public class DetectCapitalUse {
	public boolean detectCapitalUse(String word) {
        for(int i = 1; i < word.length(); i++){
            if(65 <= word.charAt(i) && word.charAt(i) <= 90){
                return false;
            }
        }
        return true;
    }
}
