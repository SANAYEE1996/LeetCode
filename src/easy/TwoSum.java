package easy;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	        int[] answer = new int[2];
	        
	        
	        END:
	        for(int i = 0; i < nums.length-1; i++){
	            answer[0] = i;
	            for(int j = i+1; j < nums.length; j++){
	                if(nums[i]+nums[j] == target){
	                    answer[1] = j;
	                    break END;
	                }
	            }
	        }
	            
	        return answer;
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
