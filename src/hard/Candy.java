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
        	reArrayIandJ(i-1, i, i+1, ratings, candyCountArray);
        }
        candyCountArray[lastIndex] = (candyCountArray[lastIndex] > candyCountArray[lastIndex-1]) ? candyCountArray[lastIndex-1]+1 : 1;
        for(int i = ratings.length-2; i > 0; i--){
        	reArrayIandJ(i-1, i, i+1, ratings, candyCountArray);
        }
        candyCountArray[0] = (ratings[0] > ratings[1] && candyCountArray[0] <= candyCountArray[1]) ? candyCountArray[1]+1 : candyCountArray[0];
        for(int i : candyCountArray) {
        	answer += i;
        }
        System.out.println("우선 순위 배열 : "+Arrays.toString(ratings));
        System.out.println("사탕 받은 결과 배열 : "+Arrays.toString(candyCountArray));
        return answer;
    }
	
	void reArrayIandJ(int i, int j, int k, int[] ratings, int[] candyCountArray) {
		if(ratings[i] < ratings[j]) {
			candyCountArray[j] = (candyCountArray[i] >= candyCountArray[j]) ? candyCountArray[i] + 1 : candyCountArray[j];
		}
		else if(ratings[i] > ratings[j]) {
			candyCountArray[i] = (candyCountArray[i] <= candyCountArray[j]) ? candyCountArray[j] + 1 : candyCountArray[i];
		}
		reArrayJandK(j, k, ratings, candyCountArray);
	}
	
	void reArrayJandK(int j, int k, int[] ratings, int[] candyCountArray) {
		if(ratings[j] < ratings[k]) {
			candyCountArray[k] = (candyCountArray[j] >= candyCountArray[k]) ? candyCountArray[j] + 1: candyCountArray[k];
		}
		else if(ratings[j] > ratings[k]) {
			candyCountArray[j] = (candyCountArray[j] <= candyCountArray[k]) ? candyCountArray[k] + 1: candyCountArray[j];
		}
	}
}
