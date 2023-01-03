package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPrimes {
	public int[] closestPrimes(int left, int right) {
        int[] answerArray = {100001, 1000000};
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = left; i <= right; i++) {
        	if(isPrime(i)) {
        		primeList.add(i);
        		if(primeList.size() < 2) {continue;}
        		if(primeList.get(primeList.size()-1) - primeList.get(primeList.size()-2) < answerArray[1] - answerArray[0]) {
        			answerArray[0] = primeList.get(primeList.size()-2);
        			answerArray[1] = primeList.get(primeList.size()-1);
        		}
        	}
        }
        if(primeList.size() < 2) {
        	return new int[] {-1,-1};
        }
        return answerArray;
    }
	
	private boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		else if(n < 4) {
			return true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ClosestPrimes s = new ClosestPrimes();
		System.out.println(Arrays.toString(s.closestPrimes(4, 6)));
		System.out.println(Arrays.toString(s.closestPrimes(10, 19)));
		System.out.println(Arrays.toString(s.closestPrimes(1, 100000)));
		System.out.println(Arrays.toString(s.closestPrimes(19, 31)));
		System.out.println(Arrays.toString(s.closestPrimes(822, 838394)));
	}
}
