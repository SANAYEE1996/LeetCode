package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<Integer> minusList = new ArrayList<>();
		List<Integer> zeroList = new ArrayList<>();
		List<Integer> plusList = new ArrayList<>();
		Set<Integer> minusSet = new HashSet<>();
		Set<Integer> zeroSet = new HashSet<>();
		Set<Integer> plusSet = new HashSet<>();
		for(int i : nums){
			if(0 < i) {plusList.add(i); plusSet.add(i);}
			if(i == 0) {zeroList.add(i); zeroSet.add(i);}
			if(i < 0) {minusList.add(i); minusSet.add(i);}
		}
		Set<List<Integer>> answerSet = new HashSet<>();
		int maxPlusValue = !plusList.isEmpty() ? plusList.get(plusList.size()-1) : 0;
		int minMinusValue = !minusList.isEmpty() ? minusList.get(0) : 0;
		for(int i = 0; i < minusList.size()-1; i++){
			int max = minusList.get(i);
			for(int j = minusList.size()-1; j > i; j--){
				int min = minusList.get(j);
				int absValue = Math.abs(max+min);
				if(absValue > maxPlusValue) break;
				if(!plusSet.contains(absValue)) continue;
				answerSet.add(Arrays.asList(new Integer[]{max,min,absValue}));
			}
		}
		for(int i = plusList.size()-1; i > 0; i--){
			int max = plusList.get(i);
			for(int j = 0; j < i; j++){
				int min = plusList.get(j);
				int absValue = -(max+min);
				if(absValue < minMinusValue) break;
				if(!minusSet.contains(absValue)) continue;
				answerSet.add(Arrays.asList(new Integer[]{absValue,min,max}));
			}
		}
		if(!zeroList.isEmpty()){
			for(int i : minusList){
				if(!plusSet.contains(-i)) continue;
				answerSet.add(Arrays.asList(new Integer[]{i,0,-i}));
			}
		}
		if(zeroList.size() > 2) answerSet.add(Arrays.asList(new Integer[]{0,0,0}));
		List<List<Integer>> answerList = new ArrayList<>();
		answerList.addAll(answerSet);
		return answerList;
	}
}
