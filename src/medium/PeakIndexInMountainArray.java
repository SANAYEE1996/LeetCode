package medium;

public class PeakIndexInMountainArray {
	
	/**
	 * https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
	 * */
	
	public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= max){
                break;
            }
            max = arr[i];
            maxIndex = i;
        }
        return maxIndex;
    }
}
