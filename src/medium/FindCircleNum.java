package medium;

public class FindCircleNum {
	
	/**
	 * 
	 * https://leetcode.com/problems/number-of-provinces/
	 * 
	 * **/
	
	public int findCircleNum(int[][] isConnected) {
		int n = isConnected.length;
        int answer = 0;
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
            	answer++;
                gogo(i, isConnected, visit);
            }
        }

        return answer;
    }
	
	public void gogo(int index, int[][] isConnected, boolean[] visit) {
        visit[index] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[index][i] == 1 && !visit[i]) {
            	gogo(i, isConnected, visit);
            }
        }
    }
}
