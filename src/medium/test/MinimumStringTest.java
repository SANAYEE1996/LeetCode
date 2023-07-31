package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinimumString;

public class MinimumStringTest {

	
	private MinimumString ms;
	
	@BeforeEach
	void setup() {
		ms = new MinimumString();
	}
	
	@Test
	void addTwoStringTest() {
		assertEquals("aaabca", ms.minimumString("abc", "bca", "aaa"));
		assertEquals("aba", ms.minimumString("ab", "ba", "aba"));
		assertEquals("cac", ms.minimumString("a", "a", "cac"));
	}
}
