package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaximumSubarraySum {
	public long maximumSubarraySum(int[] nums, int k) {
//		System.out.println("input : " +Arrays.toString(nums));
        LinkedHashSet<Integer> numSet = new LinkedHashSet<>();
		long nowSum = 0;
		ArrayList<Long> sumList = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			numSet.add(nums[i]);
		}
		Iterator<Integer> iter = numSet.iterator();
		while(iter.hasNext()) {
			nowSum += iter.next();
		}
		if(numSet.size() == k) {
			sumList.add(nowSum);
		}
		int beforeSetSize = numSet.size();
		for(int i = k; i < nums.length; i++) {
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
				nowSum -= nums[i];
				numSet.remove(nums[i]);
				numSet.add(nums[i]);
				if(numSet.size() == k) {
					sumList.add(nowSum);
				}
			}
			beforeSetSize = numSet.size();
		}
//		System.out.println("max value list : "+sumList);
		if(sumList.isEmpty()) {
			return 0;
		}
		return Collections.max(sumList);
    }
}
