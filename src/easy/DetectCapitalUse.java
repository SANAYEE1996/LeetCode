package easy;

public class DetectCapitalUse {
	public boolean detectCapitalUse(String word) {
		boolean isFirstWordCapital = 65 <= word.charAt(0) && word.charAt(0) <= 90;
		boolean isBeforeWordCapital = isFirstWordCapital;
        for(int i = 1; i < word.length(); i++){
            if(!isFirstWordCapital && 65 <= word.charAt(i) && word.charAt(i) <= 90){
                return false;
            }
            if(i == 1) {
            	isBeforeWordCapital = (65 <= word.charAt(i) && word.charAt(i) <= 90);
            	continue;
            }
            if(isBeforeWordCapital && 97 <= word.charAt(i) && word.charAt(i) <= 122) {
            	return false;
            }
            else if(!isBeforeWordCapital && 65 <= word.charAt(i) && word.charAt(i) <= 90) {
            	return false;
            }
            isBeforeWordCapital = (65 <= word.charAt(i) && word.charAt(i) <= 90);
        }
        return true;
    }
}
