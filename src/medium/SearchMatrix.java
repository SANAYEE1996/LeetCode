package medium;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		
		for(int[] i : matrix) {
			if(i[0] <= target && target <= i[i.length-1]) {
				return isExist(i, target);
			}
		}
		
        return false;
    }
	
	boolean isExist(int[] array, int target) {
		int mid;
		int low = 0;
		int high = array.length-1;
		while(low <= high) {
			mid = (low + high) / 2;
			if(target == array[mid]) {
				return true;
			}
			else if(target < array[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return false;
	}
}
