package easy;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int pivot = 1;  
        for(int i = digits.length-1; i>= 0; i--) {
        	digits[i] = digits[i] + pivot >= 10 ? 0 : digits[i] + pivot;
        	pivot = digits[i] + pivot >= 10 ? 1 : 0;
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
