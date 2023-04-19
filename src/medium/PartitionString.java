package medium;

import java.util.HashSet;

public class PartitionString {
	public int partitionString(String s) {
		int answer = 0;
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++){
			set = new HashSet<>();
			for(; i < s.length(); i++){
				if(set.contains(s.charAt(i))){
					answer++;
					i--;
					break;
				}
				set.add(s.charAt(i));
			}
		}
		if(!set.isEmpty()) {
			answer++;
		}
		return answer;
	}
}
