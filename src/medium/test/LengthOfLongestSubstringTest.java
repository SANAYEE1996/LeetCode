package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LengthOfLongestSubstring;

class LengthOfLongestSubstringTest {
	
	private LengthOfLongestSubstring lls;
	
	@BeforeEach
	public void setup() {
		lls = new LengthOfLongestSubstring();
	}

	@Test
	void test() {
		assertEquals(3,lls.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1,lls.lengthOfLongestSubstring("bbbbbbb"));
		assertEquals(3,lls.lengthOfLongestSubstring("pwwkew"));
		assertEquals(2,lls.lengthOfLongestSubstring(" p "));
		assertEquals(1,lls.lengthOfLongestSubstring(" "));
		assertEquals(2,lls.lengthOfLongestSubstring("au"));
		assertEquals(3,lls.lengthOfLongestSubstring("dvdf"));
	}

}
