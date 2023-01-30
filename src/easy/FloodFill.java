package easy;

public class FloodFill {
	
	private boolean[][] isVisited;
	
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		isVisited = new boolean[image.length][image[0].length];
		
		gogo(image, sr, sc, color, image[sr][sc]);
		
		return image;
    }
	
	void gogo(int[][] map, int i, int j, int color, int purpose){
		isVisited[i][j] = true;
		map[i][j] = color;
		if(i < map.length-1  && !isVisited[i+1][j] && purpose == map[i+1][j]){
			gogo(map,i+1,j,color,purpose);
		}
		if(i > 0 && !isVisited[i-1][j] && purpose == map[i-1][j]){
			gogo(map,i-1,j,color,purpose);
		}
		if(j < map[i].length-1 && !isVisited[i][j+1] && purpose == map[i][j+1]){
			gogo(map,i,j+1,color,purpose);
		}
		if(j > 0 && !isVisited[i][j-1] && purpose == map[i][j-1]){
			gogo(map,i,j-1,color,purpose);
		}
	}
}
