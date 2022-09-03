package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> answer = new ArrayList<>();
		boolean isLoop = true;
		int i = 0;
		int count = 0;
		while(isLoop) {
			
			if(target % candidates[i] == 0) {
				List<Integer> examList = new ArrayList<>();
				count = target/candidates[i];
				for(int j = 0; j < count; j++) {
					examList.add(candidates[i]);
				}
				answer.add(examList);
			}
			
			
		}
		return answer;
    }
}
