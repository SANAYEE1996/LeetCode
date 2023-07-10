package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrimePairs {
	
	/**
	 * https://leetcode.com/problems/prime-pairs-with-target-sum/
	 * */
	
	public List<List<Integer>> findPrimePairs(int n) {
		Set<Integer> primeSet = new HashSet<>();
		List<Integer> primeList = new ArrayList<>();
		List<List<Integer>> answerList = new ArrayList<>();
		gogo(n, primeSet, primeList);
		for(int i : primeList){
			if(i > n/2) break;
			if(!primeSet.contains(n-i)) continue;
			answerList.add(Arrays.asList(new Integer[]{i, n-i}));
		}
		return answerList;
	}

	private void gogo(int n, Set<Integer> primeSet, List<Integer> primeList){ 
		boolean[] isPrime = new boolean[n+1];
		
		for(int i = 0; i < isPrime.length; i++){
			isPrime[i] = true;
		}
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(isPrime[i]){
				for(int j = i*i; j<= n; j += i){
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = 1; i < isPrime.length; i++){
			if(!isPrime[i]) continue;
			primeSet.add(i);
			primeList.add(i);
		}
	}
	
	public static void main(String[] args) {
		FindPrimePairs s = new FindPrimePairs();
		System.out.println(s.findPrimePairs(10000));
	}
}
