package hard;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDeviation {
	public int minimumDeviation(int[] nums) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        putIntegerToList(nums, oddList, evenList);
        Collections.sort(oddList);
        Collections.sort(evenList);
        int minOdd = 0;
        int maxEven = 0;
        if(!oddList.isEmpty() && !evenList.isEmpty()) {
        	minOdd = oddList.get(0)*2;
        	maxEven = getOddFromEven(evenList.get(evenList.size()-1));
        	return Math.abs(maxEven-minOdd);
        }
        else if(oddList.isEmpty()) {
        	minOdd = evenList.get(0);
        	maxEven = getOddFromEven(evenList.get(evenList.size()-1));
        	return Math.abs(maxEven-minOdd);
        }
        else if(evenList.isEmpty()) {
        	minOdd = oddList.get(0)*2;
        	maxEven = oddList.get(1);
        	return Math.abs(maxEven-minOdd);
        }
        
		return 0;
    }
	
	private void putIntegerToList(int[] nums, ArrayList<Integer> oddList, ArrayList<Integer> evenList) {
		for(int i : nums) {
        	if(i % 2 == 0) {
        		evenList.add(i);
        		continue;
        	}
        	oddList.add(i);
        }
	}
	
	private int getOddFromEven(int even) {
		while(even%2 == 0) {
			even /= 2;
		}
		return even;
	}
	
}
