package medium;

public class MaximumSwap {
	public int maximumSwap(int num) {
        String numString = String.valueOf(num);
        int maxValue = num;
        String exam = "";
        for(int i = 0; i < numString.length()-1; i++) {
        	for(int j = i+1; j < numString.length(); j++) {
        		exam = swapNumber(numString, i, j);
        		maxValue = Math.max(maxValue, Integer.parseInt(exam));
        	}
        }
		return maxValue;
    }
	
	private String swapNumber(String s, int i, int j) {
		s = s.substring(0, i) + s.charAt(j) + s.substring(i+1, j) + s.charAt(i) + s.substring(j+1);
		return s;
	}
	
	public static void main(String[] args) {
		MaximumSwap s = new MaximumSwap();
		
		System.out.println("test"+s.maximumSwap(2736));
		System.out.println("test"+s.maximumSwap(9973));
	}
}
