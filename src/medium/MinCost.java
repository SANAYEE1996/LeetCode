package medium;

import java.util.Arrays;

public class MinCost {
	public int minCost(String colors, int[] neededTime) {
//        System.out.println("input : " +colors);
//        System.out.println("time : " +Arrays.toString(neededTime));
		int answer = 0;
		int startIndex = 0;
		int lastIndex = 0;
        for(int i = 0; i < colors.length()-1; i++){
        	startIndex = i;
            while(i < colors.length()-1 && colors.charAt(i) == colors.charAt(i+1)) {
            	i++;
            }
            lastIndex = i;
            if(startIndex != lastIndex) {
            	answer += getAnswer(neededTime, startIndex, lastIndex);
            }
        }
        
        return answer;
    }
	
	int getAnswer(int[] neededTime, int startIndex, int lastIndex) {
		int aSum = 0;
		int bSum = 0;
		for(int i = startIndex; i <= lastIndex; i += 2) {
			aSum += neededTime[i];
		}
		for(int i = startIndex+1; i <= lastIndex; i+=2){
			bSum += neededTime[i];
		}
		return Math.min(aSum, bSum);
	}
}
