package easy;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
         
		return nums;
    }
	
	int BSearch(int arr[], int target, int lowIndex) {
	    int high = arr.length - 1;
	    int mid;

	    while(lowIndex <= high) {
	        mid = (lowIndex + high) / 2;

	        if (arr[mid] == target)
	            return mid;
	        else if (arr[mid] > target)
	            high = mid - 1;
	        else
	            lowIndex = mid + 1;
	    }
	    return -1;
	}

}
