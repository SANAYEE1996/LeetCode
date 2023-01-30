package easy;

public class Tribonacci {
	public int tribonacci(int n) {
		if(n == 2) {
			return 1;
		}
		else if(n == 1) {
			return 0;
		}
		else if(n == 0) {
			return 0;
		}
		
		int first = 0;
		int second = 1;
		int third = 1;
		
		int answer = 0;
		
		for(int i = 0; i < n-2; i++) {
			answer = first + second + third;
			first = second;
			second = third;
			third = answer;
		}
        
		return answer;
    }
	
	public static void main(String[] args) {
		Tribonacci s= new Tribonacci();
		for(int i = 0; i < 10; i++) {
			System.out.println("input : "+i+" and fibo : "+s.tribonacci(i));
		}
	}
}
