package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
	
	/**
	 * https://leetcode.com/problems/3sum-closest/
	 * */
	
	public int threeSumClosest(int[] nums, int target) {
		int answer = 0;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		for(int i : nums){ list.add(i); }
		
		int firstindex = binary(list, target);
		answer += list.get(firstindex);
		target -= list.get(firstindex);
		list.remove(firstindex);
		
		int secondindex = binary(list, target);
		answer += list.get(secondindex);
		target -= list.get(secondindex);
		list.remove(secondindex);
		
		int thirdIndex = binary(list, target);
		answer += list.get(thirdIndex);
		target -= list.get(thirdIndex);
		list.remove(thirdIndex);
		
		return answer;
	}

	private int binary(List<Integer> list, int target){
		int low = 0, high = list.size()-1;
		int middle = (low+high)/2;
		while(low <= high){
			if(list.get(middle) == target){
				return middle;
			}
			else if(list.get(middle) < target){
				low = middle+1;
			}
			else if(target < list.get(middle)){
				high = middle-1;
			}
			middle = (low+high)/2;
		}
		int originDiffer = Math.abs(target - list.get(middle));
		int beforeDiffer = -1, afterDiffer = -1;
		if(0 < middle) beforeDiffer = Math.abs(target - list.get(middle-1));
		if(middle < list.size()-1) afterDiffer = Math.abs(target - list.get(middle+1));
		
		if(beforeDiffer >= 0 && afterDiffer >= 0){
			if(beforeDiffer <= afterDiffer && beforeDiffer <= originDiffer){
				return middle-1;
			}
			else if(afterDiffer <= beforeDiffer && afterDiffer <= originDiffer){
				return middle+1;
			}
		}
		else if(beforeDiffer >= 0 && beforeDiffer <= originDiffer){
			return middle-1;
		}
		else if(afterDiffer >= 0 && afterDiffer <= originDiffer){
			return middle+1;
		}
		return middle;
	}
}
