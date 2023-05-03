package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindDifference {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<List<Integer>> answerList = new ArrayList<>();
		answerList.add(new ArrayList<>());
		answerList.add(new ArrayList<>());
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i : nums1){
			set1.add(i);
		}
		
		for(int i : nums2){
			set2.add(i);
		}
		
		Iterator<Integer> setIter = set1.iterator();
		int value = 0;
		while(setIter.hasNext()){
			value = setIter.next();
			if(!set2.contains(value)){
				answerList.get(0).add(value);
			}
		}
		
		setIter = set2.iterator();
		while(setIter.hasNext()){
			value = setIter.next();
			if(!set1.contains(value)){
				answerList.get(1).add(value);
			}
		}
		
		return answerList;
	}
}
