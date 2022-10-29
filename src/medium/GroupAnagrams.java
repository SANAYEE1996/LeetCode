package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> answerList = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		StringBuilder key = new StringBuilder();
		char[] keyArray;
		for(String s : strs) {
			keyArray = s.toCharArray();
			Arrays.sort(keyArray);
			for(char t : keyArray) {
				key.append(t);
			}
			if(!map.containsKey(key.toString())) {
				map.put(key.toString(), new ArrayList<String>());
			}
			map.get(key.toString()).add(s);
			key.setLength(0);
		}
		for(String keyString : map.keySet()) {
			answerList.add(map.get(keyString));
		}
		return answerList;
    }
}
