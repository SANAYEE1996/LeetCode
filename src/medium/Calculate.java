package medium;

public class Calculate {
	public int calculate(String s) {
        s = s.replaceAll(" ","");
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '*') {
        		int beforeValue = getBeforeValue(s, i);
        		int afterValue = getAfterValue(s, i);
        		i += String.valueOf(afterValue).length();
        	}
        	else if(s.charAt(i) == '*') {
        		int beforeValue = getBeforeValue(s, i);
        		int afterValue = getAfterValue(s, i);
        		i += String.valueOf(afterValue).length();
        	}
        }
        return 0;
    }
	
	private int getBeforeValue(String s, int index) {
		if(index == 0) {
			return 0;
		}
		for(int i = index-1; i >= 0; i--) {
			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
				return Integer.parseInt(s.substring(i+1, index));
			}
		}
		return Integer.parseInt(s.substring(0, index));
	}
	
	private int getAfterValue(String s, int index) {
		for(int i = index+1; i < s.length(); i++) {
			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
				return Integer.parseInt(s.substring(index+1, i));
			}
		}
		return Integer.parseInt(s.substring(index+1));
	}
}
