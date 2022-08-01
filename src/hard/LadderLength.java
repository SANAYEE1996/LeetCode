package hard;

import java.util.ArrayList;
import java.util.List;

public class LadderLength {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		int[] minArray = new int[1];
		minArray[0] = Integer.MAX_VALUE;
		gogo(beginWord, endWord, wordList, minArray, 1);
		if(minArray[0] == Integer.MAX_VALUE) return 0;
		return minArray[0];
    }
	
	void gogo(String beginWord, String endWord, List<String> wordList, int[] minArray, int count) {
		if(beginWord.equals(endWord)) {
			minArray[0] = (count < minArray[0]) ? count : minArray[0];
			return;
		}
		for(int i = 0; i < wordList.size(); i++) {
			if(differCount(beginWord, wordList.get(i)) == 1) {
				List<String> exam = new ArrayList<>(wordList);
				exam.remove(i);
				gogo(wordList.get(i), endWord, exam, minArray, count+1);
			}
		}		
	}
	
	int differCount(String a, String b) {
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != b.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
