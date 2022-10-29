package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ReverseWords;

class ReverseWordsTest {
	
	private ReverseWords r;
	
	@BeforeEach
	public void setup() {
		r = new ReverseWords();
	}
	
	@Test
	void test() {
		assertEquals("example good a", r.reverseWords("a good   example"));
		assertEquals("blue is sky the", r.reverseWords("the sky is blue"));
		assertEquals("world hello", r.reverseWords("  hello world  "));
	}

}
