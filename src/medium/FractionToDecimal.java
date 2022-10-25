package medium;

import java.util.Arrays;

public class FractionToDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
        String s = String.valueOf((double)numerator/denominator);
        String[] str = s.split("\\.");
        if(str[1].equals("0")) {
        	return str[0];
        }
        System.out.println(Arrays.toString(str));
		
		return "";
    }
	
	private void expe(String s) {
		
	}
	
	private void gogo(int numerator, int denominator) {
		int i = 0;
		while(i < 10000) {
			if(numerator >= denominator) {
				
			}
			else {
				
			}
			i++;
		}
	}
	
	
}
