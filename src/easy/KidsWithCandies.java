package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxCandy = 0;
		for(int i : candies){
			maxCandy = Math.max(maxCandy,i);
		}
		List<Boolean> answerList = new ArrayList<>();
		for(int i : candies){
			if(i + extraCandies >= maxCandy){
				answerList.add(true);
			}
			else{
				answerList.add(false);
			}
		}
		return answerList;
	}
}
