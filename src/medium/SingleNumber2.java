package medium;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber2 {
	public int[] singleNumber(int[] nums){
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums){
			if(!set.contains(i)){
				set.add(i);
			}
			else{
				set.remove(i);
			}
		}
		int[] answer = new int[2];
		Iterator<Integer> iter = set.iterator();
		int i = 0;
		while(i < 2){
			answer[i] = iter.next();
			i++;
		}
		return answer;
	}
}
