package medium;

import java.util.HashSet;
import java.util.PriorityQueue;

public class SmallestInfiniteSet {
	
	private PriorityQueue<Integer> que;
	private HashSet<Integer> set;
	private int smallestValue;
	
	public SmallestInfiniteSet() {
        que = new PriorityQueue<>();
        set = new HashSet<>();
        smallestValue = 1;
    }
    
    public int popSmallest() {
    	if(que.isEmpty()) {
    		smallestValue++;
    		return smallestValue-1;
    	}
    	set.remove(que.peek());
        return que.poll();
    }
    
    public void addBack(int num) {
    	if(!set.contains(num) && smallestValue > num) {
    		que.add(num);
    		set.add(num);
    	}
    }
}
