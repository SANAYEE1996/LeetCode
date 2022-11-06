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
		long nowSum = 0;
		ArrayList<Long> sumList = new ArrayList<>();
		int firstValue = nums[0];
		for(int i = 0; i < k; i++) {
			nowSum += nums[i];
			numSet.add(nums[i]);
		}
		if(numSet.size() == k) {
			sumList.add(nowSum);
		}
		for(int i = k; i < nums.length; i++) {
			nowSum -= numSet.iterator().next();
			nowSum += nums[i];
			numSet.remove(firstValue);
			numSet.add(nums[i]);
			firstValue = numSet.iterator().next();
			if(numSet.size() == k) {
				sumList.add(nowSum);
			}
		}
		Iterator<Integer> iter = numSet.iterator();
		while(iter.hasNext()) {
			System.out.println("iter :    " +iter.next());
		}
		System.out.println("max value list : "+sumList);
		if(sumList.isEmpty()) {
			return 0;
		}
		return Collections.max(sumList);
    }
}
