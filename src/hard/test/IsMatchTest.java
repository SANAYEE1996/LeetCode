package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.IsMatch;

class IsMatchTest {

	private IsMatch is;
	
	@BeforeEach
	public void setup() {
		is = new IsMatch();
	}
	
	
	
	@Test
	void test() {
		assertEquals(true, is.isMatch("abceb", "*a*b"));
		assertEquals(false, is.isMatch("ab", "?d"));
		assertEquals(false, is.isMatch("aa", "a"));
		assertEquals(true, is.isMatch("aa", "a*"));
		assertEquals(true, is.isMatch("", "***"));
		assertEquals(true, is.isMatch("abcabczzzde", "*abc???de*"));
		assertEquals(true, is.isMatch("abefcdgiescdfimde", "ab*cd?i*de"));
		assertEquals(true, is.isMatch("acdcb", "a*c?b"));
	}

}
