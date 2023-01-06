package medium;

import java.util.Arrays;

public class MaxIceCream {
	public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int answer = 0;
        for(int i = 0; i < costs.length; i++){
            if(coins < costs[i]){
                break;
            }
            coins -= costs[i];
            answer++;
        }
        return answer;
    }
}
