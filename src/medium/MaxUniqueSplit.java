package medium;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSplit {
	
	/**
	 * https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
	 **/

	public int maxUniqueSplit(String s) {
		Set<String> set = new HashSet<>();
		int i = 0, j = 1;
		String nowString = "";
		while(j <= s.length()){
			nowString = s.substring(i,j);
			if(set.contains(nowString)){
				j++;
				continue;
			}
			set.add(nowString);
			i++;
			j = i + nowString.length();
		}
		System.out.println(set);
		return set.size();
	}
}
