package medium.test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.WordBreak;

class WordBreakTest {
	
	private WordBreak wb;
	
	@BeforeEach
	void setup() {
		wb = new WordBreak();
	}

	@Test
	void test01() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"cats","dog","sand","and","cat"}));
		assertFalse(wb.wordBreak("catsandog", wordDict));
	}
	
	@Test
	void test02() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"apple","pen"}));
		assertTrue(wb.wordBreak("applepenapple", wordDict));
	}
	
	@Test
	void test03() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"leet","code"}));
		assertTrue(wb.wordBreak("leetcode", wordDict));
	}
	
	@Test
	void test04() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"cats","dog","sand","cat"}));
		assertTrue(wb.wordBreak("catsanddog", wordDict));
	}
	
	@Test
	void test05() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd",
				 "a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab",
				 "aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d",
				 "cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda",
				 "ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"}));
		assertTrue(wb.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb", wordDict));
	}
	
	
	@Test
	void test06() {
		List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"}));
		assertTrue(wb.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", wordDict));
	}
	
}
