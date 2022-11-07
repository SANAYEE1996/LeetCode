package medium;

import java.util.ArrayList;
import java.util.List;

public class TwoEditWords {
	public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> answerList = new ArrayList<>();
        for(String s : queries) {
        	if(isChangeableStringInDictionary(s, dictionary)) {
        		answerList.add(s);
        	}
        }
        return answerList;
    }
	
	private boolean isChangeableStringInDictionary(String a, String[] dictionary) {
		for(String s : dictionary) {
			if(isMathWithInTwoChar(a, s)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isMathWithInTwoChar(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		int differCharCount = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != b.charAt(i)) {
				differCharCount++;
			}
			if(differCharCount > 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		TwoEditWords s = new TwoEditWords();
		System.out.println(s.twoEditWords(new String[] {"word","note","ants","wood"}, new String[] {"wood","joke","moat"}));
		System.out.println(s.twoEditWords(new String[] {"yes"}, new String[] {"not"}));
	}
}
