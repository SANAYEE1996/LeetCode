package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> minusIndex = new ArrayList<>();
		ArrayList<Integer> zeroIndex = new ArrayList<>();
		ArrayList<Integer> plusIndex = new ArrayList<>();
		Arrays.sort(nums);
		for(int i : nums) {
			if(i < 0) {minusIndex.add(i); continue;}
			else if(i == 0) {zeroIndex.add(i); continue;}
			plusIndex.add(i);
		}
		if((minusIndex.size() == 0 || plusIndex.size() == 0) && zeroIndex.size() < 3) return list;
		
		if(minusIndex.size() > 1 && plusIndex.size() > 0) 
			twoMinusOnePlus(minusIndex, plusIndex, list, nums);
		if(minusIndex.size() > 0 && plusIndex.size() > 1) 
			oneMinusTwoPlus(minusIndex, plusIndex, list, nums);
		if(minusIndex.size() > 0 && plusIndex.size() > 0 && zeroIndex.size() > 0) 
			oneMinusOneZeroOnePlus(minusIndex, plusIndex, zeroIndex, list, nums);
		if(zeroIndex.size() > 2) { 
			list.add(new ArrayList<Integer>());
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
			list.get(list.size()-1).add(0);
		}
		
		return list;
    }
	
	void twoMinusOnePlus(ArrayList<Integer> minusIndex, ArrayList<Integer> plusIndex, List<List<Integer>> list, int[] nums) {
		int minusCount = minusIndex.size();
		int plusCount = plusIndex.size();
		int count = Math.max(minusCount, plusCount);
		int minus = 0;
		int plus = 0;
		int mIndex = 0;
		int mMaxIndex =  minusIndex.get(minusIndex.size()-1);
		int pIndex = plusIndex.get(plusIndex.size()-1);
		int pMinIndex = plusIndex.get(0);
		while(count > 0) {
			minus = nums[mIndex] + nums[mIndex+1];
			plus = nums[pIndex];
			if(minus == plus) {
				list.add(new ArrayList<Integer>());
				list.get(list.size()-1).add(mIndex);
				list.get(list.size()-1).add(mIndex+1);
				list.get(list.size()-1).add(pIndex);
				mIndex = (mIndex < mMaxIndex-1) ? mIndex++:mIndex;
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			else if(minus > plus) {
				mIndex = (mIndex < mMaxIndex-1) ? mIndex++:mIndex;
			}
			else {
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			count--;
		}
	}
	
	void oneMinusTwoPlus(ArrayList<Integer> minusIndex, ArrayList<Integer> plusIndex, List<List<Integer>> list, int[] nums) {
		int minusCount = minusIndex.size();
		int plusCount = plusIndex.size();
		int count = Math.max(minusCount, plusCount);
		int minus = 0;
		int plus = 0;
		int mIndex = 0;
		int mMaxIndex =  minusIndex.get(minusIndex.size()-1);
		int pIndex = plusIndex.get(plusIndex.size()-1);
		int pMinIndex = plusIndex.get(0);
		while(count > 0) {
			minus = nums[mIndex];
			plus = nums[pIndex] + nums[pIndex-1];
			if(minus == plus) {
				list.add(new ArrayList<Integer>());
				list.get(list.size()-1).add(mIndex);
				list.get(list.size()-1).add(mIndex+1);
				list.get(list.size()-1).add(pIndex);
				mIndex = (mIndex < mMaxIndex) ? mIndex++:mIndex;
				pIndex = (pIndex > pMinIndex+1) ? pIndex--:pIndex;
			}
			else if(minus > plus) {
				mIndex = (mIndex < mMaxIndex) ? mIndex++:mIndex;
			}
			else {
				pIndex = (pIndex > pMinIndex+1) ? pIndex--:pIndex;
			}
			count--;
		}
		
	}
	
	void oneMinusOneZeroOnePlus(ArrayList<Integer> minusIndex, ArrayList<Integer> plusIndex, 
								ArrayList<Integer> zeroIndex, List<List<Integer>> list, int[] nums) {
		
		
		
	}
}
