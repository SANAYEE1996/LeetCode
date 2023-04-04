package easy;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int pivot = 1;  
        for(int i = digits.length-1; i>= 0; i--) {
        	if(digits[i] + pivot >= 10) {
                digits[i] = digits[i] + pivot - 10;
        		pivot = 1;
        	}
        	else {
                digits[i] = digits[i] + pivot;
        		pivot = 0;
        	}
        }
        if(pivot == 0) {
        	return digits;
        }
        int[] answer = new int[digits.length+1];
        answer[0] = pivot;
        for(int i = 1; i < answer.length; i++) {
        	answer[i] = digits[i-1];
        }
		return answer;
    }
}
