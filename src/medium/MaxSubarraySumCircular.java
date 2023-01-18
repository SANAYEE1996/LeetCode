package medium;

import java.util.ArrayList;
import java.util.Arrays;

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
		System.out.println("extra Array : " +Arrays.toString(extraNums));
		minIndex = 0;
		maxIndex = extraNums.length-1;
		sum *= 2;
		System.out.println("numList : " +numList);
		calculate(numList, extraNums);
		System.out.println("numList : " +numList);
        return 0;
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
		while(minIndex <= maxIndex && maxIndex > 0 && minIndex < extraNums.length) {
			if(extraNums[minIndex] < extraNums[maxIndex]) {
				sum -= extraNums[minIndex];
				minIndex++;
				if(maxIndex - minIndex < maxLength) {
					numList.add(sum);
					System.out.println(Arrays.toString(Arrays.copyOfRange(extraNums, minIndex-1,  maxIndex)) + " -> "+sum);
				}
			}
			else if(extraNums[minIndex] > extraNums[maxIndex]) {
				sum -= extraNums[maxIndex];
				maxIndex--;
				if(maxIndex - minIndex < maxLength) {
					numList.add(sum);
					System.out.println(Arrays.toString(Arrays.copyOfRange(extraNums, minIndex,  maxIndex+1)) + " -> "+sum);
				}
			}
			else {
				int copyMinIndex = minIndex;
				int copyMaxIndex = maxIndex;
				int copyMinSum = 0;
				int copyMaxSum = 0;
				while(copyMinIndex <= copyMaxIndex) {
					copyMinIndex++;
					copyMaxIndex--;
					if(extraNums[copyMinIndex] != extraNums[copyMaxIndex]) {
						break;
					}
				}
				break;
			}
		}
	}
//System.out.println(Arrays.toString(Arrays.copyOfRange(extraNums, minIndex,  maxIndex)) + " -> "+sum);
	public static void main(String[] args) {
		MaxSubarraySumCircular s = new MaxSubarraySumCircular();
		System.out.println(s.maxSubarraySumCircular(new int[] {1,3,25,1,23}));
		System.out.println(s.maxSubarraySumCircular(new int[] {1, -7, 2, -4, -11, 16, -1, 2}));
		System.out.println(s.maxSubarraySumCircular(new int[] {1,-2,3,-2}));
		System.out.println(s.maxSubarraySumCircular(new int[] {5,-3,5}));
	}
}
