package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if(isDescendingOrder(nums)) {
			Arrays.sort(nums);
			return;
		}
		int[] exam;
        for(int i = nums.length-1; i >= 0; i--) {
        	exam = Arrays.copyOfRange(nums, i, nums.length);
        	if(!isDescendingOrder(exam)) {
        		reArray(exam, nums, i);
        		break; // 여기를 브레이크 해줘야 함
        	}
        }
		System.out.println("the answer is : "+Arrays.toString(nums));
    }
	
	boolean isDescendingOrder(int[] slice) {
		for(int i = slice.length-1; i >= 1; i--) {
			if(slice[i-1] < slice[i]) {
				return false;
			}
		}
		return true;
	}
	
	void reArray(int[] exam,int[] nums, int index) {
		ArrayList<Integer> examList = new ArrayList<>();
		for(int i : exam) {
			examList.add(i);
		}
		int firstValue = exam[0];
		Collections.sort(examList);
		Arrays.sort(exam);
		for(int i = 0; i< exam.length; i++) {
			if(exam[i] > firstValue) {
				firstValue = exam[i];
				examList.remove(i);
				break;
			}
		}
		examList.add(0, firstValue);
		int j = 0;
		for(int i = index; i < nums.length; i++) {
			nums[i] = examList.get(j);
			j++;
		}
	}
}	
