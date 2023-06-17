package hard;

import java.util.Arrays;

public class MakeArrayIncreasing {
	public int makeArrayIncreasing(int[] a, int[] b) {
        Arrays.sort(b);
        int answer = 0;
        int beforeValue = 0;
        for(int i = 0; i < a.length-1; i++) {
        	System.out.println("intial array :: " +Arrays.toString(a));
        	if(a[i] < a[i+1]) {
        		beforeValue = a[i];
        		continue;
        	}
        	int middleIndex = binary(b, beforeValue);
    		a[i] = b[middleIndex];
    		beforeValue = a[i];
    		answer++;
    		System.out.println("once change all after modifting :: " +Arrays.toString(a));
    		if(a[i] < a[i+1]) {
        		continue;
        	}
    		middleIndex = binary(b, beforeValue);
    		a[i+1] = b[middleIndex];
    		answer++;
    		System.out.println("second change all after modifting :: " +Arrays.toString(a));
        }
        System.out.println("all after modifting :: " +Arrays.toString(a));
        for(int i = 0; i < a.length-1; i++) {
        	if(a[i] >= a[i+1]) return -1;
        }
		return answer;
    }
	
	
	private int binary(int[] a, int target) {
		int low = 0, high = a.length-1;
		int middle = (low + high)/2;
		while(low <= high) {
			if(a[middle] <= target) {
				low = middle + 1;
				middle = (low + high)/2;
			}
			else if(target < a[middle]) {
				high = middle - 1;
				middle = (low + high)/2;
			}
		}
		if(middle < a.length-1 && a[middle] <= target) return middle+1;
		return middle;
	}
	
	public static void main(String[] args) {
		MakeArrayIncreasing s = new MakeArrayIncreasing();
		int[] a = {1,5,3,6,7};
		int[] b = {1,3,2,4};
		System.out.println(s.makeArrayIncreasing(a, b));
		a = new int[] {1,5,3,6,7};
		b = new int[] {4,3,1};
		System.out.println(s.makeArrayIncreasing(a, b));
		a = new int[] {1,5,3,6,7};
		b = new int[] {1,6,3,3};
		System.out.println(s.makeArrayIncreasing(a, b));
		a = new int[] {0,11,6,1,4,3};
		b = new int[] {5,4,11,10,1,0};
		System.out.println(s.makeArrayIncreasing(a, b));
		
//		int[] a = {2,3,5,6,9,12,14,16,19,23};
//		
//		for(int i = 1; i <= 25; i++) {
//			int index = s.binary(a, i);
//			System.out.println("target : "+i+" and its index ::"+index + " and it should be bigger than " + a[index]);
//		}
	}
}
