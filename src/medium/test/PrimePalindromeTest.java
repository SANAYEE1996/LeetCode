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
		System.out.println(pp.primePalindrome(9989900));
		assertEquals(true, pp.isPalindrome(5));
		assertEquals(true, pp.isPalindrome(121));
		assertEquals(true, pp.isPalindrome(12455421));
		assertEquals(true, pp.isPalindrome(124565421));
		assertEquals(false, pp.isPalindrome(124565431));
		assertEquals(false, pp.isPalindrome(12455431));
		assertEquals(false, pp.isPalindrome(1245431));
		assertEquals(true, pp.isPalindrome(1245421));
		assertEquals(false, pp.isPalindrome(1245420));
//		System.out.println(pp.isPrime(101));
//		assertEquals(1, pp.getIntegerLength(1));
//		assertEquals(1, pp.getIntegerLength(4));
//		assertEquals(1, pp.getIntegerLength(5));
//		assertEquals(1, pp.getIntegerLength(9));
//		assertEquals(2, pp.getIntegerLength(10));
//		assertEquals(2, pp.getIntegerLength(47));
//		assertEquals(3, pp.getIntegerLength(100));
//		assertEquals(3, pp.getIntegerLength(357));
//		assertEquals(4, pp.getIntegerLength(1000));
//		assertEquals(10, pp.getIntegerLength(2104080000));
	}

}
