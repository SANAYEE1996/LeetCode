package hard;

import java.util.ArrayList;
import java.util.Collections;

public class MiddleValue {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : nums1) {
			list.add(i);
		}
		
		for(int i : nums2) {
			list.add(i);
		}
		
		Collections.sort(list);
		
		if(list.size() % 2 == 0) {
			return (double)(list.get(list.size()/2)+list.get(list.size()/2 - 1))/2;
		}
		else {
			return (double)list.get(list.size()/2);
		}
    }

	public static void main(String[] args) {
		MiddleValue s = new MiddleValue();
		
		int[] a = {1,2};
		int[] b = {3,4};
		
		System.out.println("the answer is : " +s.findMedianSortedArrays(a, b));

	}

}
