package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FractionToDecimal;

class FractionToDecimalTest {
	
	private FractionToDecimal f;
	
	@BeforeEach
	public void setup() {
		f = new FractionToDecimal();
	}
	
	@Test
	void test() {
		//assertEquals("",f.fractionToDecimal(1, 2));
		//assertEquals("2",f.fractionToDecimal(2, 1));
		//assertEquals("37",f.fractionToDecimal(74, 2));
		assertEquals("",f.fractionToDecimal(4, 333));
		assertEquals("",f.fractionToDecimal(37, 333));
		assertEquals("",f.fractionToDecimal(11, 333));
	}

}
