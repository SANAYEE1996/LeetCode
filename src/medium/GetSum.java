package medium;

public class GetSum {
	
	/**
	 * 
	 * https://leetcode.com/problems/sum-of-two-integers/
	 * Given two integers a and b, 
	 * return the sum of the two integers without using the operators + and -.
	 * 
	 * **/
	
	public int getSum(int a, int b) {
		System.out.println("initial a : " +a + " // initial b : " +b);
		StringBuilder aBuilder = getReverseBinaryString(a);
		StringBuilder bBuilder = getReverseBinaryString(b);
		adjustLength(aBuilder, bBuilder, a, b);
		System.out.println("a : " +aBuilder + " b : " +bBuilder);
		StringBuilder answer = new StringBuilder();
		String x = aBuilder.toString();
		String y = bBuilder.toString();
		int pivot = 0;
		String part = "";
		for(int i = 0; i < x.length(); i++){
			part = partAdd(pivot, x.charAt(i), y.charAt(i));
			if(part.length() == 3){
				pivot = 1;
				answer.append(1);
			}
			else if(part.length() == 2){
				pivot = 1;
				answer.append(0);
			}
			else if(part.length() == 1){
				pivot = 0;
				answer.append(1);
			}
			else{
				pivot = 0;
				answer.append(0);
			}
		}
		if(pivot == 1) {
			answer.append(1);
		}
		
		String sumString = answer.toString();
		int sum = 0;
		for(int i = 0; i < sumString.length(); i++){
			if(sumString.charAt(i) == '1'){
				sum += (int)Math.pow(2,i);
			}
		}
		
		return sum;
	}

	private StringBuilder getReverseBinaryString(int a){
		StringBuilder sb = new StringBuilder();
		String plusBinary = Integer.toBinaryString(a);
		if(a < 0) {
			plusBinary = Integer.toBinaryString(-a);
			String originBinary = Integer.toBinaryString(a);
			sb.append(originBinary.substring(originBinary.length()-plusBinary.length()-1));
			return sb.reverse();
		}
		while(a > 0){
			sb.append(a%2);
			a /= 2;
		}
		sb.append(0);
		return sb;
	}

	private void adjustLength(StringBuilder a, StringBuilder b, int x, int y){
		int aLength = a.toString().length(), bLength = b.toString().length();
		if(aLength > bLength){
			for(int i = 0; i < aLength - bLength; i++){
				if(y < 0) {
					b.append(1);
					continue;
				}
				b.append(0);
			}
		}
		else if(aLength < bLength){
			for(int i = 0; i < bLength - aLength; i++){
				if(x < 0) {
					a.append(1);
					continue;
				}
				a.append(0);
			}
		}
	}

	private String partAdd(int pivot, char x, char y){
		StringBuilder answer = new StringBuilder();
		if(pivot == 1){
			answer.append(1);
		}
		if(x == '1'){
			answer.append(1);
		}
		if(y == '1'){
			answer.append(1);
		}
		return answer.toString();
	}
}
