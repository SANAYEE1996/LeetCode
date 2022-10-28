package medium;


public class FractionToDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
        if(numerator / denominator == 0) {
        	underZero(numerator, denominator);
        }
        else {
        	upZero(numerator, denominator);
        }
		return "";
    }
	
	private void underZero(int numerator, int denominator) {
		StringBuilder sb = new StringBuilder();
		StringBuilder underZeroString = new StringBuilder();
		sb.append(0);
		sb.append(".");
		int originNumerator = numerator;
		int count = 0;
		int quotient;
        int remainder;
        int i;
        while(count < 1000) {
        	quotient = numerator / denominator;
        	remainder = numerator % denominator;
        	numerator = remainder*10;
        	i = 1;
        	while(numerator / denominator == 0) {
        		numerator *= (int)Math.pow(10, i);
        		underZeroString.append(0);
        		i++;
        	}
        	quotient = numerator / denominator;
        	underZeroString.append(quotient);
        	remainder = numerator % denominator;
        	numerator = remainder;
        	if(remainder == originNumerator) {
        		break;
        	}
        	count++;
        }
        System.out.println(underZeroString.toString());
	}
	
	private void upZero(int numerator, int denominator) {
		StringBuilder sb = new StringBuilder();
		sb.append(numerator/denominator);
		sb.append(".");
		int count = 0;
		int quotient;
        int remainder;
        while(count < 1000) {
        	
        	
        	count++;
        }
	}
	
	
	
}
