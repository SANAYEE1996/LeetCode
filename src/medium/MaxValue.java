package medium;

public class MaxValue {
	
	/**
	 * https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
	 * 1 <= n <= maxSum <= 1,000,000,000 
	 * 0 <= index < n
	 * */
	
	public int maxValue(int n, int index, int maxSum) {
		System.out.println();
		int totalSum = 0;
		int middle = maxSum / n-1;
		while(totalSum <= maxSum){
			middle++;
			int leftSum = sum(index, middle-1);
			int rightSum = sum(n-index-1, middle-1);
			System.out.println("leftSum : " +leftSum+ " middle : " +middle+ " rightSum : " +rightSum);
			totalSum = middle + leftSum + rightSum;
		}
		return middle-1;
	}
	
	private int sum(int length, int max){
		if(length > max){
			return sum(max);
		}
		int headTail = (max*2 - length + 1);
		if(length % 2 == 0){
			return (length/2)*headTail;
		}
		return (length/2)*headTail + headTail/2;
	}

	private int sum(int n){
		if(n % 2== 0){
			return (1+n)*(n/2);
		}
		return (1+n)*(n/2) + (n+1)/2;
	}
}
