package medium;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        int[] copyArr = arr.clone();
        int firstIndex = 0;
        int lastIndex = k-1;
        int minSum = 0;
        int sum = 0;
        for(int i = 0; i < copyArr.length; i++) {
        	copyArr[i] = Math.abs(copyArr[i]-x);
        }
        for(int i = 0; i <= lastIndex; i++) {
        	minSum += copyArr[i];
        }
        sum = minSum;
        for(int i = 1; i <= arr.length-k; i++) {
        	sum -= copyArr[i-1];
        	sum += copyArr[i+k-1];
        	if(sum < minSum) {
        		minSum = sum;
        		firstIndex = i;
        		lastIndex = i+k-1;
        	}
        }
        for(int i = firstIndex; i <= lastIndex; i++) {
        	answer.add(arr[i]);
        }
        return answer;
    }
}
