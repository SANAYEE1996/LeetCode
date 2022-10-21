package medium;

import java.util.ArrayList;
import java.util.List;

public class Permute {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> answerList = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			List<Integer> ship = getListFromArray(nums);
			ship.remove(i);
			List<Integer> battle = new ArrayList<>();
			battle.add(nums[i]);
			goPermute(answerList, ship, battle);
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
		for(int i = 0; i < ship.size(); i++) {
			List<Integer> shipCloneList = new ArrayList<>(ship);
			List<Integer> battleCloneList = new ArrayList<>(battle);
			shipCloneList.remove(i);
			battleCloneList.add(ship.get(i));
			goPermute(answerList, shipCloneList, battleCloneList);
		}
	}

}
