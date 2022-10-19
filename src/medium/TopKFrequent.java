package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TopKFrequent {
	public List<String> topKFrequent(String[] words, int k) {
        List<String> answerList = new ArrayList<>();
        HashMap<String, int[]> map = new HashMap<>();
        putValueToMap(map, words);
        List<Entry<String, int[]>> list_entries = new ArrayList<Entry<String, int[]>>(map.entrySet());
        sortMap(list_entries, map);
        for(int i = 0; i < k; i++) {
			answerList.add(list_entries.get(i).getKey());
		}
        printMap(map);
        return answerList;
    }
	
	private void putValueToMap(HashMap<String, int[]> map, String[] words) {
		for(int i = 0; i < words.length; i++) {
        	if(!map.containsKey(words[i])) {
        		map.put(words[i], new int[] {1,i});
        	}
        	map.get(words[i])[0]++;
        }
	}
	
	private void sortMap(List<Entry<String, int[]>> list_entries, HashMap<String, int[]> map) {
		Collections.sort(list_entries, new Comparator<Entry<String, int[]>>() {
			public int compare(Entry<String, int[]> obj1, Entry<String, int[]> obj2) {
				if(obj1.getValue()[0] == obj2.getValue()[0]) {
					return obj1.getKey().compareTo(obj2.getKey());
				}
				return obj2.getValue()[0] - obj1.getValue()[0];
			}
		});
	}
	
	private void printMap(HashMap<String, int[]> map) {
		for(String key : map.keySet()) {
			System.out.println("key : " +key + " // value : " +Arrays.toString(map.get(key)));
		}
	}
	
	public static void main(String[] args) {
		TopKFrequent s = new TopKFrequent();
		String[] words = {"i","love","leetcode","i","love","coding"};
		System.out.println(s.topKFrequent(words, 2));
		words = new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"};
		System.out.println(s.topKFrequent(words, 4));
	}
}
