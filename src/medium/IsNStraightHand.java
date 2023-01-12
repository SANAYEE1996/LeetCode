package medium;

import java.util.Arrays;
import java.util.LinkedList;

public class IsNStraightHand {
	public boolean isNStraightHand(int[] hand, int groupSize) {
		
		if(hand.length%groupSize != 0) {
			return false;
		}
		
		Arrays.sort(hand);
		
		int lastValue = hand[0];
		LinkedList<Integer> list = new LinkedList<>();
		for(int i : hand) {
			list.add(i);
		}
		list.remove(0);
		int nextValue = 0;
		int index = 0;
		int count = 1;
		while(list.size() > 0) {
			System.out.println("before list : "+list);
			nextValue = list.get(index);
			if(nextValue - lastValue > 1) {
				return false;
			}
			else if(nextValue - lastValue == 0) {
				if(index + 1 < list.size()) {
					index++;
					System.out.println("after list : "+list);
					continue;
				}
				return false;
			}
			count++;
			if(count == groupSize) {
				count = 1;
				list.remove(index);
				lastValue = list.get(0);
				index = 0;
				System.out.println("index : "+index+" // after list : "+list);
				continue;
			}
			lastValue = nextValue;
			list.remove(index);
			index = 0;
			System.out.println("after list : "+list);
		}
		
		
		
        return false;
    }
}
