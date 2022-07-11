package hard;

import java.util.ArrayList;
import java.util.List;

public class FindSubstring {
	public List<Integer> findSubstring(String s, String[] words) {
		ArrayList<String> wordsList = new ArrayList<>();
		ArrayList<String> copyList = new ArrayList<>();
		for(String str : words) wordsList.add(str);
		String before = "";
		String after = "";
		int startIndex = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < wordsList.size(); j++) {
				after = wordsList.get(j);
				before = s.substring(i,i+after.length());
				if(after.equals(before)) {
					startIndex = i+after.length();
					copyList.addAll(wordsList);
					copyList.remove(j);
					
					copyList.clear();
					break;
				}
			}
		}
		
		
		
		
        List<Integer> list = new ArrayList<>();
		return list;
    }
}
