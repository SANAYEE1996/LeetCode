package medium;

public class CountPrimes {
	public int countPrimes(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++){
            if(isPrimeNumber(i)){
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrimeNumber(int n){
        if(n < 4){
            return n == 2 || n == 3;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
		CountPrimes s = new CountPrimes();
		System.out.println(s.countPrimes(2));
		System.out.println(s.countPrimes(5000000));
	}
}
