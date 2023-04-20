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
		assertEquals("x=2",se.solveEquation("x+5-3+x=6+x-2"));
	}
	
	@Test
	void test01() {
		assertEquals("Infinite solutions",se.solveEquation("x=x"));
	}
	
	@Test
	void test02() {
		assertEquals("x=0",se.solveEquation("2x=x"));
	}
	
	@Test
	void test03() {
		assertEquals("x=10",se.solveEquation("19x-49-12x=11+x"));
	}
	
	@Test
	void test04() {
		assertEquals("x=-30",se.solveEquation("9x-49-12x=11-x"));
	}
	
	@Test
	void test05() {
		assertEquals("No solution",se.solveEquation("x=x+2"));
	}

}
