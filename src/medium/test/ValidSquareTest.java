package medium.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ValidSquare;

class ValidSquareTest {
	
	private ValidSquare vs;
	
	@BeforeEach
	public void setup() {
		vs = new ValidSquare();
	}

	@Test
	void test01() {
		int[] a = {0,0};
		int[] b = {1,1};
		int[] c = {1,0};
		int[] d = {0,1};
		assertTrue(vs.validSquare(a, b, c, d));
	}
	
	@Test
	void test02() {
		int[] a = {0,0};
		int[] b = {1,1};
		int[] c = {1,0};
		int[] d = {0,12};
		assertFalse(vs.validSquare(a, b, c, d));
	}
	
	@Test
	void test03() {
		int[] a = {1,0};
		int[] b = {-1,0};
		int[] c = {0,1};
		int[] d = {0,-1};
		assertTrue(vs.validSquare(a, b, c, d));
	}
	
	@Test
	void test04() {
		int[] a = {1134,-2539};
		int[] b = {492,-1255};
		int[] c = {-792,-1897};
		int[] d = {-150,-3181};
		assertTrue(vs.validSquare(a, b, c, d));
	}

}
