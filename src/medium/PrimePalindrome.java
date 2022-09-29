package medium;

public class PrimePalindrome {
	
	public int primePalindrome(int N) {
        if (8 <= N && N <= 11) return 11;
        int y;
        for (int x = 1; x < 100000; x++) {
            y = headPalindrome(x) + tailPalindrome(x);
            if (y >= N && isPrime(y)) return y;
        }
        return -1;
    }
    
    boolean isPrime(int x){
    	if (x < 2 || x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
    }
    
    int headPalindrome(int x) {
        if(x < 0) return 0;
        return x *(int) Math.pow(10, getIntegerLength(x)-1);
    }
    
    int tailPalindrome(int x) {
        if(x < 0) return 0;
        return reverseInteger((x - (x%(int)Math.pow(10, 1)))/10,getIntegerLength(x)-1);
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
