package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.IntToRoman;

class IntToRomanTest {
	
	private IntToRoman ir;
	
	@BeforeEach
	public void setup() {
		ir = new IntToRoman();
	}
	
	@Test
	void testOneNumber() {
		assertEquals("IV",ir.intToRoman(4));
	}
	
	@Test
	void testTwoNumber() {
		assertEquals("XXXIX",ir.intToRoman(39));
	}
	
	@Test
	void testThreeNumber() {
		assertEquals("CMXCIX",ir.intToRoman(999));
	}
	
	@Test
	void testFourNumber() {
		assertEquals("MMMCMXCIX",ir.intToRoman(3999));
	}
	
}
