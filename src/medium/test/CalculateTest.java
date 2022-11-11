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
	void simpleAddTest() {
		assertEquals(3,c.calculate("1+2"));
	}
	
	@Test
	void onlyAddOrMinustest() {
		assertEquals(6,c.calculate("1+2+3"));
		assertEquals(-309,c.calculate("1-2-3- 100- 205"));
	}
	
	@Test
	void onlyDivideOrMultiplytest() {
		assertEquals(6,c.calculate("1 *2 * 3"));
		assertEquals(0,c.calculate("1 /2 /3/  100/205"));
	}
	
	@Test
	void strangeTest() {
		assertEquals(1,c.calculate("-1+2+"));
		assertEquals(1,c.calculate("-1+2*"));
		assertEquals(3,c.calculate("*1+2*"));
		assertEquals(3,c.calculate("/1+2*"));
	}
	
	@Test
	void originTest() {
		assertEquals(7,c.calculate("3+2*2"));
		assertEquals(5,c.calculate(" 3+5 / 2 "));
	}

}
