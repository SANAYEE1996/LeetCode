package medium;

import java.util.ArrayList;

public class StockSpanner {
	private ArrayList<Integer> stockList;

    public StockSpanner() {
        stockList = new ArrayList<>();
    }
    
    public int next(int price) {
        int count = 1;
        for(int i = stockList.size()-1; i >= 0; i--){
            if(stockList.get(i) > price){
                stockList.add(price);
                return count;
            }
            count++;
        }
        stockList.add(price);
        return count;
    }
}
