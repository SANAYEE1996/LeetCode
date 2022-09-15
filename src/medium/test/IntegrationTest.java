package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.JumpGame;
import medium.MultiplyWithNoUseLibrary;
import medium.NextPermutation;
import medium.UniquePaths;
import medium.WordBreak;

class IntegrationTest {
	
	private NextPermutation np;
	private WordBreak wordbreak;
	private UniquePaths up;
	private MultiplyWithNoUseLibrary multiple;
	private JumpGame jumpgame;
	
	@BeforeEach
	public void setup() {
		np = new NextPermutation();
		wordbreak = new WordBreak();
		up = new UniquePaths();
		multiple = new MultiplyWithNoUseLibrary();
		jumpgame = new JumpGame();
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
	
	@Test
	void testUniquePath() {
		assertEquals(1, up.uniquePaths(1, 1));
		assertEquals(28, up.uniquePaths(3, 7));
		System.out.println("제일 큰 수 : " +up.uniquePaths(10, 10));
		System.out.println("제일 큰 수 : " +up.uniquePaths(100, 100));
	}
	
	@Test
	void testMultiply() {
		System.out.println("곱하기 테스트 입니다~~");
		System.out.println(multiple.multiply("123", "456"));
		System.out.println(multiple.multiply("433", "7456"));
		System.out.println(multiple.multiply("99999", "99999"));
		System.out.println(multiple.multiply("999999999", "0"));
		System.out.println(multiple.multiply("999999999", "1"));
	}
	
	@Test
	void jumpGameTest() {
		System.out.println("점프 게임 테스트 입니다~~");
		System.out.println(jumpgame.canJump(new int[] {2,3,1,1,4}));
		System.out.println(jumpgame.canJump(new int[] {3,2,1,0,4}));
		System.out.println(jumpgame.jump(new int[] {2,3,1,1,4}));
		System.out.println(jumpgame.jump(new int[] {2,2,0,1,4}));
		System.out.println(jumpgame.jump(new int[] {2,3,5,1,1,0,0,1,1}));
	}

}
