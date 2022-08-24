package hard;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> answerList = new ArrayList<>();
        gogo(wordDict, s, answerList, "");
        return answerList;
    }
	
	void gogo(List<String> wordDict, String s, List<String> answerList, String appendWord) {
		if(s.equals("")) {
			answerList.add(appendWord.substring(1));
			return;
		}
		String exam = "";
		for(int i = 0; i < wordDict.size(); i++) {
			exam = wordDict.get(i);
        	if(s.startsWith(exam)) {
        		gogo(wordDict, s.substring(exam.length()), answerList, appendWord + " " + exam);
        	}
        }
	}
}
