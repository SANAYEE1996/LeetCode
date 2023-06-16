package hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FindWords {
	
	/**
	 * https://leetcode.com/problems/word-search-ii/
	 * 
	 * */
	
	public List<String> findWords(char[][] board, String[] words) {
		List<String> answer = new ArrayList<>();
		HashMap<Character, ArrayList<int[]>> map = new HashMap<>();
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				char key = board[i][j];
				if(!map.containsKey(key)) map.put(key, new ArrayList<>());
				map.get(key).add(new int[]{i,j});
			}
		}
		for(String s : words){
			if(gogo(s, map, board)) answer.add(s);
		}
		return answer;
	}

	private boolean gogo(String s, HashMap<Character, ArrayList<int[]>> map, char[][] board){
		char key = s.charAt(0);
		if(!map.containsKey(key)) return false;
		ArrayList<int[]> pointList = map.get(key);
		for(int[] array : pointList){
			if(gogo(s, array[0], array[1], board)){
				return true;
			}
		}
		return false;
	}

	private boolean gogo(String s, int i, int j, char[][] board){
		Stack<int[]> queue = new Stack<>();
		boolean[][] visited = new boolean[board.length][board[0].length];
		queue.push(new int[]{i,j, 0});
		visited[i][j] = true;
		int x = board.length-1, y = board[0].length-1;
		while(!queue.isEmpty()){
			int[] v = queue.pop();
			int m = v[0], n = v[1], goIndex = v[2];
			if(goIndex == s.length()-1){
				return true;
			}
			if(visited[m][n]) continue;
			visited[m][n] = true;
			if(m > 0){
				queue.push(new int[]{m-1, n, goIndex+1});
			}
			if(n > 0){
				queue.push(new int[]{m, n-1, goIndex+1});
			}
			if(m < x){
				queue.push(new int[]{m+1, n, goIndex+1});
			}
			if(n < y){
				queue.push(new int[]{m, n+1, goIndex+1});
			}
		}
		return false;
	}
}
