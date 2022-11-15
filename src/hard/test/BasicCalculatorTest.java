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
	void NotExistPartTest() {
		assertEquals(0,bc.calculate("1+2+3"));
	}
	
	@Test
	void doExsitPartTest() {
		assertEquals(0,bc.calculate("(1+(4+5+2)-3)+(6+78)"));
		assertEquals(0,bc.calculate("((1-(4+(48-4)+2)-3)+((4-(4-92))+6+78))-54"));
	}

}
