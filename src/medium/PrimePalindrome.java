package medium;

public class PrimePalindrome {
	public int primePalindrome(int n) {
        while(n <= Integer.MAX_VALUE){
            if(isPrime(n)){
                if(isPalindrome(n)){
                    return n;
                }
            }
            n++;
        }
        return n;
    }
    
    public boolean isPrime(int n){
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
    
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int size = getIntegerLength(x);
        
        int divideSize = size/2;
        int moduleSize = size/2;
        int head = 0;
        int tail = 0;
        
        if(size%2 == 0) {
        	head = x/(int)Math.pow(10, divideSize);
        	tail = x%(int)Math.pow(10, moduleSize);
        }
        else {
        	head = x/(int)Math.pow(10, divideSize+1);
        	tail = x%(int)Math.pow(10, moduleSize);
        }
        tail = reverseInteger(tail,moduleSize);
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
	
    
    public int getIntegerLength(int n) {
    	int count = 0;
    	while(n > 0) {
    		n /= 10;
    		count++;
    	}
    	return count;
    }
}
