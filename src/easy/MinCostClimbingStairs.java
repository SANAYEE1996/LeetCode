package easy;

public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        int answer = 1;
		int sum = 0;
        
		for(int i = -1; i < cost.length; i++) {
			if(i+2 < cost.length) {
				if(cost[i+1] < cost[i+2]) {
					
				}
			}
			else {
				if(i + 1 < cost.length) {
					
				}
				else {
					
				}
			}
		}
		
		return 0;
    }
}
