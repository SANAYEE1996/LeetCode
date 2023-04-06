package medium;

public class ClosedIsland {
	
	public int closedIsland(int[][] map) {
		int sum = 0;
		boolean[][] visit = new boolean[map.length][map[0].length];
		for(int i = 1; i < map.length-1; i++){
			for(int j = 1; j < map[i].length-1; j++){
				if(!visit[i][j] && map[i][j] == 0){
					int part = gogo(map,visit,i,j);
					sum += part;
					System.out.println("i : " +i+ "  // j : " +j + "  sum : " +part);
				}
			}
		}
		return sum;
    }
	
	private int gogo(int[][] map, boolean[][] visit, int i, int j){
		visit[i][j] = true;
		if(i == 0 || i == map.length-1 || j == 0 || j == map[i].length-1){
			return 0;
		}
		int sum = 1;
		if(i > 0 && !visit[i-1][j] && map[i-1][j] == 0){
			sum *= gogo(map,visit,i-1,j);
		}
		if(i < map.length-1 && !visit[i+1][j] && map[i+1][j] == 0){
			sum *= gogo(map,visit,i+1,j);
		}
		if(j > 0 && !visit[i][j-1] && map[i][j-1] == 0){
			sum *= gogo(map,visit,i,j-1);
		}
		if(j < map[i].length-1 && !visit[i][j+1] && map[i][j+1] == 0){
			sum *= gogo(map,visit,i,j+1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ClosedIsland s = new ClosedIsland();
		int[][] map = {{1,0,1,1,1,1,0,0,1,0},
					{1,0,1,1,0,0,0,1,1,1},
					{0,1,1,0,0,0,1,0,0,0},
					{1,0,1,1,0,1,0,0,1,0},
					{0,1,1,1,0,1,0,1,0,0},
					{1,0,0,1,0,0,1,0,0,0},
					{1,0,1,1,1,0,0,1,1,0},
					{1,1,0,1,1,0,1,0,1,1},
					{0,0,1,1,1,0,1,0,1,1},
					{1,0,0,1,1,1,1,0,1,1}};
		
		System.out.println(s.closedIsland(map));
				
				
	}
}
