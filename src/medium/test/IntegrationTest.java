package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NextPermutation;
import medium.WordBreak;

class IntegrationTest {
	
	private NextPermutation np;
	private WordBreak wordbreak;
	
	@BeforeEach
	public void setup() {
		np = new NextPermutation();
		wordbreak = new WordBreak();
	}
	
	@Test
	void test() {
		np.nextPermutation(new int[] {1,2,3});
		np.nextPermutation(new int[] {3,9,8,7,5});
		np.nextPermutation(new int[] {3,9,7,8,5});
		np.nextPermutation(new int[] {1,1,5});
		np.nextPermutation(new int[] {1});
		np.nextPermutation(new int[] {1,1});
		np.nextPermutation(new int[] {5,4,3,2,1});
	}
	
	@Test
	void wordBreakTest() {
		String[] strArray = {"abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd",
							 "a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab",
							 "aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d",
							 "cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda",
							 "ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"};
		long start = 0;
		long end = 0;
		
		start = System.nanoTime();
		assertEquals(true, wordbreak.wordBreak("leetcode", new ArrayList<String>(Arrays.asList(new String[] {"leet","code"}))) );
		end = System.nanoTime();
		System.out.println("time : " +(double)(end-start)/1000000000);
		start = System.nanoTime();
		assertEquals(true, wordbreak.wordBreak("applepenapple", new ArrayList<String>(Arrays.asList(new String[] {"apple","pen"}))) );
		end = System.nanoTime();
		System.out.println("time : " +(double)(end-start)/1000000000);
		start = System.nanoTime();
		assertEquals(false, wordbreak.wordBreak("catsandog", new ArrayList<String>(Arrays.asList(new String[] {"cats","dog","sand","and","cat"}))) );
		end = System.nanoTime();
		System.out.println("time : " +(double)(end-start)/1000000000);
		start = System.nanoTime();
		assertEquals(true, wordbreak.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb", new ArrayList<String>(Arrays.asList(strArray))) );
		end = System.nanoTime();
		System.out.println("time : " +(double)(end-start)/1000000000);
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('c');
		charList.add('e');
		charList.add('g');
		System.out.println("이진 탐색 : " +wordbreak.getStartIndex(charList, 'f'));
	}

}
