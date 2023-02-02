package easy;

public class MinCostClimbingStairs {
	
	private int minSum;
	
	public int minCostClimbingStairs(int[] cost) {
		minSum = Integer.MAX_VALUE;
        gogo(cost, -1, 0, 1);
		return minSum;
    }
	
	private void gogo(int[] cost, int startIndex, int sum, int count) {
		
		if(startIndex + 1 < cost.length) {
			gogo(cost, startIndex+1, sum + cost[startIndex + 1], count+1);
		}
		else {
			minSum = (sum < minSum) ? sum : minSum;
		}
		
		if(startIndex + 2 < cost.length) {
			gogo(cost, startIndex+2, sum + cost[startIndex + 2], count+1);
		}
		else {
			minSum = (sum < minSum) ? sum : minSum;
		}
	}
	
	public static void main(String[] args) {
		MinCostClimbingStairs s = new MinCostClimbingStairs();
		
		System.out.println(s.minCostClimbingStairs(new int[] {10,15,20}));
		System.out.println(s.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}
}
