package hard.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.FindWords;

class FindWordsTest {
	private FindWords mr;
	
	@BeforeEach
	void setup() {
		mr = new FindWords();
	}

	@Test
	void test01() {
		char[][] matrix = { {'o','a','a','n'},
							{'e','t','a','e'},
							{'i','h','k','r'},
							{'i','f','l','v'}};
		String[] words = {"oath","pea","eat","rain"};
		System.out.println(mr.findWords(matrix, words));
	}
	
	@Test
	void test02() {
		char[][] matrix = { {'a','b'},{'c','d'}};
		String[] words = {"abcb"};
		System.out.println(mr.findWords(matrix, words));
	}
	
	@Test
	void test03() {
		char[][] matrix = { {'a','b','c'},
							{'a','e','d'},
							{'a','f','g'}};
		String[] words = {"abcdefg","gfedcbaaa","eaabcdgfa","befa","dgc","ade"};
		System.out.println(mr.findWords(matrix, words));
	}
}
