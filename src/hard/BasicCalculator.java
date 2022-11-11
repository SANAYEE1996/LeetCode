package hard;

public class BasicCalculator {
	
	private int[] lengthArray;
	
	public BasicCalculator() {
		lengthArray = new int[1];
	}
	
	public int calculate(String s) {
		s = s.replaceAll(" ", "");
		System.out.println("input : " +s);
        int value = 0;
        int attachValue = 0;
        char beforeStatus = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	lengthArray[0] = 0;
        	if(s.charAt(i) == '(') {
        		
        	}
        	else if(s.charAt(i) == '+') {
        		value += getAfterValue(s, i);
        		i += lengthArray[0]-1;
        		System.out.println("exam value : " +value);
        		beforeStatus = '+';
        	}
        	else if(s.charAt(i) == '-') {
        		value -= getAfterValue(s, i);
        		i += lengthArray[0];
        	}
        	else {
        		if(beforeStatus == '+') {
        			value += getAfterValue(s, i);
            		i += lengthArray[0];
        		}
        		else if(beforeStatus == '-') {
        			value -= getAfterValue(s, i);
            		i += lengthArray[0];
        		}
        		else {
        			value = getAfterValue(s, i-1);
            		i += lengthArray[0];
        		}
        		System.out.println("init value : " +value);
        	}
        	
        }
        System.out.println("is it answer ? : " +value);
		return 0;
    }
	
	private int getAfterValue(String s, int index) {
		for(int i = index+1; i < s.length(); i++) {
			lengthArray[0]++;
			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
				return Integer.parseInt(s.substring(index+1, i));
			}
		}
		return Integer.parseInt(s.substring(index+1));
	}
}
