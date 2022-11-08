package medium;

public class SumOfNumberAndReverse {
	public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i <= num; i++){
            if(i + reverseInteger(i) == num){
                return true;
            }
        }
        return false;
    }

    private int reverseInteger(int n){
	    return Integer.parseInt(reverseString(String.valueOf(n)));
    }

    private String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
