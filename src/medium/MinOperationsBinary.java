package medium;

public class MinOperationsBinary {
	public int minOperations(int n) {
		return getCloserValue(n)+1;
    }
	
	private int getCloserValue(int n){
		int i = 0;
		while(true){
			if( Math.pow(2,i) <= n && n <= Math.pow(2,i+1) ){
				break;
			}
			i++;
		}
		int min = getOneCountFromBinaryString(Integer.toBinaryString((int) (n-Math.pow(2,i))));
		min = Math.min(min,getOneCountFromBinaryString(Integer.toBinaryString((int) (Math.pow(2,i+1)-n))));
		if(Math.pow(2,i)-n < 0) {
			min = Math.min(min,getOneCountFromBinaryString(toBinaryStringFromMinusInteger((int) (Math.pow(2,i)-n))));
		}
		if(n-Math.pow(2,i+1) < 0) {
			min = Math.min(min,getOneCountFromBinaryString(toBinaryStringFromMinusInteger((int) (n-Math.pow(2,i+1)))));
		}
		return min;
	}
	
	private int getOneCountFromBinaryString(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '1'){count++;}
		}
		return count;
	}
	
	private String toBinaryStringFromMinusInteger(int n){
		String minusBinary = Integer.toBinaryString(n);
		return minusBinary.substring(minusBinary.length()-Integer.toBinaryString(n*-1).length()-1,minusBinary.length());
	}
	
	public static void main(String[] args) {
		
		MinOperationsBinary s = new MinOperationsBinary();
		
		
		System.out.println(s.minOperations(39));
		System.out.println(s.minOperations(54));
		System.out.println(s.minOperations(25));
	}
}
