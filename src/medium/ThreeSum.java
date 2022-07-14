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
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0) {minusIndex.add(i); continue;}
			else if(nums[i] == 0) {zeroIndex.add(i); continue;}
			plusIndex.add(i);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(minusIndex);
		System.out.println(zeroIndex);
		System.out.println(plusIndex);
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
		System.out.println(list.size());
		return list;
    }
	
	void twoMinusOnePlus(ArrayList<Integer> minusIndex, ArrayList<Integer> plusIndex, List<List<Integer>> list, int[] nums) {
		System.out.println("two minus one plus");
		int count = Math.max(minusIndex.size(), plusIndex.size());
		int minus = 0;
		int plus = 0;
		int mIndex = 0;
		int mMaxIndex =  minusIndex.get(minusIndex.size()-1);
		int pIndex = plusIndex.get(plusIndex.size()-1);
		int pMinIndex = plusIndex.get(0);
		while(count > 0) {
			System.out.println("minus Index : " +mIndex + " // plusIndex : " +pIndex);
			minus = nums[mIndex] + nums[mIndex+1];
			plus = nums[pIndex];
			System.out.println("minus Value : " +minus+ " // plus Value : " + plus);
			if(Math.abs(minus) == plus) {
				list.add(new ArrayList<Integer>());
				list.get(list.size()-1).add(nums[mIndex]);
				list.get(list.size()-1).add(nums[mIndex+1]);
				list.get(list.size()-1).add(plus);
				mIndex = (mIndex < mMaxIndex-1) ? mIndex++:mIndex;
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			else if(Math.abs(minus) > plus) {
				mIndex = (mIndex < mMaxIndex-1) ? mIndex++:mIndex;
			}
			else {
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			count--;
		}
	}
	
	void oneMinusTwoPlus(ArrayList<Integer> minusIndex, ArrayList<Integer> plusIndex, List<List<Integer>> list, int[] nums) {
		System.out.println("one minus two plus");
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
			if(Math.abs(minus) == plus) {
				list.add(new ArrayList<Integer>());
				list.get(list.size()-1).add(minus);
				list.get(list.size()-1).add(nums[pIndex-1]);
				list.get(list.size()-1).add(nums[pIndex]);
				mIndex = (mIndex < mMaxIndex) ? mIndex++:mIndex;
				pIndex = (pIndex > pMinIndex+1) ? pIndex--:pIndex;
			}
			else if(Math.abs(minus) > plus) {
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
			plus = nums[pIndex];
			if(Math.abs(minus) == plus) {
				list.add(new ArrayList<Integer>());
				list.get(list.size()-1).add(minus);
				list.get(list.size()-1).add(0);
				list.get(list.size()-1).add(plus);
				mIndex = (mIndex < mMaxIndex) ? mIndex++:mIndex;
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			else if(Math.abs(minus) > plus) {
				mIndex = (mIndex < mMaxIndex) ? mIndex++:mIndex;
			}
			else {
				pIndex = (pIndex > pMinIndex) ? pIndex--:pIndex;
			}
			count--;
		}
		
		
	}
}
