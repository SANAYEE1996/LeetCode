package medium;

public class MaxDistanceReverseIncreasing {
	
	public int maxDistance(int[] nums1, int[] nums2) {
		int max = 0;
		for(int i = 0; i < nums1.length; i++){
			max = Math.max(max, reverseBinarySearch(nums2, nums1[i])-i);
		}
		return max;
	}

	private int reverseBinarySearch(int[] num, int target){
		int low = 0, high = num.length-1;
		int mid = (low + high)/2;
		while(low < high){
			if(target <= num[mid]){
				low = mid + 1;
				mid = (low + high)/2;
			}else{
				high = mid - 1;
				mid = (low + high)/2;
			}
		}
		if(num[mid] < target) {
			mid--;
		}
		return mid < 0 ? 0 : mid;
	}
}
