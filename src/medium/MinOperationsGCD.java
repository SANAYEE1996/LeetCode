package medium;

public class MinOperationsGCD {
	public int minOperations(int[] nums) {
		int primeNumber = 0;
		int oneNumber = 0;
		for(int i : nums){
			if(i == 1){
				oneNumber++;
			}
			else if(isPrime(i)){
				primeNumber++;
			}
		}
		if(oneNumber > 0){
			return nums.length - oneNumber;
		}
		else if(primeNumber > 1){
			return nums.length;
		}
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length; j++){
				if(i == j) continue;
				if(gcd(nums[i],nums[j]) == 1){
					return nums.length;
				}
			}
		}
		return -1;
	}

	private boolean isPrime(int a){
		for(int i = 2; i <= Math.sqrt(a); i++){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}

	private int gcd(int a, int b) {
		while(b !=0) {
		  int r=a%b;
		  a=b;
		  b=r;
		}
		return a;
	}

}
