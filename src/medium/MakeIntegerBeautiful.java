package medium;

public class MakeIntegerBeautiful {
	public long makeIntegerBeautiful(long n, int target) {
        int initSumValue = getEachNumberSumValue(n);
        if(initSumValue <= target){
            return 0;
        }

        return 0;
    }

    private int getEachNumberSumValue(long n){
        String str = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += (str.charAt(i) - 48);
        }
        return sum;
    }
}
