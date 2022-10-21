package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> answerList = new ArrayList<>();
		int beforeValue = -20;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] - beforeValue == 0) continue;
			List<Integer> ship = getListFromArray(nums);
			ship.remove(i);
			List<Integer> battle = new ArrayList<>();
			battle.add(nums[i]);
			goPermute(answerList, ship, battle);
			beforeValue = nums[i];
		}
		return answerList;
    }
	
	private ArrayList<Integer> getListFromArray(int[] array){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : array) list.add(i);
		return list;
	}
	
	private void goPermute(List<List<Integer>> answerList, List<Integer> ship, List<Integer> battle) {
		if(ship.size() == 0) {
			answerList.add(battle);
			return;
		}
		int beforeValue = -20;
		for(int i = 0; i < ship.size(); i++) {
			if(beforeValue - ship.get(i) == 0) continue;
			List<Integer> shipCloneList = new ArrayList<>(ship);
			List<Integer> battleCloneList = new ArrayList<>(battle);
			shipCloneList.remove(i);
			battleCloneList.add(ship.get(i));
			goPermute(answerList, shipCloneList, battleCloneList);
			beforeValue = ship.get(i);
		}
	}
	
	public static void main(String[] args) {
		Permute s = new Permute();
		System.out.println(s.permute(new int[] {1,2,3,4,5,6,7,8}).size());
		System.out.println(s.permute(new int[] {1,1,2}));
		System.out.println(s.permute(new int[] {1,1,1,1,1,1,1,1}));
		System.out.println(s.permute(new int[] {3,3,0,3}));
	}
}
