package easy;

public class HammingWeight {
	public int hammingWeight(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        for(int i= 0; i < binary.length(); i++) {
        	if(binary.charAt(i) == '1') {answer++;}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		HammingWeight s = new HammingWeight();
		System.out.println(s.hammingWeight(-4));
		
		System.out.println(-7%2 + "  //  " +(-7/2));
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-2));
	}
}
