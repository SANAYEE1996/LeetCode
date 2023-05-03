package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindDifference {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<List<Integer>> answerList = new ArrayList<>();
		answerList.add(new ArrayList<>());
		answerList.add(new ArrayList<>());
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i : nums1){
			if(!binarySearch(nums2,i)){
				set1.add(i);
			}
		}
		for(int i : nums2){
			if(!binarySearch(nums1,i)){
				set2.add(i);
			}
		}
		Iterator<Integer> setIter = set1.iterator();
		while(setIter.hasNext()){
			answerList.get(0).add(setIter.next());
		}
		setIter = set2.iterator();
		while(setIter.hasNext()){
			answerList.get(1).add(setIter.next());
		}
		return answerList;
	}

	private boolean binarySearch(int[] nums, int target){

		int low = 0, high = nums.length-1;
		int middle = (low+high)/2;
		
		while(low <= high){
			if(nums[middle] == target){
				return true;
			}else if(nums[middle] < target){
				low = middle + 1;
			}else{
				high = middle - 1;
			}
			middle = (low + high)/2;
		}
		
		return false;
	}
}
