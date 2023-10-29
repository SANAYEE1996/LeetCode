package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinimumCardPickup;

class MinimumCardPickupTest {
	
	private MinimumCardPickup mcp;
	
	@BeforeEach
	void init() {
		mcp = new MinimumCardPickup();
	}

	@Test
	void test01() {
		int[] cards = {3,4,2,3,4,7};
		assertEquals(4, mcp.minimumCardPickup(cards));
	}
	
	@Test
	void test02() {
		int[] cards = {1,0,5,3};
		assertEquals(-1, mcp.minimumCardPickup(cards));
	}

}
