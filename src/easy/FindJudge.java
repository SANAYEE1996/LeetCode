package easy;

public class FindJudge {
	public int findJudge(int n, int[][] trust) {
        int[] trustCountArray = new int[n];
        int[] trustedByCountArray = new int[n];
        
        for(int[] i : trust) {
        	trustCountArray[i[0]-1]++;
        	trustedByCountArray[i[1]-1]++;
        }
        
        for(int i = 0; i < n; i++) {
        	if(trustCountArray[i] == 0 && trustedByCountArray[i] == n-1) {
        		return i+1;
        	}
        }
        
		return -1;
    }
}
