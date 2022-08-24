package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		Collections.sort(wordDict);
		List<Character> firstCharList = new ArrayList<>();
		putFirstCharacterToList(firstCharList, wordDict);
		List<Boolean> booleanList = new ArrayList<>();
		isBreakableWord(wordDict, s, booleanList);
		if(booleanList.contains(true)) {
			return true;
		}
		return false;
    }
	
	void putFirstCharacterToList(List<Character> firstCharList, List<String> wordDict) {
		for(String s : wordDict) {
			firstCharList.add(s.charAt(0));
		}
	}
	
	void isBreakableWord(List<String> wordDict, String s, List<Boolean> booleanList) {
		if(s.equals("")) {
			booleanList.add(true);
			return;
		}
		int startIndex = 0;
		String exam = "";
		for(int i = startIndex; i < wordDict.size(); i++) {
			exam = wordDict.get(i);
        	if(s.startsWith(exam)) {
        		isBreakableWord(wordDict, s.substring(exam.length()), booleanList);
        	}
        }
	}
	
	public int getStartIndex(List<Character> firstCharList, char firstcharater) {
		int mid=0;
		int min = 0;
		int max = firstCharList.size()-1;
		
		while(min <= max) {
			mid = (min + max)/2;
			if(firstcharater == firstCharList.get(mid)) {
				return mid;
			}
			else if(firstcharater < firstCharList.get(mid)) {
				max = mid-1;
				continue;
			}
			min = mid+1;
		}
		
		return mid;
	}
}
