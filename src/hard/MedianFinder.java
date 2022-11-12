package hard;

import java.util.ArrayList;

public class MedianFinder {
	
	private ArrayList<Integer> numberList;
	
	public MedianFinder() {
		numberList = new ArrayList<>();
    }
    
    public void addNum(int num) {
    	putNumToList(num);
    }
    
    public double findMedian() {
    	int numberListSize = numberList.size();
        if(numberListSize == 0) {
        	return 0;
        }
        else if(numberListSize % 2 == 0) {
        	return (double)(numberList.get(numberListSize/2) + numberList.get(numberListSize/2-1))/2; 
        }
    	return (double)numberList.get(numberListSize/2);
    }
    
    private void putNumToList(int target) {
    	int low = 0;
    	int high = numberList.size()-1;
    	int mid = 0;
    	if(!numberList.isEmpty() && numberList.get(high) <= target) {
    		numberList.add(target);
    		return;
    	}
    	else if(!numberList.isEmpty() && numberList.get(low) >= target) {
    		numberList.add(0,target);
    		return;
    	}
    	while(low <= high) {
    		mid = (low + high) / 2;

    		if(target == numberList.get(mid)) {
    			break;
    		} 
    		else if(target < numberList.get(mid)) {
    			high = mid - 1;
    		} 
    		else {
    			low = mid + 1;
    		}
    	}
    	if(low >= mid) {
    		numberList.add(low,target);
    		return;
    	}
    	numberList.add(mid, target);
    }
}
