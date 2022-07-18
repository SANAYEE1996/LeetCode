package easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.IsPalindrome;

class IsPalindromeTest {
	
	private IsPalindrome ip;
	
	@BeforeEach
	public void setup() {
		ip = new IsPalindrome();
	}

	@Test
	void test() {
		assertEquals(true, ip.isPalindrome(121));
		assertEquals(true, ip.isPalindrome(9999));
		assertEquals(true, ip.isPalindrome(2345432));
		assertEquals(true, ip.isPalindrome(1));
		assertEquals(false, ip.isPalindrome(12));
		assertEquals(false, ip.isPalindrome(12345));
		assertEquals(false, ip.isPalindrome(-12345));
		assertEquals(false, ip.isPalindrome(Integer.MAX_VALUE));
	}
	
	@Test
	void testGetSize() {
//		System.out.println(ip.getSize(1));
//		System.out.println(ip.getSize(9));
//		System.out.println(ip.getSize(10));
//		System.out.println(ip.getSize(99));
//		System.out.println(ip.getSize(100));
//		System.out.println(ip.getSize(999));
//		System.out.println(ip.getSize(Integer.MAX_VALUE));
	}

}
