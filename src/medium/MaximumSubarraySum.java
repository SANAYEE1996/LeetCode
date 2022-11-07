package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaximumSubarraySum {
	public long maximumSubarraySum(int[] nums, int k) {
		System.out.println("input : " +Arrays.toString(nums));
        LinkedHashSet<Integer> numSet = new LinkedHashSet<>();
		ArrayList<Long> sumList = new ArrayList<>();
		long[] partSumArray = new long[1];
		int startIndex = getStartIndex(nums, numSet, k, partSumArray);
		long nowSum = partSumArray[0];
		if(numSet.size() == k) {
			sumList.add(nowSum);
		}
		int beforeSetSize = numSet.size();
		for(int i = startIndex; i < nums.length; i++) {
			nowSum += nums[i];
			numSet.add(nums[i]);
			if(beforeSetSize != numSet.size()) {
				if(numSet.size() == k+1) {
					nowSum -= numSet.iterator().next();
					numSet.remove(numSet.iterator().next());
					sumList.add(nowSum);
				}
				else if(numSet.size() == k) {
					sumList.add(nowSum);
				}
			}
			else {
				removePartNumset(numSet, nums[i], partSumArray);
				partSumArray[0] += nums[i];
				nowSum = partSumArray[0];
				numSet.add(nums[i]);
			}
			beforeSetSize = numSet.size();
		}
		System.out.println("max value list : "+sumList);
		if(sumList.isEmpty()) {
			return 0;
		}
		return Collections.max(sumList);
    }
	
	private int getStartIndex(int[] nums, LinkedHashSet<Integer> numSet, int k, long[] partSumArray) {
		int beforeSetSize = numSet.size();
		for(int i = 0; i < k; i++) {
			numSet.add(nums[i]);
			partSumArray[0] += nums[i];
			if(numSet.size() == beforeSetSize) {
				removePartNumset(numSet, nums[i], partSumArray);
				partSumArray[0] += nums[i];
				numSet.add(nums[i]);
				return i+1;
			}
			beforeSetSize = numSet.size();
		}
		return k;
	}
	
	private void removePartNumset(LinkedHashSet<Integer> numSet, int value, long[] partSumArray) {
		Iterator<Integer> iter = numSet.iterator();
		ArrayList<Integer> removeList = new ArrayList<>();
		int target;
		while(iter.hasNext()) {
			target = iter.next();
			removeList.add(target);
			if(target == value) {
				break;
			}
		}
		numSet.removeAll(removeList);
		iter = numSet.iterator();
		partSumArray[0] = 0;
		while(iter.hasNext()) {
			partSumArray[0] += iter.next();
		}
	}
}
