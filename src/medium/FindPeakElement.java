package medium;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i-1] < nums[i] && i < nums.length-1 && nums[i] > nums[i+1]){
                if(maxValue < nums[i]){
                    maxValue = nums[i];
                    maxValueIndex = i;
                }
            }
            else if(i > 0 && nums[i-1] < nums[i]){
                if(maxValue < nums[i]){
                    maxValue = nums[i];
                    maxValueIndex = i;
                }
            }
            else if(i < nums.length-1 && nums[i] > nums[i+1]){
                if(maxValue < nums[i]){
                    maxValue = nums[i];
                    maxValueIndex = i;
                }
            }
            else{
                if(maxValue < nums[i]){
                    maxValue = nums[i];
                    maxValueIndex = i;
                }
            }
        }
        return maxValueIndex;
    }
}
