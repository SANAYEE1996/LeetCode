package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LargestNumber;

class LargestNumberTest {
	
	private LargestNumber ln;
	
	@BeforeEach
	public void setup() {
		ln = new LargestNumber();
	}

	@Test
	void test() {
		assertEquals("210",ln.largestNumber(new int[] {10,2}));
		assertEquals("99999898",ln.largestNumber(new int[] {9,99,998,98}));
	}
	
	@Test
	void test02() {
		assertEquals("9534330",ln.largestNumber(new int[] {3,30,34,5,9}));
	}
	
	@Test
	void test03() {
		assertEquals("1113111113",ln.largestNumber(new int[] {111311, 1113}));
	}

}
