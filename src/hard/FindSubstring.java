package hard;

import java.util.ArrayList;
import java.util.List;

public class FindSubstring {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<>();
		ArrayList<String> wordsList = new ArrayList<>();
		int wordLength = words[0].length();
		int wordAllLength = wordLength*words.length;
		int maxCount = s.length() - wordAllLength;
		if(maxCount < 0) return list;
		for(String str : words) wordsList.add(str);
		for(int i = 0; i <= maxCount; i++) {
			if(isContains(wordsList, s.substring(i, i+wordAllLength))) list.add(i);
		}
		System.out.println(list);
    
		return list;
    }
	
	public boolean isContains(ArrayList<String> wordsList, String allWord) {
		for(String s : wordsList) {
			if(!allWord.contains(s)) return false;
			allWord = allWord.replaceFirst(s, "");
		}
		return true;
	}
	
	
}
