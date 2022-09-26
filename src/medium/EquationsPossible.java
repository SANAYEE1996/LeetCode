package medium;

import java.util.ArrayList;
import java.util.HashMap;

public class EquationsPossible {
	
	/*
	 * ["c==c","b==d","x!=z"]
	 * 
	 * */
	
	public boolean equationsPossible(String[] equations) {
		
		HashMap<String, ArrayList<Character>> map = new HashMap<>();
		
		char head = 0;
		char tail = 0;
		String same = "same";
		String differ = "differ";
		String headKey = "";
		String tailKey = "";
		
		for(String s : equations) {
			head = s.charAt(0);
			tail = s.charAt(3);
			if(s.contains("==")) {
				headKey = head + same;
				tailKey = tail + same;
				putNewMap(headKey, tailKey, map);
				
			}
			else if(s.contains("!=")) {
				headKey = head + differ;
				tailKey = tail + differ;
				putNewMap(headKey, tailKey, map);
				
			}
		}
		
        return true;
    }
	
	void putNewMap(String headKey, String tailKey, HashMap<String, ArrayList<Character>> map) {
		if(!map.containsKey(headKey)) {
			map.put(headKey, new ArrayList<Character>());
		}
		if(!map.containsKey(tailKey)) {
			map.put(tailKey, new ArrayList<Character>());
		}
	}
}
