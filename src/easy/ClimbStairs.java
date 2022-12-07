package easy;

public class ClimbStairs {
	public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int a = 1;
        int b = 2;
        int swap = 0;
        for(int i = 2; i < n; i++) {
        	swap = a + b;
        	a = b;
        	b = swap;
        }
        return b;
    }
	
	public static void main(String[] args) {
		ClimbStairs s = new ClimbStairs();
		for(int i = 1; i <= 45; i++) {
			System.out.println(s.climbStairs(i));
		}
	}
}
