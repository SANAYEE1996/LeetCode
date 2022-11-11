package medium;

public class Calculate {
	
	private int value;
	private int attachValue;
	private int attachAfterValue;
	private char beforeStatus;
	private int[] lengthArray;
	
	public Calculate() {
        this.value = 0;
        this.lengthArray = new int[1];
        this.attachValue = 0;
        this.attachAfterValue = 0;
        this.beforeStatus = 0;
	}
	
	public int calculate(String s) {
        s = s.replaceAll(" ","");
        int startIndex = initAndGetStartIndex(s);
        System.out.println("startIndex : " +startIndex);
        for(int i = startIndex; i < s.length(); i++) {
        	lengthArray[0] = 0;
        	if(s.charAt(i) == '*' || s.charAt(i) == '/') {
        		calculateMultipleOrDivide(s, i, s.charAt(i));
        		i += lengthArray[0]-1;
        	}
        	else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
        		calculateAddOrMinus(s, i, s.charAt(i));
        		i += lengthArray[0]-1;
        	}
        }
        return value;
    }
	
	private int initAndGetStartIndex(String s) {
		int startIndex = 0;;
		for(int i = 0; i < s.length(); i++) {
        	if(48 <= s.charAt(i) && s.charAt(i) <= 57) {
        		value = (i == 0) ? getAfterValue(s, i-1) : (s.charAt(i-1) == '-') ? -getAfterValue(s, i-1) : getAfterValue(s, i-1);
        		startIndex = i + lengthArray[0]-2;
        		break;
        	}
        }
		if(startIndex < 0)
			return 0;
		return startIndex;
	}
	
	private void calculateMultipleOrDivide(String s, int index, char nowStatus) {
		if(beforeStatus == 0) {
			attachAfterValue = getAfterValue(s, index);
			value = (nowStatus == '*') ? value * attachAfterValue : value / attachAfterValue;
		}
		else if(beforeStatus == '-' || beforeStatus == '+') {
			calculateAddOrMinusInMultipleOrDivide(s, index, nowStatus);
		}
	}
	
	private void calculateAddOrMinusInMultipleOrDivide(String s, int index, char nowStatus) {
		value = (beforeStatus == '+') ? value - attachValue : value + attachValue;
		attachAfterValue = getAfterValue(s, index);
		attachValue = (nowStatus == '/') ? attachValue/attachAfterValue : attachValue*attachAfterValue;
		value = (beforeStatus == '+') ? value + attachValue : value - attachValue;
	}
	
	private void calculateAddOrMinus(String s, int index, char status) {
		beforeStatus = s.charAt(index);
		attachValue = getAfterValue(s, index);
		value = (status == '+') ? value + attachValue : value - attachValue;
	}
	
	private int getAfterValue(String s, int index) {
		if(index == s.length()-1) {
			if(s.charAt(index) == '*' || s.charAt(index) == '/') {
				return 1;
			}
			return 0;
		}
		for(int i = index+1; i < s.length(); i++) {
			lengthArray[0]++;
			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
				return Integer.parseInt(s.substring(index+1, i));
			}
		}
		return Integer.parseInt(s.substring(index+1));
	}
}
