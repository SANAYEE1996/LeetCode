package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EqualPairs {
	
	/**
	* https://leetcode.com/problems/equal-row-and-column-pairs/
	*
	**/

	public int equalPairs(int[][] grid) {
		HashMap<List<Integer>, List<Integer>> columnMap = new HashMap<>();
		HashMap<List<Integer>, List<Integer>> rowMap = new HashMap<>();
		for(int i = 0; i < grid.length; i++){
			List<Integer> key =  Arrays.stream(grid[i]).boxed().collect(Collectors.toList());
			if(!columnMap.containsKey(key)){
				columnMap.put(key, new ArrayList<>());
			}
			columnMap.get(key).add(i);
		}
		for(int i = 0; i < grid[0].length; i++){
			List<Integer> key = getRowList(grid, i);
			if(!rowMap.containsKey(key)){
				rowMap.put(key, new ArrayList<>());
			}
			rowMap.get(key).add(i);
		}
		int answer = 0;
		for(List<Integer> key : columnMap.keySet()){
			if(!rowMap.containsKey(key)) continue;
			answer += (columnMap.get(key).size() * rowMap.get(key).size());
		}
		return answer;
	}

	private List<Integer> getRowList(int[][] arr, int row){
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) list.add(arr[i][row]);
		return list;
	}
}
