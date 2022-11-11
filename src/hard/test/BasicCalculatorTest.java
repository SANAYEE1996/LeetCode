package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.BasicCalculator;

class BasicCalculatorTest {
	
	private BasicCalculator bc;
	
	@BeforeEach
	public void setup() {
		bc = new BasicCalculator();
	}

	@Test
	void NotExistParttest() {
		assertEquals(0,bc.calculate("1+2+3"));
	}

}
