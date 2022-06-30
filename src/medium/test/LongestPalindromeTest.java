package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LongestPalindrome;

class LongestPalindromeTest {
	
	private LongestPalindrome p;
	
	@BeforeEach
	public void setup() {
		p = new LongestPalindrome();
		
	}
	
	@Test
	void test01() {
		assertEquals("aba", p.longestPalindrome("aba"));
	}
	
	@Test
	void test02() {
		assertEquals("a", p.longestPalindrome("a"));
	}
	
	@Test
	void test03() {
		assertEquals("bb", p.longestPalindrome("abbd"));
	}
	
	@Test
	void test04() {
		assertEquals("abba", p.longestPalindrome("abba"));
	}
	
	@Test
	void test05() {
		assertEquals("aa", p.longestPalindrome("aa"));
	}
	
	@Test
	void test06() {
		assertEquals("bab", p.longestPalindrome("babad"));
	}
	
	@Test
	void test07() {
		assertEquals("bbbbbbb", p.longestPalindrome("bbbbbbba"));
	}
	
	@Test
	void test08() {
		assertEquals("abbbbbbba", p.longestPalindrome("abbbbbbba"));
	}
	
	@Test
	void test09() {
		assertEquals("a", p.longestPalindrome("abcdefgh"));
	}
	
	@Test
	void test10() {
		assertEquals("bcb", p.longestPalindrome("eabcb"));
	}
	
	@Test
	void test11() {
		assertEquals("ddtattarrattatdd", p.longestPalindrome("addtattarrattatdde"));
	}

}
