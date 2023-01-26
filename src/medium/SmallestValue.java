package medium;

public class SmallestValue {
	public int smallestValue(int n) {
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				n /= i;
				sum += i;
				System.out.println(n + "  i : " +i);
			}
		}
		System.out.println("sum : " +sum);
        return 0;
    }
	
	public static void main(String[] args) {
		SmallestValue s = new SmallestValue();
		System.out.println(s.smallestValue(6));
		System.out.println(s.smallestValue(2));
		System.out.println(s.smallestValue(3));
		System.out.println(s.smallestValue(4));
		System.out.println(s.smallestValue(5));
		System.out.println(s.smallestValue(15));
	}
}
