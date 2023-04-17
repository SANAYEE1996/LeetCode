package medium;

import java.util.Arrays;

public class HIndex {
	public int hIndex(int[] citations) {
		int answer = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
        	if(citations[i] >= answer) {
        		break;
        	}
        	answer--;
        }
        return answer;
    }
}
