package medium;

import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int sum = 0;
        int leftIndex = 0;
        int rightIndex = numbers.length-1;
        while(true){
            sum = numbers[leftIndex] + numbers[rightIndex];
            if(sum == target){
                answer[0] = leftIndex+1;
                answer[1] = rightIndex+1;
                break;
            }
            else if(sum > target){
                rightIndex = (rightIndex > 0) ? rightIndex-1 : 0;
            }
            else{
                leftIndex = (leftIndex < numbers.length-1) ? leftIndex+1 : numbers.length-1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		TwoSum s = new TwoSum();
		System.out.println(Arrays.toString(s.twoSum(new int[] {2,7,11,15}, 9)));
	}
}
