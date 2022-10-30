package medium;

import java.util.List;

public class MinimumTotal {
	public int minimumTotal(List<List<Integer>> triangle) {
        int minSum = Integer.MAX_VALUE;
        int length;
        for(int i = 1; i < triangle.size(); i++) {
        	length = triangle.get(i).size();
        	for(int j = 0; j < length; j++) {
        		if(0 < j && j < length-1) {
        			triangle.get(i).set(j, Math.min(triangle.get(i-1).get(j-1) + triangle.get(i).get(j), triangle.get(i-1).get(j) + triangle.get(i).get(j) ));
        		}
        		else if(j == 0) {
        			triangle.get(i).set(j, triangle.get(i-1).get(j) + triangle.get(i).get(j));
        		}
        		else{
        			triangle.get(i).set(j, triangle.get(i-1).get(j-1) + triangle.get(i).get(j));
        		}
        	}
        }
		for(int i : triangle.get(triangle.size()-1)) {
			if(i < minSum) {
				minSum = i;
			}
		}
		return minSum;
    }
}
