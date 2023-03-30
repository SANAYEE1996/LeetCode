package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperationsList {
	public List<Long> minOperations(int[] nums, int[] queries) {
		List<Long> answerList = new ArrayList<>();
		Arrays.sort(nums);
		long[] sumArray = new long[nums.length];
		makeSumArray(nums, sumArray);
		int valueIndex = 0;
		long gogo = 0;
		for(int i = 0; i < queries.length; i++){
			valueIndex = getbinaryIndex(nums,queries[i]);
			if(nums[valueIndex] <  queries[i]) {
				gogo = (long)(valueIndex+1)*queries[i] - sumArray[valueIndex];
				gogo += (sumArray[sumArray.length-1] - sumArray[valueIndex] - (long)(nums.length-valueIndex-1)*queries[i] );
			}
			else if(nums[valueIndex] ==  queries[i]) {
				gogo = (long)valueIndex*queries[i] - sumArray[valueIndex];
				gogo += (sumArray[sumArray.length-1] - sumArray[valueIndex] - (long)(nums.length-valueIndex-1)*queries[i] );
			}
			else { 
				gogo = (long)valueIndex*queries[i] - sumArray[valueIndex];
				gogo += (sumArray[sumArray.length-1] - sumArray[valueIndex-1 < 0 ? 0 : valueIndex-1] - (long)(nums.length-valueIndex)*queries[i] );
			}
			answerList.add(gogo);
		}
		return answerList;
    }
	
	private void makeSumArray(int[] nums, long[] sumArray){
		long sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += (long)nums[i];
			sumArray[i] = sum;
		}
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
		int[] queries = {1,5};
		System.out.println(s.minOperations(nums, queries));
		nums = new int[] {2,2,2,2,2,2,2,2,2,2};
		
		
	}
}
