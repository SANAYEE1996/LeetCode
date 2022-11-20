package hard;

public class BasicCalculator {
	
	public int calculate(String s) {
		System.out.println("input : " +s);
		int[] countAddFlag = new int[1];
		char beforePivot = '+';
		char beforeCalSign = '+';
		int calValue = 0;
		int value = 0;
		for(int i = 0; i < s.length(); i++) {
			if(48 <= s.charAt(i) && s.charAt(i) <= 57) {
				calValue = getNumberFromString(s, i, countAddFlag);
				value = (beforeCalSign == '+') ? value + calValue : value - calValue;
			}
			else if(s.charAt(i) == '(') {
				
			}
			else if(s.charAt(i) == ')') {
				
			}
			else if(s.charAt(i) == '+') {
				
			}
		}
		
		return 0;
    }
	
	private int getNumberFromString(String s, int startIndex, int[] countAddFlag) {
		for(int i = startIndex; i < s.length(); i++) {
			if(!(48 <= s.charAt(i) && i <= 57)) {
				return Integer.parseInt(String.valueOf(s.substring(startIndex, i)));
			}
			countAddFlag[0]++;
		}
		return Integer.parseInt(String.valueOf(s.substring(startIndex)));
	}
	
}
