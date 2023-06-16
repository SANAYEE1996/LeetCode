package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxValue;

class MaxValueTest {
	
	private MaxValue mv;
	
	@BeforeEach
	void setup() {
		mv = new MaxValue();
	}

	@Test
	void test01() {
		assertEquals(30000001, mv.maxValue(7, 4, 210000000));
	}
	
	@Test
	void test02() {
		assertEquals(2, mv.maxValue(4, 2, 6));
	}
	
	@Test
	void test03() {
		assertEquals(3, mv.maxValue(6, 1, 10));
	}
	
	@Test
	void test04() {
		assertEquals(1, mv.maxValue(4, 0, 4));
	}

}
