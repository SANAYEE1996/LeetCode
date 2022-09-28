package medium;

public class PrimePalindrome {
	
	static boolean prime[] = new boolean[Integer.MAX_VALUE];
	
	static {
		prime[0] = prime[1] = true;
		int n = Integer.MAX_VALUE-1;
		for(int i = 2; i*i <= n; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}
		for(int i = 1; i <= 100; i++) {
			if(prime[i]) {
				System.out.println(i);
			}
		}
	}
	
	
	public int primePalindrome(int n) {
        while(n <= Integer.MAX_VALUE){
            if(isPrime(n) && isPalindrome(n)){
                return n;
            }
            n++;
        }
        return n;
    }
    
    boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    boolean isPalindrome(int x) {
        if(x < 0) return false;
        int size = getIntegerLength(x);
        int head = (size % 2 == 0) ? x/(int)Math.pow(10, size/2) : x/(int)Math.pow(10, size/2+1);
        int tail = reverseInteger(x%(int)Math.pow(10, size/2),size/2);
        return (head==tail);
    }
    
    int reverseInteger(int n, int size) {
		int mit = 0;
		int answer = 0;
		for(int i = 1; i <= size; i++) {
			mit = (n%(int)Math.pow(10, i))/(int) Math.pow(10, i-1);
			answer += (mit*(int)Math.pow(10, size-i));
			n -= mit*(int) Math.pow(10, i-1);
		}
		return answer;
	}
	
    
    int getIntegerLength(int n) {
    	int count = 0;
    	while(n > 0) {
    		n /= 10;
    		count++;
    	}
    	return count;
    }
}
