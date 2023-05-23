package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargest {
	
	private ArrayList<Integer> list;
	private int count;

    public KthLargest(int k, int[] nums) {
    	list = new ArrayList<>();
		this.count = k;
		Arrays.sort(nums);
		for(int i : nums){
			list.add(i);
		}
    }
    
    public int add(int val) {
    	if(list.isEmpty()){
            list.add(val);
            return list.get(list.size()-count);
        }
    	if(val < list.get(0)){
    		list.add(0,val);
    		System.out.println(list);
    		return list.get(list.size()-count);
    	}
    	int binary = binary(list, val);
    	list.add(binary, val);
    	System.out.println(list);
    	return list.get(list.size()-count);
    }
    
    private int binary(ArrayList<Integer> list, int target){
    	int low = 0, high = list.size()-1;
    	int middle = (low+high)/2;
    	while(low <= high){
    		if(target <= list.get(middle)){
    			high = middle-1;
    			middle = (low+high)/2;
    			continue;
    		}
    		low = middle+1;
    		middle = (low+high)/2;
    	}
    	return middle+1;
    }
}
