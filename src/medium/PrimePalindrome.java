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
    
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String s = String.valueOf(x);
        String head;
        String tail;
        if(s.length() % 2 == 1) {
        	head = (s.length()/2 > 0) ? s.substring(0, s.length()/2) : s.substring(0,1);
        	tail = (s.length()/2+1 < s.length()) ? s.substring(s.length()/2+1) : s;
        }
        else {
        	head = (s.length()/2 > 0) ? s.substring(0, s.length()/2) : s;
        	tail = (s.length()/2 < s.length()) ? s.substring(s.length()/2) : s;
        }
        return head.equals(getReverseString(tail));
    }
    
    String getReverseString(String s) {
    	StringBuilder sb = new StringBuilder();
    	for(int i = s.length()-1; i >= 0; i--) {
    		sb.append(s.charAt(i));
    	}
    	return sb.toString();
    }
    
}
