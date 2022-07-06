package easy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplication {
	public int[] removeDuplication(int[] waiting) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i : waiting) set.add(i);
        int[] answer = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int i = 0;
        while(iter.hasNext()) {
        	answer[i] = iter.next();
        	i++;
        }
        return answer;
    }
}
