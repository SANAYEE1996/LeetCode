package hard;

import java.util.ArrayList;

public class MinimumDeviation {
	public int minimumDeviation(int[] nums) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for(int i : nums) {
        	if(i % 2 == 0) {
        		evenList.add(i);
        		continue;
        	}
        	oddList.add(i);
        }
		return 0;
    }
}
