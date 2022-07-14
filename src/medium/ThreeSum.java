package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		System.out.println(nums.length);
		List<List<Integer>> list = new ArrayList<>();
		HashMap<Integer, Integer> minusValue = new HashMap<>();
		HashMap<Integer, Integer> plusValue = new HashMap<>();
		ArrayList<Integer> minusList = new ArrayList<>();
		ArrayList<Integer> plusList = new ArrayList<>();
		Arrays.sort(nums);
		for(int i : nums) {
			if(i > 0) {
				plusValue.put(i,i);
				plusList.add(i);
			}
			else if(i < 0) {
				minusValue.put(i,i);
				minusList.add(i);
			}
		}
		int plusCount = plusList.size();
		int minusCount = minusList.size();
		int zeroCount = nums.length-(plusCount + minusCount);
		if((plusCount == 0 || minusCount == 0) && zeroCount < 3) return list;
		
		
		if(minusCount > 1 && plusCount > 0) 
			twoMinusOnePlus(minusValue, plusValue, list, minusList, plusList);
		if(minusCount > 0 && plusCount > 1) 
			oneMinusTwoPlus(minusValue, plusValue, list, minusList, plusList);
		if(minusCount > 0 && plusCount > 0 && zeroCount > 0) 
			oneMinusOnePlus(minusValue, plusValue, list, minusList, plusList);
		if(zeroCount > 2) { 
			list.add(new ArrayList<Integer>());
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
		}
		
		System.out.println(list.size());
		return list;
    }
	
	void twoMinusOnePlus(HashMap<Integer, Integer> minusValue,
						 HashMap<Integer, Integer> plusValue,
						 List<List<Integer>> list,
						 ArrayList<Integer> minusList,
						 ArrayList<Integer> plusList) {
		int iValue = 0, jValue = 0, sum = 0;
		int maxPlusValue = plusList.get(plusList.size()-1);
		for(int i = 0; i < minusList.size()-1; i++) {
			iValue = minusList.get(i);
			if(-maxPlusValue > iValue) continue;
			for(int j = i + 1; j < minusList.size(); j++) {
				jValue = minusList.get(j);
				sum = -(iValue + jValue);
				if(plusValue.containsKey(sum)) {
					ArrayList<Integer> exam = new ArrayList<>();
					exam.add(iValue);
					exam.add(jValue);
					exam.add(sum);
					if(!list.contains(exam)) list.add(exam);
				}
			}
		}
	}
	
	void oneMinusTwoPlus(HashMap<Integer, Integer> minusValue,
						 HashMap<Integer, Integer> plusValue,
				 		 List<List<Integer>> list,
						 ArrayList<Integer> minusList,
						 ArrayList<Integer> plusList) {
		int iValue = 0, jValue = 0, sum = 0;
		int minMinusValue = minusList.get(0);
		for(int i = plusList.size()-1; i >= 1; i--) {
			iValue = plusList.get(i);
			if(-minMinusValue < iValue) continue;
			for(int j = i - 1; j >= 0; j--) {
				jValue = plusList.get(j);
				sum = -(iValue + jValue);
				if(minusValue.containsKey(sum)) {
					ArrayList<Integer> exam = new ArrayList<>();
					exam.add(sum);
					exam.add(iValue);
					exam.add(jValue);
					if(!list.contains(exam)) list.add(exam);
				}
			}
		}
	}
	
	void oneMinusOnePlus(HashMap<Integer, Integer> minusValue,
						 HashMap<Integer, Integer> plusValue,
			 			 List<List<Integer>> list,
						 ArrayList<Integer> minusList,
						 ArrayList<Integer> plusList) {
		int iValue = 0;
		for(int i = 0; i < minusList.size(); i++) {
			iValue = -(minusList.get(i));
			if(plusValue.containsKey(iValue)) {
				ArrayList<Integer> exam = new ArrayList<>();
				exam.add(minusList.get(i));
				exam.add(0);
				exam.add(iValue);
				if(!list.contains(exam)) list.add(exam);
			}
		}
	}
	
}
