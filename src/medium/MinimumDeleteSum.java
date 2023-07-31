package medium;

import java.util.LinkedList;
import java.util.List;

public class MinimumDeleteSum {
	
	/**
	 * https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
	 * */
	
	public int minimumDeleteSum(String s1, String s2) {
		String common = getCommonString(s1,s2);
		List<Character> list = new LinkedList<>();
		for(int i = 0; i < common.length(); i++){
			list.add(common.charAt(i));
		}
		List<Character> copy = new LinkedList<>(list);
		int answer = 0;
		for(int i = 0; i < s1.length(); i++){
			if(!copy.isEmpty() && copy.get(0) == s1.charAt(i)){
				copy.remove(0);
				continue;
			}
			answer += (int) s1.charAt(i);
		}
		copy = new LinkedList<>(list);
		for(int i = 0; i < s2.length(); i++){
			if(!copy.isEmpty() && copy.get(0) == s2.charAt(i)){
				copy.remove(0);
				continue;
			}
			answer += (int) s2.charAt(i);
		}
		return answer;
	}

	private String getCommonString(String a, String b){
		int[][] map = new int[a.length()+1][b.length()+1];
		for(int i = 1; i < map.length; i++){
			for(int j = 1; j < map[i].length; j++){
				if(a.charAt(i-1) == b.charAt(j-1)){
					map[i][j] = map[i-1][j-1] + 1;
					continue;
				}
				map[i][j] = Math.max(map[i - 1][j], map[i][j - 1]);
			}
		}
		int i = a.length(), j = b.length();
		StringBuilder sb = new StringBuilder();
		while(map[i][j] != 0){
			if(map[i][j] == map[i-1][j] && map[i][j] == map[i][j-1]) {
				if((int) a.charAt(i-1) >= (int) a.charAt(i-2)) {
					i -= 1;
					continue;
				}
			}
			else if(map[i][j] == map[i-1][j]){
				i -= 1;
				continue;
			}
			else if(map[i][j] == map[i][j-1]){
				j -= 1;
				continue;
			}
			sb.insert(0,a.charAt(i-1));
			i -= 1;
			j -= 1;
		}
		return sb.toString();
	}
}
