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
			if(isContains(new ArrayList<String>(wordsList), s.substring(i, i+wordAllLength), wordLength)) list.add(i);
		}
		System.out.println(list);
    
		return list;
    }
	
	public boolean isContains(ArrayList<String> wordsList, String allWord, int wordLength) {
		String containWord = "";
		while(wordsList.size() > 0) {
			containWord = allWord.substring(0, wordLength);
			if(wordsList.contains(containWord)) 
				wordsList.remove(wordsList.indexOf(containWord));
			else
				break;
			allWord = (allWord.length() >= wordLength) ? allWord.substring(wordLength) : "";
		}
		
		if(wordsList.size() == 0) return true;
		return false;
	}
	
	
}
