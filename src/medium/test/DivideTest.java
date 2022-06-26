package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Divide;

class DivideTest {
	
	private Divide div;
	
	@BeforeEach
	public void setup() {
		div = new Divide();
	}

	@Test
	void testCase01() {
		assertEquals(-2, div.divide(7, -3));
	}
	
	@Test
	void testCase02() {
		assertEquals(2147483647, div.divide(-2147483647, -1));
	}

}
