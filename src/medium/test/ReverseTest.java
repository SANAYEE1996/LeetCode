package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Reverse;

class ReverseTest {
	
	private Reverse rev;
	
	@BeforeEach
	public void setup() {
		rev = new Reverse();
	}

	@Test
	void testCase01() {
		assertEquals(21, rev.reverse(120));
	}
	
	@Test
	void testCase02() {
		assertEquals(-321, rev.reverse(-123));
	}

}
