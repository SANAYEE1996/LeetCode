package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	
	/**
	 * https://leetcode.com/problems/word-break/
	 * */
	
	private boolean isBreakable;
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> set = new HashSet<>();
		set.addAll(wordDict);
		isBreakable = false;
		gogo(s, set);
		return isBreakable;
	}

	private void gogo(String s, Set<String> set){
		if(s.length() == 0){
			isBreakable = true;
			return;
		}
		for(int i = 1; i <= s.length(); i++){
			if(set.contains(s.substring(0,i))){
				gogo(s.substring(i), set);
			}
		}
	}
}
