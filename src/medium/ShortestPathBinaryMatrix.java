package medium;

public class ShortestPathBinaryMatrix {
	
	/**
	 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
	 * */
	
	private int count;

	public int shortestPathBinaryMatrix(int[][] grid) {
		count = Integer.MAX_VALUE;
        boolean[] visited = new boolean[grid.length*grid[0].length];
        if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1){
            return -1;
        }
        gogo(grid,0,0,visited,1);
        if(count == Integer.MAX_VALUE){
            return -1;
        }
        return count;
	}

	private void gogo(int[][] grid, int i, int j, boolean[] visited, int way){
        if(i == grid.length-1 && j == grid[i].length-1 && grid[i][j] == 0){
            count = Math.min(count, way);
            return;
        }
        int m = grid.length;
        int n = grid[0].length;
        visited[i*m+j] = true;
        if(i > 0 && !visited[(i-1)*m + j] && grid[i-1][j] == 0){
            gogo(grid, i-1, j, visited.clone(), way+1);
        }
        if(j > 0 && !visited[i*m + j-1] && grid[i][j-1] == 0){
            gogo(grid, i, j-1, visited.clone(), way+1);
        }
        if(i < m-1 && !visited[(i+1)*m + j] && grid[i+1][j] == 0){
            gogo(grid, i+1, j, visited.clone(), way+1);
        }
        if(j < n-1 && !visited[i*m + j+1] && grid[i][j+1] == 0){
            gogo(grid, i, j+1, visited.clone(), way+1);
        }
        if(i > 0 && j > 0 && !visited[(i-1)*m + j-1] && grid[i-1][j-1] == 0){
            gogo(grid, i-1, j-1, visited.clone(), way+1);
        }
        if(i > 0 && j < n-1 && !visited[(i-1)*m + j+1] && grid[i-1][j+1] == 0){
            gogo(grid, i-1, j+1, visited.clone(), way+1);
        }
        if(i < m-1 && j > 0 && !visited[(i+1)*m + j-1] && grid[i+1][j-1] == 0){
            gogo(grid, i+1, j-1, visited.clone(), way+1);
        }
        if(i < m-1 && j < n-1 && !visited[(i+1)*m + j+1] && grid[i+1][j+1] == 0){
            gogo(grid, i+1, j+1, visited.clone(), way+1);
        }
    }
}
