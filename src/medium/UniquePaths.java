package medium;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        setDefault(map);
        if(m > 1 && n > 1) {
        	fillIn(map);
        }
		return map[m-1][n-1];
    }
	
	void setDefault(int[][] map) {
		for(int i = 0; i < map[0].length; i++) {
			map[0][i] = 1;
		}
		for(int i = 0; i < map.length; i++) {
			map[i][0] = 1;
		}
	}
	
	void fillIn(int[][] map) {
		for(int i = 1; i < map.length; i++) {
			for(int j = 1; j < map[i].length; j++) {
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}
	}
}
