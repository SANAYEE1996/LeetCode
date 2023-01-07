package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
	
	
	public boolean wordBreak(String s, List<String> wordDict) {
		
		if (!isStartWithWordDictList(s, wordDict)) {
			return false;
		}
		
		
		return true;
    }
	
	private boolean isStartWithWordDictList(String word, List<String> wordDict) {
		
		if("".equals(word)) {
			return true;
		}
		
		for(String str : wordDict) {
			if(word.startsWith(str)) {
				if (isStartWithWordDictList(word.substring(str.length()), wordDict)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		WordBreak s = new WordBreak();
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"cats","dog","sand","and","cat"}));
		System.out.println(s.wordBreak("catsandog", wordDict));
		wordDict = new ArrayList<>(Arrays.asList(new String[] {"apple","pen"}));
		System.out.println(s.wordBreak("applepenapple", wordDict));
		wordDict = new ArrayList<>(Arrays.asList(new String[] {"leet","code"}));
		System.out.println(s.wordBreak("leetcode", wordDict));
		
		String[] strArray = {"abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd",
				 "a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab",
				 "aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d",
				 "cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda",
				 "ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"};
		wordDict = new ArrayList<>(Arrays.asList(strArray));
		System.out.println(s.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb", wordDict));
		
		wordDict = new ArrayList<>(Arrays.asList(new String[] {"cats","dog","sand","cat"}));
		System.out.println(s.wordBreak("catsanddog", wordDict));
	}
	
}
