package hard;

import java.util.HashMap;

public class MaxPoints {
	public int maxPoints(int[][] points) {
        
		int maxPoints = 1;
		double value = 0;
		HashMap<Double, Integer> map = new HashMap<>();
		for(int[] i : points) {
			for(int[] j : points) {
				if(i == j) continue;
				if(Math.abs(i[0] - j[0]) == 0) {
					value = Double.MAX_VALUE;
				}
				else {
					value = (i[1] - j[1])/(double)(i[0] - j[0]);
				}
				if(!map.containsKey(value)) {
					map.put(value, 1);
				}
				map.put(value, map.get(value)+1);
				maxPoints = Math.max(maxPoints, map.get(value));
			}
			map.clear();
		}
		return maxPoints;
    }
}
