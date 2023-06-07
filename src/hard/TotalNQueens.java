package hard;

public class TotalNQueens {
	
	private int count;
	
	public int totalNQueens(int n) {
		if(n == 1) return 1;
		if(n == 2 || n == 3) return 0;
		count = 0;
		gogo(new int[n][n], 0);
        return count;
    }
	
	private void gogo(int[][] map, int startIndex) {
		if(startIndex == map.length-1) {
			for(int j = 0; j < map[0].length; j++) {
				if(map[startIndex][j] == 0) {
					count++;
				}
			}
			return;
		}
		for(int j = 0; j < map[0].length; j++) {
			if(map[startIndex][j] == 0) {
				gogo(fillMap(copyMap(map), startIndex, j), startIndex+1);
			}
		}
	}
	
	private int[][] fillMap(int[][] map, int i, int j) {
		map[i][j] = 1;
		int plusI = i, plusJ = j, minusI = i, minusJ = j;
		int m = map.length, n = map[0].length;
		while(!(plusI >= m && plusJ >= n && minusI < 0 && minusJ < 0)) {
			if(plusI + 1 < m && plusJ + 1 < n) {
				map[plusI + 1][plusJ + 1] = 1;
			}
			if(plusI + 1 < m && minusJ > 0) {
				map[plusI + 1][minusJ - 1] = 1;
			}
			if(minusI > 0 && plusJ + 1 < n) {
				map[minusI - 1][plusJ + 1] = 1;
			}
			if(minusI > 0 && minusJ > 0) {
				map[minusI - 1][minusJ - 1] = 1;
			}
			if(plusI + 1 < m) {
				map[plusI + 1][j] = 1;
			}
			if(plusJ + 1 < n) {
				map[i][plusJ + 1] = 1;
			}
			if(minusI > 0) {
				map[minusI - 1][j] = 1;
			}
			if(minusJ > 0) {
				map[i][minusJ - 1] = 1;
			}
			plusI++; plusJ++; minusI--; minusJ--;
		}
		return map;
	}
	
	private int[][] copyMap(int[][] map){
		int[][] copy = new int[map.length][map[0].length];
		for(int i = 0; i < map.length; i++) {
			copy[i] = map[i].clone();
		}
		return copy;
	}
}
