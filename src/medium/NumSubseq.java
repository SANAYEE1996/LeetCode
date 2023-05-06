package medium;

import java.util.Arrays;

public class NumSubseq {
	public int numSubseq(int[] nums, int target) {
		Arrays.sort(nums);
		int mod = 1_000_000_007;
		int[] power = new int[nums.length];
		power[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = binarySearch(nums, target - nums[i]) - 1;
            if (right >= i) {
                answer += power[right-i];
                answer %= mod;
            }
        }
		
		return answer;
    }
	
	private int binarySearch(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		int middle;
		
		while(low <= high) {
			middle = low+(high - low)/2;
			if(nums[middle] <= target) {
				low = middle+1;
			}
			else {
				high = middle-1;
			}
		}
		
		return low;
	}
	
	public static void main(String[] args) {
		NumSubseq s = new NumSubseq();
		
		int[] a = {3,5,6,7};
		System.out.println(s.numSubseq(a, 9) + "\n");
		a = new int[] {3,3,6,8};
		System.out.println(s.numSubseq(a, 10) + "\n");
		a = new int[] {2,3,3,4,6,7};
		System.out.println(s.numSubseq(a, 12) + "\n");
		a = new int[] {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
		System.out.println(s.numSubseq(a, 22) + "\n");
	}
}
