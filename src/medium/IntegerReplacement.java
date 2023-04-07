package medium;

public class IntegerReplacement {
	
	public int integerReplacement(int n) {
		int answer = 0;
		int left = 0;
		int right = 0;
		while(n != 1){
			answer++;
			if(n % 2 == 0){
				n /= 2;
			}
			else{
				if(n + 1 <= Integer.MAX_VALUE){
					left = commonDivisorCount(n-1);
					right = commonDivisorCount(n+1);
					if(left < right){
						n += 1;
						continue;
					}
					n -= 1;
					continue;
				}
				n -= 1;
			}
		}
		
		return answer;
	}

	private int commonDivisorCount(int number){
		int answer = 1;
		int part = 0;
		
		for(int i = 2; i < Math.sqrt(number) + 1; i++){
			if(number % i == 0){
				part = 0;
				while(number%i == 0){
					number /= i;
					part++;	
				}
				answer *= (part+1);
			}
		}
		
		return answer;
	}
}
