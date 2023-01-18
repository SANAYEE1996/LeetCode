package medium;

import java.util.ArrayList;
import java.util.Collections;

public class MaxSubarraySumCircular {
	
	private int minIndex;
	private int maxIndex;
	private int sum;
	
	public int maxSubarraySumCircular(int[] nums) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		sum = 0;
		for(int i : nums) {
			sum += i;
		}
		numList.add(sum);
		int[] extraNums = new int[nums.length*2];
		copyExtraArray(extraNums, nums);
		minIndex = 0;
		maxIndex = extraNums.length-1;
		sum *= 2;
		calculate(numList, extraNums);
        return Collections.max(numList);
    }
	
	private void copyExtraArray(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		for(int i = 0; i < b.length; i++) {
			a[i+b.length] = b[i];
		}
	}
	
	private void calculate(ArrayList<Integer> numList, int[] extraNums) {
		int maxLength = extraNums.length/2;
		while(minIndex < maxIndex) {
			if(extraNums[minIndex] < extraNums[maxIndex]) {
				sum -= extraNums[minIndex];
				minIndex++;
				if(maxIndex - minIndex < maxLength) {
					numList.add(sum);
				}
			}
			else if(extraNums[minIndex] > extraNums[maxIndex]) {
				sum -= extraNums[maxIndex];
				maxIndex--;
				if(maxIndex - minIndex < maxLength) {
					numList.add(sum);
				}
			}
			else {
				sameCalculate(numList, extraNums);
			}
		}
	}
	
	private void sameCalculate(ArrayList<Integer> numList, int[] extraNums) {
		int maxLength = extraNums.length/2;
		int copyMinIndex = minIndex;
		int copyMaxIndex = maxIndex;
		while(copyMinIndex < copyMaxIndex && extraNums[copyMinIndex] == extraNums[copyMaxIndex]) {
			copyMinIndex++;
			copyMaxIndex--;
		}
		int value = 0;
		if(extraNums[copyMinIndex] < extraNums[copyMaxIndex]) {
			for(int i = minIndex; i < copyMinIndex+1; i++) {
				value += extraNums[i];
			}
			sum -= value;
			minIndex = copyMinIndex+1;
			if(maxIndex - minIndex < maxLength) {
				numList.add(sum);
			}
		}
		else if(extraNums[copyMinIndex] > extraNums[copyMaxIndex]) {
			for(int i = maxIndex; i > copyMaxIndex-1; i--) {
				value += extraNums[i];
			}
			sum -= value;
			maxIndex = copyMaxIndex-1;
			if(maxIndex - minIndex < maxLength) {
				numList.add(sum);
			}
		}
		else {
			int beforeMaxIndex = maxIndex;
			maxIndex = Math.min(copyMinIndex, copyMaxIndex);
			for(int i = maxIndex+1; i <= beforeMaxIndex; i++) {
				value += extraNums[i];
			}
			sum -= value;
			if(maxIndex - minIndex < maxLength) {
				numList.add(sum);
			}
		}
	}
//System.out.println(Arrays.toString(Arrays.copyOfRange(extraNums, minIndex,  maxIndex)) + " -> "+sum);
	public static void main(String[] args) {
		MaxSubarraySumCircular s = new MaxSubarraySumCircular();
		System.out.println(s.maxSubarraySumCircular(new int[] {1,3,25,1,23}));
		System.out.println(s.maxSubarraySumCircular(new int[] {1, -7, 2, -4, -11, 16, -1, 2}));
		System.out.println(s.maxSubarraySumCircular(new int[] {1,-2,3,-2}));
		System.out.println(s.maxSubarraySumCircular(new int[] {1,-2,99,-2}));
		System.out.println(s.maxSubarraySumCircular(new int[] {5,-3,5}));
		System.out.println(s.maxSubarraySumCircular(new int[] {-3,-2,-3}));
	}
}
