package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Calculate;

class CalculateTest {
	
	private Calculate c;
	
	@BeforeEach
	public void setup() {
		c = new Calculate();
	}
	
	@Test
	void onlyAddOrMinustest() {
		assertEquals(0,c.calculate("1+2+3"));
		assertEquals(0,c.calculate("1-2-3- 100- 205"));
	}
	
	@Test
	void onlyDivideOrMultiplytest() {
		assertEquals(0,c.calculate("1 *2 * 3"));
		assertEquals(0,c.calculate("1 /2 /3/  100/205"));
	}
	
	@Test
	void strangeTest() {
		assertEquals(0,c.calculate("-1+2+"));
		assertEquals(0,c.calculate("-1+2*"));
	}

}
