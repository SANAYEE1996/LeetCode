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
		assertEquals(0,mm.minFlipsMonoIncr("00110"));
	}

}
