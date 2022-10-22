package medium;

import java.util.ArrayList;
import java.util.List;

public class Combine {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> answerList = new ArrayList<>();
		int[] rangeArray = new int[n];
		defaultSetting(rangeArray);
		goCombine(answerList, rangeArray, 0, k, new ArrayList<>());
		return answerList;
    }
	
	private void defaultSetting(int[] rangeArray) {
		for(int i = 0; i < rangeArray.length; i++) {
			rangeArray[i] = i+1;
		}
	}
	
	private void goCombine(List<List<Integer>> answerList, int[] rangeArray, int startIndex, int k, List<Integer> ship) {
		for(int i = startIndex; i < rangeArray.length; i++) {
			List<Integer> cloneShipList = new ArrayList<>(ship);
			cloneShipList.add(rangeArray[i]);
			if(cloneShipList.size() < k) {
				goCombine(answerList, rangeArray, i+1, k, cloneShipList);
			}
			else if(cloneShipList.size() == k) {
				answerList.add(cloneShipList);
			}
		}
	}
	
	public static void main(String[] args) {
		Combine s = new Combine();
		System.out.println(s.combine(20, 10));
	}
}
