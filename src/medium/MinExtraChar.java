package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MinExtraChar {
	
	/**
	 * 
	 * https://leetcode.com/problems/extra-characters-in-a-string/
	 * 
	 * */
	
	public int minExtraChar(String s, String[] dictionary) {
		boolean[] isUse = new boolean[s.length()];
		int count = 0;
		
		for(String part : dictionary){
			gogo(s,0,part,0,new ArrayList<Integer>(), isUse);
		}
		for(boolean i : isUse){
			if(!i) count++;
		}
		
		return count;
	}

	private void gogo(String a, int aStart, String part, int partIndex, ArrayList<Integer> list, boolean[] isUse){
		if(list.size() == part.length()){
			for(int i : list){
				isUse[i] = true;
			}
			return;
		}
		
		for(int i = aStart; i < a.length(); i++){
			if(a.charAt(i) == part.charAt(partIndex) && !isUse[i]){
				ArrayList<Integer> copy = new ArrayList<>(list);
				copy.add(i);
				gogo(a, i+1, part, partIndex+1, copy, isUse);
				break;
			}
		}
	}
}
