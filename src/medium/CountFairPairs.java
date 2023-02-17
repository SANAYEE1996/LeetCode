package medium;

import java.util.Arrays;

public class CountFairPairs {
	
	public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        binarySearch(nums,lower);
		return 0;
    }
	
	private void binarySearch(int[] array, int target){
		int low = 0;
		int high = array.length-1;
		int mid = (low+high)/2;
		int count = 0;
		while(low < high){
			if(count > 10) {break;}
			count++;
			if(array[mid] == target){
				break;
			}
			else if(array[mid] < target){
				low = mid+1;
				mid = (low+high)/2;
			}
			else{ //target < array[mid]
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		System.out.println("-----mid : " +mid + " is find ? " +(array[mid] == target));
		
	}
	
	public static void main(String[] args) {
		CountFairPairs s = new CountFairPairs();
		//System.out.println(s.countFairPairs(new int[] {0,1,4,4,5,7}, 3, 6));
		s.binarySearch(new int[] {0,1,4,4,5,7}, 2);
		s.binarySearch(new int[] {0,1,4,4,5,7}, 3);
		s.binarySearch(new int[] {0,1,4,4,5,7}, 6);
		s.binarySearch(new int[] {0,1,4,4,5,7}, 7);
	}
}
