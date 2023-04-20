package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SolveEquation;

class SolveEquationTest {
	
	private SolveEquation se;
	
	@BeforeEach
	public void setup() {
		se = new SolveEquation();
	}

	@Test
	void test() {
		assertEquals("",se.solveEquation("x+5-3+x=6+x-2"));
	}

}
