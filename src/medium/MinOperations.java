package medium;

import java.util.Arrays;

public class MinOperations {
	public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        
        int value = boxes.charAt(0) - 48;
        for(int i = 1; i < answer.length; i++) {
        	answer[i] = value;
        	System.out.println(Arrays.toString(answer));
        	if(value > 0) {
        		value++;
        	}
        	if(boxes.charAt(i) == '1') {
        		value++;
        	}
        }
        int[] answer1 = new int[boxes.length()];
        value = boxes.charAt(answer.length-1) - 48;
        for(int i = answer.length-2; i >= 0; i--) {
        	answer1[i] = value;
        	System.out.println(Arrays.toString(answer1));
        	if(value > 0) {
        		value++;
        	}
        	if(boxes.charAt(i) == '1') {
        		value++;
        	}
        }
        
		return answer;
    }
	
	public static void main(String[] args) {
		MinOperations s = new MinOperations();
		
		System.out.println(Arrays.toString(s.minOperations("110")));
		System.out.println(Arrays.toString(s.minOperations("001011")));
	}
}
