package easy;

public class MaxProfit {
	public int maxProfit(int[] prices) {
        
        int minValue = prices[0];
        int maxValue = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            else{
                maxValue = Math.max(maxValue, prices[i] - minValue);
            }
        }
        
        return maxValue;
    }
}
