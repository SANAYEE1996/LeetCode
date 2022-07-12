package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.LongestValidParentheses;

class LongestValidParenthesesTest {
	
	private LongestValidParentheses l;
	
	@BeforeEach
	public void setup() {
		l = new LongestValidParentheses();
	}
	
	@Test
	void test() {
		assertEquals(2, l.longestValidParentheses("(()"));
	}
	
	@Test
	void test2() {
		assertEquals(0, l.longestValidParentheses(""));
	}
	
	@Test
	void test3() {
		assertEquals(4, l.longestValidParentheses(")()())"));
	}
	
	@Test
	void test4() {
		assertEquals(4, l.longestValidParentheses("()(()()(((())"));
	}
	
	@Test
	void test5() {
		assertEquals(10, l.longestValidParentheses("((((()))))"));
	}
	
	@Test
	void test6() {
		assertEquals(6, l.longestValidParentheses("(())()"));
	}
	
	@Test
	void test7() {
		assertEquals(2, l.longestValidParentheses("()"));
	}

}
