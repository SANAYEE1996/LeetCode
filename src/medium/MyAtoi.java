package medium;

public class MyAtoi {
	
	
	public boolean isNumber(String result) {
		for(int i = 0; i < result.length(); i++) {
			if(!Character.isDigit(result.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public String removeZero(String result) {
		int start = 0;
		for(int i = 0; i < result.length(); i++) {
			if(result.charAt(i) != '0') {
				start = i;
				break;
			}
			else if(i == result.length()-1) return "0";
		}
		return result.substring(start);
	}
	
	public int myAtoi(String s) {
		char before = ' ';
        char now = 0;
        int endIndex = 0;
        for(int i = 0; i < s.length(); i++) {
        	now = s.charAt(i);
        	if(Character.isDigit(now)) {
        		before = now;
        		endIndex = i+1;
        		continue;
        	}
        	else if(now == '+' && before == ' ') {
        		before = now;
        		continue;
        	}
        	else if(now == '-' && before == ' '){
        		before = now;
        		continue;
        	}
        	else if(now == ' ' && before == ' '){
        		before = now;
        		continue;
        	}
        	else {
        		endIndex = i+1;
        		break;
        	}
        }
        String result = s.substring(0, endIndex);
        
        result = result.replaceAll(" ", "");
        if(result.length() == 0) return 0;
        
        
		int pivot = 1;
		int start = 0;
		if(result.charAt(0) == '-') {
			pivot = -1;
			start = 1;
		}
		else if(result.charAt(0) == '+') start = 1;
		result = result.substring(start);
		System.out.println("중간 체크 : " +result);
		if(result.length() == 0 || !isNumber(result)) return 0;
		result = removeZero(result);
		if(pivot == 1 && result.length() >= 12) return (int)(Math.pow(2, 31) - 1);
		else if(pivot == -1 && result.length() >= 12) return (int)((-1)*Math.pow(2, 31));
		long value = ((long)pivot)*Long.parseLong(result);
		if(value >= Math.pow(2, 31) - 1 || result.length() >= 12) {
			return (int)(Math.pow(2, 31) - 1);
		}
		else if(value <= (-1)*Math.pow(2, 31) || result.length() >= 12) {
			return (int)((-1)*Math.pow(2, 31));
		}
		else return (int) value;
    }
}
