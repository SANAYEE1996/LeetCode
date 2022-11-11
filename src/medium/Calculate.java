package medium;

public class Calculate {
	public int calculate(String s) {
        s = s.replaceAll(" ","");
//        System.out.println("input : " + s);
        int value = 0;
        int startIndex = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(48 <= s.charAt(i) && s.charAt(i) <= 57) {
        		value = (i == 0) ? getAfterValue(s, i-1) : (s.charAt(i-1) == '-') ? -getAfterValue(s, i-1) : getAfterValue(s, i-1);
        		startIndex = i + String.valueOf(value).length()-1;
        		break;
        	}
        }
//        System.out.println("value : " +value + " // start Index : " +startIndex);
        int attachValue = 0;
        int attachAfterValue = 0;
        char beforeStatus = 0;
        for(int i = startIndex; i < s.length(); i++) {
        	if(s.charAt(i) == '*') {
        		if(beforeStatus == 0) {
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			value *= attachAfterValue;
        		}
        		else if(beforeStatus == '-') {
        			value += attachValue;
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			attachValue *= attachAfterValue;
        			value -= attachValue;
        		}
        		else if(beforeStatus == '+') {
        			value -= attachValue;
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			attachValue *= attachAfterValue;
        			value += attachValue;
        		}
        	}
        	else if(s.charAt(i) == '/') {
        		if(beforeStatus == 0) {
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			value /= attachAfterValue;
        		}
        		else if(beforeStatus == '-') {
        			value += attachValue;
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			attachValue /= attachAfterValue;
        			value -= attachValue;
        		}
        		else if(beforeStatus == '+') {
        			value -= attachValue;
        			attachAfterValue = getAfterValue(s, i);
        			i += String.valueOf(attachAfterValue).length();
        			attachValue /= attachAfterValue;
        			value += attachValue;
        		}
        	}
        	else if(s.charAt(i) == '+') {
        		beforeStatus = s.charAt(i);
        		attachValue = getAfterValue(s, i);
        		i += String.valueOf(attachValue).length();
        		value += attachValue;
        	}
        	else if(s.charAt(i) == '-') {
        		beforeStatus = s.charAt(i);
        		attachValue = getAfterValue(s, i);
        		i += String.valueOf(attachValue).length();
        		value -= attachValue;
        	}
        }
//        System.out.println("last last value : " +value);
        return value;
    }
	
	private int getAfterValue(String s, int index) {
		if(index == s.length()-1) {
			if(s.charAt(index) == '*' || s.charAt(index) == '/') {
				return 1;
			}
			return 0;
		}
		for(int i = index+1; i < s.length(); i++) {
			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
				return Integer.parseInt(s.substring(index+1, i));
			}
		}
		return Integer.parseInt(s.substring(index+1));
	}
}
