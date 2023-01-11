package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinTime {
	
	private int totalCost;
	private int wayCost;
	
	public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
		totalCost = 0;
		wayCost = 0;
		System.out.println("input : " +hasApple);
		HashMap<Integer, int[]> map = new HashMap<>();
		for(int[] i : edges) {
			if(!map.containsKey(i[0])) {
				map.put(i[0], new int[] {i[1],-1});
				continue;
			}
			map.get(i[0])[1] = i[1];
		}
		if(map.containsKey(0)) {
			if(map.get(0)[0] != -1) {
				gogo(map, hasApple, map.get(0)[0]);
			}
			if(map.get(0)[1] != -1) {
				gogo(map, hasApple, map.get(0)[1]);
			}
		}
		
        return totalCost;
    }
	
	private void gogo(HashMap<Integer, int[]> map, List<Boolean> hasApple, int target) {
		if(hasApple.get(target)) {
			System.out.println("cost : " +wayCost +" .. target : "+target +"  /// " +hasApple.get(target));
			totalCost += (wayCost+2);
		}
		if(map.containsKey(target)) {
			wayCost += 2;
			if(map.get(target)[0] != -1) {
				gogo(map, hasApple, map.get(target)[0]);
			}
			if(map.get(target)[1] != -1) {
				gogo(map, hasApple, map.get(target)[1]);
			}
		}
	}
	
	public static void main(String[] args) {
		MinTime s = new MinTime();
		int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
		List<Boolean> hasApple = new ArrayList<>(Arrays.asList(new Boolean[] {false,false,true,false,false,true,false}));
		System.out.println(s.minTime(7, edges, hasApple));
		edges = new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
		hasApple = new ArrayList<>(Arrays.asList(new Boolean[] {false,false,false,false,false,false,false}));
		System.out.println(s.minTime(7, edges, hasApple));
		edges = new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
		hasApple = new ArrayList<>(Arrays.asList(new Boolean[] {false,false,true,false,true,true,false}));
		System.out.println(s.minTime(7, edges, hasApple));
	}
}
