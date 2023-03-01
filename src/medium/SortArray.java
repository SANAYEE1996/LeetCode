package medium;

public class SortArray {
	
	public int[] sortArray(int[] nums) {
		heapSort(nums, nums.length);
		return nums;
    }
	
	private void heapSort(int[] a, int size) {
		 
		if(size < 2) {
			return;
		}
  
		int parentIdx = getParent(size - 1);
		
		for(int i = parentIdx; i >= 0; i--) {
			heapify(a, i, size - 1);
		}
 
		
		for(int i = size - 1; i > 0; i--) {
			swap(a, 0, i);
			heapify(a, 0, i - 1);
		}
		
	}
	
	private int getParent(int child) {
	    return (child - 1) / 2;
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
 
	
	private void heapify(int[] a, int parentIdx, int lastIdx) {
		
	    int leftChildIdx;
	    int rightChildIdx;
	    int largestIdx;
 
	    while((parentIdx * 2) + 1 <= lastIdx) {
	        leftChildIdx = (parentIdx * 2) + 1;
	        rightChildIdx = (parentIdx * 2) + 2;
	        largestIdx = parentIdx;
 
	        if (a[leftChildIdx] > a[largestIdx]) {
	            largestIdx = leftChildIdx;
	        }
 
	        if (rightChildIdx <= lastIdx && a[rightChildIdx] > a[largestIdx]) {
	            largestIdx = rightChildIdx;
	        }
 
	        if (largestIdx != parentIdx) {
	            swap(a, parentIdx, largestIdx);
	            parentIdx = largestIdx;
	        } 
	        else {
	            return;
	        }
	    }
	}
}
