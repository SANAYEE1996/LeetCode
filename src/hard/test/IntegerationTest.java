package hard.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.Candy;
import hard.CodingStudy;
import hard.LadderLength;
import hard.Trap;
import hard.WordBreak;

class IntegerationTest {
	
	private Candy candy;
	private LadderLength ladderLength;
	private Trap trap;
	private WordBreak wordbreak;
	private CodingStudy codingstudy;
	
	@BeforeEach
	public void setup() {
		candy = new Candy();
		ladderLength = new LadderLength();
		trap = new Trap();
		wordbreak = new WordBreak();
		codingstudy = new CodingStudy();
	}
	
	@Test
	void test() {
		//String[] longStrArray = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
		List<String> inputList = new ArrayList<>(Arrays.asList(new String[] {"hot","dot","dog","lot","log","cog"}));
//		List<String> inputList2 = new ArrayList<>(Arrays.asList(new String[] {"hot","dot","dog","lot","log"}));
//		List<String> inputList3 = new ArrayList<>(Arrays.asList(longStrArray));
		System.out.println(ladderLength.ladderLength("hit", "cog", inputList));
//		System.out.println(ladderLength.ladderLength("hit", "cog", inputList2));
//		System.out.println(ladderLength.ladderLength("qa", "sq", inputList3));
	}
	
	@Test
	void testCase02() {
		int[] exam = {0,1,0,2,1,0,1,3,2,1,2,1};
		assertEquals(6,trap.trap(exam));
	}
	
	@Test
	void testCase03() {
		int[] exam = {9,8,7,6,5,4};
		assertEquals(0,trap.trap(exam));
	}
	
	@Test
	void testCase04() {
		int[] exam = new int[20000];
		int value = 20000;
		for(int i = 0; i < exam.length; i++) {
			exam[i] = value;
			value--;
		}
		assertEquals(0,trap.trap(exam));
	}
	/*
	 * 1,3,2,2,1
	 * 1 1 1 1 1
	 * 1 2 1 1 1
	 * 1 2 1 2 1
	 * 
	 * 1,6,9,8,7,3,2
	 * 1 1 1 1 1 1 1
	 * 1 2 3 1 1 1 1
	 * 1 2 3 1 1 1 1
	 * 1 1 3 2 1 1 1
	 * 1 1 4 3 2 1 1
	 * 1 1 
	 * */
	@Test
	void candyTest01() {
		System.out.println(candy.candy(new int[] {1,0,2}));
		System.out.println(candy.candy(new int[] {1,2,2}));
		System.out.println(candy.candy(new int[] {1,2,87,87,87,2,1}));
		System.out.println(candy.candy(new int[] {1,3,4,5,2}));
		System.out.println(candy.candy(new int[] {1,3,2,2,1}));
		System.out.println(candy.candy(new int[] {1,6,10,8,7,3,2}));
		System.out.println(candy.candy(new int[] {9,8,7,6,5}));
		System.out.println(candy.candy(new int[] {9}));
		System.out.println(candy.candy(new int[] {1,2}));
	}
	
	
	@Test
	void wordBreakTest01() {
		System.out.println(wordbreak.wordBreak("catsanddog", new ArrayList<String>(Arrays.asList(new String[] {"cat","cats","and","sand","dog"}))));
		System.out.println(wordbreak.wordBreak("pineapplepenapple", new ArrayList<String>(Arrays.asList(new String[] {"apple","pen","applepen","pine","pineapple"}))));
	}
	
	@Test
	void codingStudyTest() {
		System.out.println("코딩 공부 테스트!");
		System.out.println(codingstudy.solution(10, 10, new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
		System.out.println(codingstudy.solution(0, 0, new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
//		assertEquals(15, codingstudy.solution(10, 10, new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
//		assertEquals(13, codingstudy.solution(0, 0, new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}
}
