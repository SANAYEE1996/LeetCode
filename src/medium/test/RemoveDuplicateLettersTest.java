package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.RemoveDuplicateLetters;

class RemoveDuplicateLettersTest {
	
	private RemoveDuplicateLetters rdl;
	
	@BeforeEach
	public void setup() {
		rdl = new RemoveDuplicateLetters();
	}
	
	@Test
	void test() {
		assertEquals("abc", rdl.removeDuplicateLetters("bcabc"));
	}

}
