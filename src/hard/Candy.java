package hard;

import java.util.Arrays;

public class Candy {
	
	public int candy(int[] ratings) {
        int answer = 0;
        int[] candyCountArray = new int[ratings.length];
        int lastIndex = candyCountArray.length-1;
        for(int i = 0; i < candyCountArray.length; i++) {
        	candyCountArray[i] = 1;
        }
        candyCountArray[0] = (candyCountArray[0] > candyCountArray[1]) ? 2 : 1;
        for(int i = 1; i < ratings.length-1; i++){
            if(ratings[i-1] < ratings[i] && ratings[i] > ratings[i+1]) {
            	candyCountArray[i] = Math.max(candyCountArray[i-1], candyCountArray[i+1]) +1;
            }
            if(ratings[i-1] < ratings[i] && ratings[i] <= ratings[i+1]) {
            	candyCountArray[i] = candyCountArray[i-1] +1;
            	candyCountArray[i+1] = (candyCountArray[i+1] < candyCountArray[i]) ? candyCountArray[i]+1 : candyCountArray[i+1];
            }
            if(ratings[i-1] >= ratings[i] && ratings[i] > ratings[i+1]) {
            	candyCountArray[i] = candyCountArray[i+1] +1;
            	candyCountArray[i-1] = (candyCountArray[i-1] < candyCountArray[i]) ? candyCountArray[i]+1 : candyCountArray[i-1];
            }
        }
        candyCountArray[lastIndex] = (candyCountArray[lastIndex] > candyCountArray[lastIndex-1]) ? candyCountArray[lastIndex-1]+1 : 1;
        for(int i : candyCountArray) {
        	answer += i;
        }
        System.out.println(Arrays.toString(ratings));
        System.out.println(Arrays.toString(candyCountArray));
        return answer;
    }
}
