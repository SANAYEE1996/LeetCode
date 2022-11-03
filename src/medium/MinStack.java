package medium;

import java.util.ArrayList;

public class MinStack {
	
	private ArrayList<Integer> list;
	
	private int minValue;
	
	public MinStack() {
        list = new ArrayList<>();
        minValue = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        list.add(val);
        minValue = (val < minValue) ? val : minValue;
    }
    
    public void pop() {
    	if(list.size() > 0) {
    		list.remove(list.size()-1);
    		int minValueExam = Integer.MAX_VALUE;
    		for(int i = 0; i < list.size(); i++) {
    			minValueExam = (list.get(i) < minValueExam) ? list.get(i) : minValueExam;
    		}
    		minValue = (minValueExam == Integer.MAX_VALUE) ? 0 : minValueExam;
    		return;
    	}
    }
    
    public int top() {
        if(list.size() > 0) {
        	return list.get(list.size()-1);
        }
    	return 0;
    }
    
    public int getMin() {
    	return minValue;
    }
}
