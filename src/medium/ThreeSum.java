package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> answerList = new ArrayList<>();
		HashMap<Integer, Integer> plusMap = new HashMap<>();
		HashMap<Integer, Integer> minusMap = new HashMap<>();
		HashMap<Integer, Integer> zeroMap = new HashMap<>();
		
		for(int i : nums) {
			if(i < 0) {
				putValueToMap(minusMap, i);
			}
			else if(i > 0) {
				putValueToMap(plusMap, i);
			}
			else {
				putValueToMap(zeroMap, i);
			}
		}
		
		int twoSum = 0;
		
		for(int plusKey : plusMap.keySet()) {
			for(int minusKey : minusMap.keySet()) {
				twoSum = plusKey + minusKey;
				if(twoSum < 0) {
					putValueToList(plusMap, twoSum, plusKey, minusKey, answerList);
				}
				else if(twoSum > 0) {
					putValueToList(minusMap, twoSum, minusKey, plusKey, answerList);
				}
				else {
					if(!zeroMap.isEmpty()) {
						ArrayList<Integer> examList = new ArrayList<>();
						examList.add(plusKey);
						examList.add(0);
						examList.add(minusKey);
						if(!answerList.contains(examList)) {
							answerList.add(examList);
						}
					}
				}
			}
		}
		
		if(!zeroMap.isEmpty() && zeroMap.get(0) > 2) {
			ArrayList<Integer> examList = new ArrayList<>();
			examList.add(0);
			examList.add(0);
			examList.add(0);
			answerList.add(examList);
		}
		
		return answerList;
    }
	
	private void putValueToMap(HashMap<Integer, Integer> map, int value) {
		if(!map.containsKey(value)) {
			map.put(value, 0);
		}
		map.put(value, map.get(value)+1);
	}
	
	private void putValueToList(HashMap<Integer, Integer> map, int sum, int compareKey, int putKey, List<List<Integer>> answerList) {
		if(map.containsKey(-sum)) {
			if(-sum == compareKey && map.get(compareKey) < 2) {
				return;
			}
			ArrayList<Integer> examList = new ArrayList<>();
			int secondValue = 0;
			if(compareKey > putKey) {
				if(putKey > -sum) {
					secondValue = putKey;
				}
				else {
					secondValue = Math.min(compareKey, -sum);
				}
			}
			else { //compareKey <= putKey
				if(-sum < compareKey) {
					secondValue = compareKey;
				}
				else { //-sum >= compareKey
					secondValue = Math.min(putKey, -sum);
				}
			}
			examList.add(Math.max(compareKey, Math.max(-sum, putKey)));
			examList.add(secondValue);
			examList.add(Math.min(compareKey, Math.min(-sum, putKey)));
			if(!answerList.contains(examList)) {
				answerList.add(examList);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreeSum s = new ThreeSum();
		
		System.out.println(s.threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(s.threeSum(new int[] {0,1,1}));
		System.out.println(s.threeSum(new int[] {0,0,0}));
	}
	
}
