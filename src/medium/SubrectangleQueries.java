package medium;

public class SubrectangleQueries {
	
	private int[][] map;
	
	public SubrectangleQueries(int[][] rectangle) {
		map = new int[rectangle.length][rectangle[0].length];
		for(int i = 0; i < map.length; i++) {
			map[i] = rectangle[i].clone();
		}
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++) {
        	for(int j = col1; j <= col2; j++) {
        		map[i][j] = newValue;
        	}
        }
    }
    
    public int getValue(int row, int col) {
    	return map[row][col];
    }
}
