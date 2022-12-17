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
		assertEquals("",ln.largestNumber(new int[] {10,2}));
	}
	
	@Test
	void test02() {
		assertEquals("",ln.largestNumber(new int[] {3,30,34,5,9}));
	}

}
