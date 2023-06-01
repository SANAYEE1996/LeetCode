package medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBinaryMatrix {
	
	/**
	 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
	 * */
	

	public int shortestPathBinaryMatrix(int[][] grid) {
		int[] dx = {0,1,0,-1,1,1,-1,-1};
		int[] dy = {-1,0,1,0,1,-1,1,-1};
		int m = grid.length;
		int n = grid[0].length;
		if(grid[0][0] == 1 || grid[m-1][n-1] == 1) {
			return -1;
		}
		boolean[][] visited = new boolean[m][n];
        return bfs(0,0,grid,visited,dx,dy,m,n);
	}

	private int bfs(int x, int y, int[][] maps, boolean[][] visited, int[] dx, int[] dy, int m, int n) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;
		
		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == m - 1 && node.y == n - 1)
				return node.way;

			for (int i = 0; i < 8; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
					if (maps[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new Node(nx, ny, node.way + 1));
					}
				}
			}
		}
		return -1;
	}
}

class Node{
	int x;
	int y;
	int way;
	public Node(int x, int y, int way){
		this.x = x;
		this.y = y;
		this.way = way;
	}
}
