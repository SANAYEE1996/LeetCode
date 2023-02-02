package easy;

public class MinCostClimbingStairs {
	
	public int minCostClimbingStairs(int[] cost) {
		for(int i=2;i<cost.length;i++){
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
	
	
	public static void main(String[] args) {
		MinCostClimbingStairs s = new MinCostClimbingStairs();
		
		System.out.println(s.minCostClimbingStairs(new int[] {10,15,20}));
		System.out.println(s.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}
}
