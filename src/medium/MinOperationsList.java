package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperationsList {
	public List<Long> minOperations(int[] nums, int[] queries) {
		List<Long> answerList = new ArrayList<>();
		Arrays.sort(nums);
		
		
		
		return answerList;
    }
	
	private int getbinaryIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int middle = (low+high)/2;
		while(low <= high) {
			if(nums[middle] == target) {
				return middle;
			}
			else if(target < nums[middle]) {
				high = middle-1;
				middle = (low+high)/2;
			}
			else if(nums[middle] < target) {
				low = middle+1;
				middle = (low+high)/2;
			}
		}
		return middle;
	}
	
	public static void main(String[] args) {
		MinOperationsList s = new MinOperationsList();
		int[] nums = {1,3,6,8,10,13,27};
		int index = 0;
		for(int i = 1; i <= 30; i++) {
			index = s.getbinaryIndex(nums, i);
			System.out.print("nums["+index+"] 값 "+nums[index]+" 은 ");
			if(nums[index] <  i) {
				System.out.println("target "+i+" 보다 작아요");
			}
			else if(nums[index] ==  i) {
				System.out.println("target "+i+" 이랑 같습니다");
			}
			else {
				System.out.println("target "+i+" 보다 커요");
			}
		}
		nums = new int[] {2,2,2,2,2,2,2,2,2,2};
		for(int i = 1; i <= 3; i++) {
			index = s.getbinaryIndex(nums, i);
			System.out.print("nums["+index+"] 값 "+nums[index]+" 은 ");
			if(nums[index] <  i) {
				System.out.println("target "+i+" 보다 작아요");
			}
			else if(nums[index] ==  i) {
				System.out.println("target "+i+" 이랑 같습니다");
			}
			else {
				System.out.println("target "+i+" 보다 커요");
			}
		}
		
	}
}
