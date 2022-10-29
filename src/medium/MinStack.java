package medium;

import java.util.LinkedList;

public class MinStack {
	
	private LinkedList<Integer> list;
	
	private int minValue;
	
	public MinStack() {
        list = new LinkedList<>();
        minValue = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        list.add(val);
        minValue = (val < minValue) ? val : minValue;
    }
    
    public void pop() {
    	
        list.remove(0);
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
