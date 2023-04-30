package medium.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.IntegerReplacement;

class IntegerReplacementTest {
	
	private IntegerReplacement ir;
	
	@BeforeEach
	public void setup() {
		ir = new IntegerReplacement();
	}

	@Test
	void test01() {
		assertEquals(1,ir.integerReplacement(2));
	}
	
	@Test
	void test02() {
		assertEquals(4,ir.integerReplacement(7));
	}
	
	@Test
	void test03() {
		assertEquals(2,ir.integerReplacement(4));
	}
	
	@Test
	void test04() {
		assertEquals(10,ir.integerReplacement(1024));
	}
	
	@Test
	void test05() {
		assertEquals(10,ir.integerReplacement(513));
	}
	
	

}
