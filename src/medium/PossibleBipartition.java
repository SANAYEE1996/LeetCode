package medium;

public class PossibleBipartition {
	public boolean possibleBipartition(int n, int[][] dislikes) {
        boolean[][] dislikeMap = new boolean[n][n];
        for(int[] i : dislikes) {
        	dislikeMap[i[0]-1][i[1]-1] = true;
        	dislikeMap[i[1]-1][i[0]-1] = true;
        }
        print(dislikeMap);
        int j = 0;
		for(int i = 1; i < n; i++) {
			if(!dislikeMap[j][i]) {
				return true;
			}
			j++;
		}
		return !dislikeMap[0][n-1];
    }
	
	void print(boolean[][] dislikeMap) {
		for(int i = 0; i < dislikeMap.length; i++) {
			for(int j = 0; j < dislikeMap[i].length; j++) {
				System.out.print(dislikeMap[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PossibleBipartition s = new PossibleBipartition();
		int[][] a = {{1,2},{1,3},{2,4}};
		int[][] b = {{1,2},{1,3},{2,3}};
		int[][] c = {{1,2},{1,3},{3,4},{4,5},{1,5}};
		int[][] d = {{6,9},{1,3},{4,8},{5,6},{2,8},{4,7},{8,9},{2,5},{5,8},{1,2},{6,7},{3,10},{8,10},{1,5},{3,6},{1,10},{7,9},{4,10},{7,10},{1,4},{9,10},{4,6},{2,7},{6,8},{5,7},{3,8},{1,8},{1,7},{7,8},{2,4}};
		System.out.println(s.possibleBipartition(4, a));
		System.out.println(s.possibleBipartition(3, b));
		System.out.println(s.possibleBipartition(5, c));
		System.out.println(s.possibleBipartition(10, d));
	}
}
