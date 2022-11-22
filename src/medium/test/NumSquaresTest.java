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
		assertEquals(0,ns.numSquares(1));
	}

}
