package hard;

public class UniquePathsIII {
	
	private int totalWayCount;

	public int uniquePathsIII(int[][] grid) {
		totalWayCount = 0;
		int m = grid.length, n = grid[0].length;
		int x = 0, y = 0;
		boolean[] visited = new boolean[m*n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == -1) visited[n*i + j] = true;
				if(grid[i][j] == 1){ x = i; y = j;}
			}
		}
		gogo(grid, x, y, visited.clone());
		return totalWayCount;
	}

	private void gogo(int[][] grid, int i, int j, boolean[] visited){
		int n = grid[0].length;
		visited[i*n + j] = true;
		if(grid[i][j] == 2){
			if(isAllVisited(visited)) totalWayCount++;
			return;
		}
		if(i > 0 && !visited[(i-1)*n + j]){
			gogo(grid, i-1, j, visited.clone());
		}
		if(j > 0 && !visited[i*n + j-1]){
			gogo(grid, i, j-1, visited.clone());
		}
		if(i < grid.length-1 && !visited[(i+1)*n + j]){
			gogo(grid, i+1, j, visited.clone());
		}
		if(j < n-1 && !visited[i*n + j+1]){
			gogo(grid, i, j+1, visited.clone());
		}
	}

	private boolean isAllVisited(boolean[] visited){
		for(boolean i : visited){
			if(!i) return false;
		}
		return true;
	}
}
