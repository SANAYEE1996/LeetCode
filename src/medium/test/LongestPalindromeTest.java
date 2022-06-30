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
	void test() {
		assertEquals("aba", p.longestPalindrome("aba"));
	}

}
