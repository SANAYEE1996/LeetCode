package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinimumCost;

class MinimumCostTest {
	
	private MinimumCost mc;
	
	@BeforeEach
	void setup() {
		mc = new MinimumCost();
	}

	@Test
	void test01() {
		assertEquals(4,mc.minimumCost("0101"));
	}
	
	@Test
	void test02() {
		assertEquals(9,mc.minimumCost("010101"));
	}

}
