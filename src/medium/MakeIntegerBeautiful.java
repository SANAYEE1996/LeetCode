package medium;

public class MakeIntegerBeautiful {
	public long makeIntegerBeautiful(long n, int target) {
        int initSumValue = getEachNumberSumValue(n);
        if(initSumValue <= target){
            return 0;
        }
        long[] ship = new long[3];
        ship[0] = n;
        ship[1] = initSumValue;
        int repeatCount = 0;
        while(ship[1] > target) {
        	calculateForMakeBeautiful(ship, n);
        	n = ship[0];
        	repeatCount++;
        }
//        System.out.println("n : " + n + " each sum : " +ship[1] + " need total sum : " +ship[2]);
//        System.out.println("repeat Count : " +repeatCount);
        return ship[2];
    }

    private int getEachNumberSumValue(long n){
        String str = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += (str.charAt(i) - 48);
        }
        return sum;
    }
    
    private void calculateForMakeBeautiful(long[] ship, long n) {
    	String str = String.valueOf(n);
    	long value = 0;
    	for(int i = str.length()-1; i >= 0; i--) {
    		if(str.charAt(i) != '0') {
    			value = (10 - (str.charAt(i) - 48))* (long)Math.pow(10, str.length()-1- i);
    			n += value;
    			ship[2] += value;
    			break;
    		}
    	}
    	ship[0] = n;
    	ship[1] = getEachNumberSumValue(n);
    }
}
