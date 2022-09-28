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
		//System.out.println(pp.primePalindrome(9989900));
		assertEquals(true, pp.isPalindrome(5));
		assertEquals(true, pp.isPalindrome(121));
		assertEquals(true, pp.isPalindrome(12455421));
		assertEquals(true, pp.isPalindrome(124565421));
		assertEquals(false, pp.isPalindrome(124565431));
		assertEquals(false, pp.isPalindrome(12455431));
		assertEquals(false, pp.isPalindrome(1245431));
		assertEquals(true, pp.isPalindrome(1245421));
	}

}
