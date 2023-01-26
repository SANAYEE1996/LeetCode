package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SmallestValue;

class SmallestValueTest {
	
	private SmallestValue sv;
	
	@BeforeEach
	public void setup() {
		sv = new SmallestValue();
	}
	
	@Test
	void test() {
		assertEquals(2,sv.smallestValue(2));//99974
	}
	
	@Test
	void test02() {
		assertEquals(239,sv.smallestValue(99974));
	}

}
