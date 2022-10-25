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
		assertEquals("",f.fractionToDecimal(4, 2));
	}

}
