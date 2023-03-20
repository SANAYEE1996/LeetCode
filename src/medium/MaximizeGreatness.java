package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximizeGreatness {
	public int maximizeGreatness(int[] nums) {
		Arrays.sort(nums);

		int beforeValue = nums[0];
		int breakIndex = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++){
			if(beforeValue < nums[i]){
				breakIndex = i;
				break;
			}
			beforeValue = nums[i];
		}
		for(int i = breakIndex; i < nums.length; i++){
			list.add(nums[i]);
		}
		for(int i = 0; i < breakIndex; i++){
			list.add(nums[i]);
		}
		int answer = 0;
		ArrayList<Integer> numsList = new ArrayList<>();
		ArrayList<Integer> examList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > nums[i]){
				answer++;
			}else {
				numsList.add(nums[i]);
				examList.add(list.get(i));
			}
		}
		Collections.sort(numsList);
		Collections.sort(examList);
		int numIndex = 0;
		int examIndex = 0;
		for(int i = 0; i < examList.size(); i++) {
			if(examIndex >= examList.size() || numIndex >= examList.size()) {
				break;
			}
			if(numsList.get(numIndex) < examList.get(examIndex)) {
				answer++;
				numIndex++;
				examIndex++;
			}
			else {
				examIndex++;
			}
		}
		return answer;
    }
}
