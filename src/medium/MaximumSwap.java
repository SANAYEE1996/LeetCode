package medium;

public class MaximumSwap {
	public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int maxValue = num;
        for(int i = 0; i < s.length()-1; i++) {
        	for(int j = i+1; j < s.length(); j++) {
        		maxValue = Math.max(maxValue, Integer.parseInt(s.substring(0, i) + s.charAt(j) + s.substring(i+1, j) + s.charAt(i) + s.substring(j+1)));
        	}
        }
		return maxValue;
    }
	
	
	public static void main(String[] args) {
		MaximumSwap s = new MaximumSwap();
		
		System.out.println("test"+s.maximumSwap(2736));
		System.out.println("test"+s.maximumSwap(9973));
	}
}
