package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
	
	private static HashMap<String, String[]> defaultMap = new HashMap<>();
	
	static {
		defaultMap.put("2", new String[] {"a","b","c"});
		defaultMap.put("3", new String[] {"d","e","f"});
		defaultMap.put("4", new String[] {"g","h","i"});
		defaultMap.put("5", new String[] {"j","k","l"});
		defaultMap.put("6", new String[] {"m","n","o"});
		defaultMap.put("7", new String[] {"p","q","r","s"});
		defaultMap.put("8", new String[] {"t","u","v"});
		defaultMap.put("9", new String[] {"w","x","y","z"});
	}
	
	void allSearch(List<String> list, HashMap<String, String[]> defaultMap, String digits) {
		ArrayList<String[]> searchList = new ArrayList<>();
		for(int i = 0; i < digits.length(); i++) {
			searchList.add(defaultMap.get(String.valueOf(digits.charAt(i))));
		}
		if(!searchList.isEmpty())
			searchGo(searchList.get(0),list,searchList,0,"");
	}
	
	void searchGo(String[] exam, List<String> list, ArrayList<String[]> searchList, int index, String letters) {
		StringBuilder sb = new StringBuilder(letters);
		for(String s : exam) {
			sb = new StringBuilder(letters);
			sb.append(s);
			if(index + 1 < searchList.size()) {
				searchGo(searchList.get(index+1),list,searchList,index+1,sb.toString());
				continue;
			}
			list.add(sb.toString());
		}
	}
	
	public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        allSearch(list, defaultMap, digits);
        return list;
    }
}
