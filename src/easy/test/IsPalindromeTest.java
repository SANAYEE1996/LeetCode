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
		System.out.println(ip.getSize(1));
		System.out.println(ip.getSize(9));
		System.out.println(ip.getSize(10));
		System.out.println(ip.getSize(99));
		System.out.println(ip.getSize(100));
		System.out.println(ip.getSize(999));
		System.out.println(ip.getSize(Integer.MAX_VALUE));
	}

}
