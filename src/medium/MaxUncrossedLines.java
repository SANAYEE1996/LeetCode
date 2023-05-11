package medium;

public class MaxUncrossedLines {
	
	private int maxCrossLine;
	
	public int maxUncrossedLines(int[] nums1, int[] nums2) {
		int[][] map = new int[nums2.length][nums1.length];
		
		for(int i = 0; i < nums2.length; i++){
			for(int j = 0; j < nums1.length; j++){
				if(nums1[j] == nums2[i]){
					map[i][j] = 1;
				}
			}
		}
		maxCrossLine = 0;
		gogo(map,0,0,0);
		
		return maxCrossLine;
	}

	private void gogo(int[][] map, int i, int j, int value){
		if(i == map.length || j == map[i].length){
			maxCrossLine = Math.max(maxCrossLine, value);
			return;
		}
		if(map[i][j] == 1){
			gogo(map, i+1, j+1, value+1);
		}
		
		for(int x = i; x < map.length; x++){
			for(int y = j; y < map[x].length; y++){
				if(map[x][y] == 1){
					gogo(map, x+1, y+1, value+1);
				}
			}
		}
		
		maxCrossLine = Math.max(maxCrossLine, value);
	}
}
