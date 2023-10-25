package medium;

public class KthGrammar {
	
	/**
	 * https://leetcode.com/problems/k-th-symbol-in-grammar/?envType=daily-question&envId=2023-10-25
	 * */
	
	public int kthGrammar(int n, int k) {
		if(n == 1) return 0;
		int min = 1, max = (int) Math.pow(2, n-1);
		int middle = max/2;
		int now = 0;
		while(max - min > 1){
			if(min <= k && k <= middle){
				now = (now == 0) ? 0 : 1;
				max = middle;
				middle = (max - min+1)/2 + min - 1;
			}
			else if(middle < k && k <= max){
				now = (now == 0) ? 1 : 0;
				min = middle+1;
				middle = (max-min+1)/2 + min - 1;
			}
		}
		if(now == 0){
			return (min == k) ? 0 : 1;
		}
		return (min == k) ? 1 : 0;
	}

}
