package medium;

import java.util.ArrayList;

public class PrimeSubOperation {
	
	/**
	 * https://leetcode.com/problems/prime-subtraction-operation/
	 * 1 <= nums.length <= 1000
	 * 1 <= nums[i] <= 1000
	 * */
	
	public boolean primeSubOperation(int[] nums) {
		ArrayList<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		for(int i = 7; i <= 1000; i++){
			if(isPrime(i)){
				primeList.add(i);
			}
		}
		int searchIndex = 0;
		int target = 0;
		for(int i = nums.length-1; i > 0; i--) {
			if(nums[i-1] >= nums[i]) {
				target = nums[i-1] - nums[i];
				searchIndex = binarySearch(primeList, target);
				if(nums[i-1] > primeList.get(searchIndex)) {
					nums[i-1] -= primeList.get(searchIndex);
				}
				if(nums[i-1] >= nums[i]) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isPrime(int n){
		for(int i = 2; i <= Math.sqrt(n)+1; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	private int binarySearch(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size()-1;
		int middle = (low+high)/2;
		
		while(low <= high) {
			if(list.get(middle) <= target) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
			middle = (low+high)/2;
		}
		if(list.get(middle) > target) {
			return middle;
		}
		return middle < list.size()-1 ? middle+1 : middle;
	}
}
