package medium;

public class NumIslands {
	public int numIslands(char[][] grid) {
        int answer = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] != 0) {
        			gogo(grid, i, j);
        			answer++;
        		}
        	}
        }
        return answer;
    }
	
	private void gogo(char[][] map, int i, int j){
		map[i][j] = 0;
		if(i < map.length-1 && map[i+1][j] != '0'){
			gogo(map,i+1,j);
		}
		if(i > 0 && map[i-1][j] != '0'){
			gogo(map,i-1,j);
		}
		if(j < map[i].length-1 && map[i][j+1] != '0'){
			gogo(map,i,j+1);
		}
		if(j > 0 && map[i][j-1] != '0'){
			gogo(map,i,j-1);
		}
	}
}
