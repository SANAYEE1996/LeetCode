package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NumSquares;

class NumSquaresTest {
	
	private NumSquares ns;
	
	@BeforeEach
	public void setup() {
		ns = new NumSquares();
	}

	@Test
	void test() {
		assertEquals(3 , ns.numSquares(12));
		assertEquals(1 , ns.numSquares(9));
		assertEquals(1 , ns.numSquares(1));
		assertEquals(3 , ns.numSquares(3));
		assertEquals(1 , ns.numSquares(4));
		assertEquals(1 , ns.numSquares(100));
	}

}
