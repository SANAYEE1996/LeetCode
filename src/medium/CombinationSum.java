package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> answerList = new ArrayList<>();
		Arrays.sort(candidates);
		//int limitCount = (target % candidates[0] == 0) ? target/candidates[0] : target/candidates[0] + 1;
		goCombination(answerList, candidates, target, 0, 0, new ArrayList<Integer>());
		return answerList;
    }
	
	private void goCombination(List<List<Integer>> answerList, int[] candidates, int target, int startIndex, int sum, List<Integer> ship) {
		
		int cloneSum = 0;
		int beforeValue = -100;
		for(int i = startIndex; i < candidates.length; i++) {
			if(candidates[i] > target) break;
			if(candidates[i] == beforeValue) continue;
			List<Integer> cloneShipList = new ArrayList<>(ship);
			cloneSum = sum + candidates[i];
			beforeValue = candidates[i];
			if(cloneSum < target) {
				cloneShipList.add(candidates[i]);
				goCombination(answerList, candidates, target, i+1, cloneSum, cloneShipList);
				continue;
			}
			else if(cloneSum == target) {
				cloneShipList.add(candidates[i]);
				answerList.add(cloneShipList);
			}
			break;
			
		}
	}
	
	public static void main(String[] args) {
		CombinationSum s = new CombinationSum();
		System.out.println(s.combinationSum(new int[] {2,3,6,7}, 7));
		System.out.println(s.combinationSum(new int[] {2,3,5}, 8));
		System.out.println(s.combinationSum(new int[] {2}, 1));
		System.out.println(s.combinationSum(new int[] {10,1,2,7,6,1,5}, 8));
		System.out.println(s.combinationSum(new int[] {2,5,2,1,2}, 5));
	}
}
