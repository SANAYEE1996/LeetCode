package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> minusList = new ArrayList<>();
		ArrayList<Integer> plusList = new ArrayList<>();
		Arrays.sort(nums);
		for(int i : nums) {
			if(i > 0) {
				plusList.add(i);
			}
			else if(i < 0) {
				minusList.add(-i);
			}
		}
		Collections.sort(minusList);
		int plusCount = plusList.size();
		int minusCount = minusList.size();
		int zeroCount = nums.length-(plusCount + minusCount);
		if((plusCount == 0 || minusCount == 0) && zeroCount < 3) return list;
		System.out.println("incoming array : " +Arrays.toString(nums));
		if(minusCount > 1 && plusCount > 0) {
			System.out.println("two minus and one plus");
			twoMinus(list, minusList, plusList);
		}
		if(minusCount > 0 && plusCount > 1) {
			twoPlus(list, minusList, plusList);
		}
		if(minusCount > 0 && plusCount > 0 && zeroCount > 0) {
			oneone(list, minusList, plusList);
		} 
		if(zeroCount > 2) { 
			list.add(new ArrayList<Integer>());
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
		}
		
		return list;
    }
	
	int binSearchReal(int value, ArrayList<Integer> list, int low ,int high) {
	    int mid=0;

	    while(low <= high) {
	        mid = (low + high) / 2;
	        if (list.get(mid) == value) return mid;
	        else if (list.get(mid) > value)  high = mid - 1;
	        else low = mid + 1;
	    }
	    return -1;
	}
	
	int binSearch(int value, ArrayList<Integer> list) {
		int low = 0;
	    int high = list.size()-1;
	    int mid=0;

	    while(low <= high) {
	        mid = (low + high) / 2;
	        if (list.get(mid) == value) return mid;
	        else if (list.get(mid) > value) high = mid - 1;
	        else low = mid + 1;
	    }
	    return mid;
	}
	
	void twoMinus(List<List<Integer>> list,
			 ArrayList<Integer> minusList,
			 ArrayList<Integer> plusList) {
		int index = 0;
		for(int i : plusList) {
			index = binSearch(i, minusList);
			if(index > minusList.size()-1) index--;
			gogoMinus(list, minusList, index, i);
		}
	}
	
	void twoPlus(List<List<Integer>> list,
			 ArrayList<Integer> minusList,
			 ArrayList<Integer> plusList) {
		int index = 0;
		for(int i : minusList) {
			index = binSearch(i, plusList);
			if(index > plusList.size()-1) index--;
			gogoPlus(list, plusList, index, i);
		}
	}
	
	void oneone(List<List<Integer>> list,
			 ArrayList<Integer> minusList,
			 ArrayList<Integer> plusList) {
		int value = 0;
		int index = 0;
		int size = plusList.size();
		for(int i = 0; i < minusList.size(); i++) {
			value = minusList.get(i);
			index = binSearchReal(value, plusList, 0, size-1);
			if(index != -1) putSymmetryValueToList(list, value);
		}
	}
	
	void gogoPlus(List<List<Integer>> list,
			 ArrayList<Integer> plusList,
			 int index, int target) {
		
		int value = 0;
		int result = 0;
		for(int i = 0; i <= index; i++) {
			value = target-plusList.get(i);
			result = binSearchReal(value, plusList, i+1, index);
			if(result != -1) putValueToList(list, plusList, -target, i, result);
		}
	}
	
	void gogoMinus(List<List<Integer>> list,
			 ArrayList<Integer> minusList,
			 int index, int target) {
		
		int value = 0;
		int result = 0;
		for(int i = 0; i <= index; i++) {
			value = target-minusList.get(i);
			result = binSearchReal(value, minusList, i+1, index);
			if(result != -1) putValueToList(list, minusList, target, i, result);
		}
	}
	
	void putSymmetryValueToList(List<List<Integer>> list, int value) {
		ArrayList<Integer> exam = new ArrayList<>();
		exam.add(-value);
		exam.add(0);
		exam.add(value);
		if(!list.contains(exam)) list.add(exam);
	}
	
	void putValueToList(List<List<Integer>> list, ArrayList<Integer> valueList, int target, int i, int result) {
		ArrayList<Integer> exam = new ArrayList<>();
		if(target > 0) {
			exam.add(-valueList.get(i));
			exam.add(-valueList.get(result));
		}
		else {
			exam.add(valueList.get(i));
			exam.add(valueList.get(result));
		}
		exam.add(target);
		Collections.sort(exam);
		if(!list.contains(exam)) list.add(exam);
	}
	
	
	
	
	
	
	

	public int binSearch(int value, int[] array) {
		int low = 0;
	    int high = array.length-1;
	    int mid=0;
	    System.out.println(value + " 는 어디에 속해 있을까 ? " + Arrays.toString(array));
	    while(low <= high) {
	        mid = (low + high) / 2;
	        if (array[mid] == value) 
	        	return mid;
	        else if (array[mid] > value)
	            high = mid - 1;
	        else
	            low = mid + 1;
	    }
	    return mid;
	}
}
