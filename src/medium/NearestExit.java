package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NearestExit {
	
	public int nearestExit(char[][] maze, int[] entrance) {
		printCharMap(maze);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        Queue<int[]> que = new LinkedList<>();
        
        visited[entrance[0]][entrance[1]] = true;
        que.offer(new int[] {entrance[0], entrance[1], 0});
        int i = 0, j = 0, length = 0;
        
        while(!que.isEmpty()) {
        	int[] exam = que.poll();
        	i = exam[0];
        	j = exam[1];
        	length = exam[2];
        	System.out.println("length : " +length);
        	if(i < maze.length-1 && !visited[i+1][j] && maze[i+1][j] != '+') {
        		if(i + 1 == maze.length-1) {
        			length++;
        			break;
        		}
        		visited[i+1][j] = true;
        		que.offer(new int[] {i+1, j, length+1});
        	}
        	if(i > 0 && !visited[i-1][j] && maze[i-1][j] != '+') {
        		if(i - 1 == 0) {
        			length++;
        			break;
        		}
        		visited[i-1][j] = true;
        		que.offer(new int[] {i-1, j, length+1});
        	}
        	if(j < maze[0].length-1 && !visited[i][j+1] && maze[i][j+1] != '+') {
        		if(j + 1 == maze[0].length-1) {
        			length++;
        			System.out.println("masaka");
        			break;
        		}
        		visited[i][j+1] = true;
        		que.offer(new int[] {i, j+1, length+1});
        	}
        	if(j > 0 && !visited[i][j-1] && maze[i][j-1] != '+') {
        		if(j - 1 == 0) {
        			length++;
        			break;
        		}
        		visited[i][j-1] = true;
        		que.offer(new int[] {i, j-1, length+1});
        	}
        	if(i == 0 || j == 0 || i == maze.length-1 || j == maze[0].length-1) {
        		length++;
        		break;
        	}
        }
        System.out.println("=======");
        return length == 0 ? -1 : length;
    }
	
	private void printCharMap(char[][] maze) {
		for(char[] i : maze) {
			System.out.println(Arrays.toString(i));
		}
	}
	
}
