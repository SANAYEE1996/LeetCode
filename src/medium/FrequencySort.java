package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class FrequencySort {
	public String frequencySort(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 0);
			}
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		
		Character[] charArray = map.keySet().toArray(new Character[map.keySet().size()]);
		
		Arrays.sort(charArray, new Comparator<Character>() {
			@Override
			public int compare(Character a, Character b) {
				return map.get(b) - map.get(a);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(Character key : charArray) {
			for(int i = 0; i < map.get(key); i++) {
				sb.append(key);
			}
		}
		
		return sb.toString();
    }
}
