package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.PrimePalindrome;

class PrimePalindromeTest {
	
	private PrimePalindrome pp;
	
	@BeforeEach
	public void setup() {
		pp = new PrimePalindrome();
	}
	
	@Test
	void test() {
		assertEquals(5, pp.primePalindrome(5));
		assertEquals(11, pp.primePalindrome(8));
		assertEquals(101, pp.primePalindrome(17));
		assertEquals(100030001, pp.primePalindrome(9989900));
	}

}
