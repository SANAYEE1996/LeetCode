package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Convert;

class ConvertTest {
	
	private Convert con;
	
	@BeforeEach
	public void setup() {
		con = new Convert();
	}
	
	@Test
	void testCase01() {
		assertEquals("PAHNAPLSIIGYIR", con.convert("PAYPALISHIRING", 3));
	}
	
	@Test
	void testCase02() {
		assertEquals("PINALSIGYAHRPI", con.convert("PAYPALISHIRING", 4));
	}
	
	@Test
	void testCase03() {
		assertEquals("P", con.convert("P", 1));
	}


}
