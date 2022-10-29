package medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> answerList = new ArrayList<>();
		answerList.add(0);
		int lastIndex;
		for(int i = 0; i < n; i++) {
			lastIndex = answerList.size()-1;
			answerList.add(answerList.get(lastIndex) + (int)Math.pow(2, i));
		}
		for(int i = 0; i < n-1; i++) {
			lastIndex = answerList.size()-1;
			answerList.add(answerList.get(lastIndex) - (int)Math.pow(2, i));
		}
		return answerList;
    }
}
