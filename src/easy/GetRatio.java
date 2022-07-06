package easy;

public class GetRatio {
	public int getSimulateMoney(int originMoney, int maxMonth, int iterestRatio) {
		double result = originMoney* Math.pow(1 + (double)iterestRatio/100, maxMonth);
		return (int) result;
	}
	
	public int getRatio(int originMoney, int maxMonth, int purposeMoney) {
        if(originMoney == purposeMoney) return 0;
        
        int simulateMoney = 0;
        int iterestRatio = 0;
		while(simulateMoney < purposeMoney) {
			iterestRatio++;
			simulateMoney = getSimulateMoney(originMoney, maxMonth, iterestRatio);
		}
        return iterestRatio;
    }

}
