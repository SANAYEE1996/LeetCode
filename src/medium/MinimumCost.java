package medium;

public class MinimumCost {
	
	/**
	 * 
	 * https://leetcode.com/problems/minimum-cost-to-make-all-characters-equal/
	 * 
	 * 
	 * */
	
	public long minimumCost(String s) {
		if(s.length() == 1) {
			return 0;
		}
		int size = s.length();
		char init = s.charAt(0);
		char middle = s.charAt(size/2);
		long left = 0;
		long right = 0;
		for(int i = 0; i < size/2; i++){
			if(init == s.charAt(i)){
				continue;
			}
			left += (long)i;
			init = s.charAt(i);
		}
		init = s.charAt(size-1);
		for(int i = size-1; i >= (size%2 == 0 ? size/2 : size/2 +1); i--){
			if(init == s.charAt(i)){
				continue;
			}
			right += (long)(size-i-1);
			init = s.charAt(i);
		}
		if(size%2 == 0){
			if(s.charAt(size/2-1) == middle){
				return right+left;
			}
			return right+left+size/2;
		}
		if(s.charAt(size/2-1) == middle && middle == s.charAt(size/2+1)){
			return right+left;
		}
		else if(s.charAt(size/2-1) != middle && middle != s.charAt(size/2+1)){
			return right + left + size-1;
		}
		return right + left + size/2;
	}
}
