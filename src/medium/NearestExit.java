package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NearestExit {
	
	public int nearestExit(char[][] maze, int[] entrance) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        Queue<int[]> que = new LinkedList<>();
        
        visited[entrance[0]][entrance[1]] = true;
        que.offer(new int[] {entrance[0], entrance[1], 0});
        int i = entrance[0], j = entrance[1], length = 0;
        if((i == 0 || i == maze.length-1) && ((0 < j && maze[i][j-1] == '.') || (j < maze[0].length-1 && maze[i][j+1] == '.'))) {
        	return 1;
        }
        if((j == 0 || j == maze[0].length-1) && ((0 < i && maze[i-1][j] == '.') || (i < maze.length-1 && maze[i+1][j] == '.'))) {
        	return 1;
        }
        
        while(!que.isEmpty()) {
        	int[] exam = que.poll();
        	i = exam[0];
        	j = exam[1];
        	length = exam[2];
        	if(i < maze.length-1 && !visited[i+1][j] && maze[i+1][j] != '+') {
        		if(i + 1 == maze.length-1) {
        			return ++length;
        		}
        		visited[i+1][j] = true;
        		que.offer(new int[] {i+1, j, length+1});
        	}
        	if(i > 0 && !visited[i-1][j] && maze[i-1][j] != '+') {
        		if(i - 1 == 0) {
        			return ++length;
        		}
        		visited[i-1][j] = true;
        		que.offer(new int[] {i-1, j, length+1});
        	}
        	if(j < maze[0].length-1 && !visited[i][j+1] && maze[i][j+1] != '+') {
        		if(j + 1 == maze[0].length-1) {
        			return ++length;
        		}
        		visited[i][j+1] = true;
        		que.offer(new int[] {i, j+1, length+1});
        	}
        	if(j > 0 && !visited[i][j-1] && maze[i][j-1] != '+') {
        		if(j - 1 == 0) {
        			return ++length;
        		}
        		visited[i][j-1] = true;
        		que.offer(new int[] {i, j-1, length+1});
        	}
        }
        return -1;
    }
	
}
