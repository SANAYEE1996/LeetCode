package easy;

public class MinDeletionSize {
	public int minDeletionSize(String[] strs) {
        int columnLength = strs[0].length();
        char beforeChar = 0;
        int answer = 0;
        int middleCount = 0;
        for(int i = 0; i < columnLength; i++) {
        	middleCount = 0;
        	for(int j = 0; j < strs.length; j++) {
        		if(beforeChar > strs[j].charAt(i)) {
        			break;
        		}
        		middleCount++;
        		beforeChar = strs[j].charAt(i);
        	}
        	if(middleCount == strs.length) {
        		answer++;
        	}
        }
		return answer;
    }
}
