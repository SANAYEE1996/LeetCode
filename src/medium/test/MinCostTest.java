package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinCost;

class MinCostTest {
	
	private MinCost mincost;
	
	@BeforeEach
	public void setup() {
		mincost = new MinCost();
	}

	@Test
	void test() {
		assertEquals(0, mincost.minCost("", new int[] {}));
	}

}
