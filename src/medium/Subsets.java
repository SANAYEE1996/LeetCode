package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> answerList = new ArrayList<>();
		answerList.add(new ArrayList<>());
		goSubSets(answerList, nums, 0, new ArrayList<>());
		return answerList;
    }
	
	private void goSubSets(List<List<Integer>> answerList, int[] nums, int startIndex, List<Integer> ship) {
		for(int i = startIndex; i < nums.length; i++) {
			List<Integer> cloneShipList = new ArrayList<>(ship);
			cloneShipList.add(nums[i]);
			answerList.add(cloneShipList);
			goSubSets(answerList, nums, i+1, cloneShipList);
		}
	}
	
	public static void main(String[] args) {
		Subsets s = new Subsets();
		System.out.println(s.subsets(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(s.subsets(new int[] {10}));
	}
}
