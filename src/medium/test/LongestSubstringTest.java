package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LongestSubstring;

class LongestSubstringTest {
	
	private LongestSubstring ls;
	
	@BeforeEach
	public void setup() {
		ls = new LongestSubstring();
	}

	@Test
	void test01() {
		assertEquals(2,ls.longestSubstring("aabcc", 2));
	}
	
	@Test
	void test02() {
		assertEquals(3,ls.longestSubstring("aaabb", 3));
	}
	
	@Test
	void test03() {
		assertEquals(5,ls.longestSubstring("ababbc", 2));
	}
	
	@Test
	void test04() {
		assertEquals(0,ls.longestSubstring("ababacb", 3));
	}
	
	@Test
	void test05() {
		assertEquals(3,ls.longestSubstring("bbaaacddcaabdbd", 3));
	}
}
