package easy;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> answerList = new LinkedList<>();
		int arrayValue = 0;
		int powIndex = 0;
		for(int i = num.length-1; i >= 0; i--) {
			arrayValue += num[i]*Math.pow(10, powIndex);
			powIndex++;
		}
		int sum = arrayValue + k;
		while(sum != 0) {
			answerList.add(0,sum%10);
			sum /= 10;
		}
		return answerList;
    }
	
	
}
