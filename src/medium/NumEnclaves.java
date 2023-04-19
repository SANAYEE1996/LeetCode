package medium;

public class NumEnclaves {
	
	private int sum;
	
	public int numEnclaves(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int answer = 0;
		for(int i = 1; i < grid.length-1; i++){
			for(int j = 1; j < grid[i].length-1; j++){
				if(grid[i][j] == 1 && !visited[i][j]){
					sum = 0;
					gogo(grid,visited,i,j);
					if(sum > 0){
						answer += sum;
					}
				}
			}
		}
		return answer;
    }
	
	private void gogo(int[][] grid, boolean[][] visited, int i, int j){
		visited[i][j] = true;
		
		if(i == 0 || i == grid.length-1 || j == 0 || j == grid[i].length-1){
			sum =  -100000;
			return;
		}
		
		sum++;
		
		if(i > 0 && !visited[i-1][j] && grid[i-1][j] == 1){
			gogo(grid,visited,i-1,j);
		}
		if(i < grid.length-1 && !visited[i+1][j] && grid[i+1][j] == 1){
			gogo(grid,visited,i+1,j);
		}
		if(j > 0 && !visited[i][j-1] && grid[i][j-1] == 1){
			gogo(grid,visited,i,j-1);
		}
		if(j < grid[i].length-1 && !visited[i][j+1] && grid[i][j+1] == 1){
			gogo(grid,visited,i,j+1);
		}
	}
}
