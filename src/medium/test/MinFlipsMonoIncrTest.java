package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinFlipsMonoIncr;

class MinFlipsMonoIncrTest {
	
	private MinFlipsMonoIncr mm;
	
	@BeforeEach
	public void setup() {
		mm = new MinFlipsMonoIncr();
	}
	
	@Test
	void test() {
		assertEquals(1,mm.minFlipsMonoIncr("00110"));
	}
	
	@Test
	void test02() {
		assertEquals(2,mm.minFlipsMonoIncr("010110"));
	}
	
	@Test
	void test03() {
		assertEquals(2,mm.minFlipsMonoIncr("00011000"));
	}
	
	@Test
	void test04() {
		assertEquals(5,mm.minFlipsMonoIncr("10011111110010111011"));
	}

}
