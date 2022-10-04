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
//		assertEquals(2, mincost.minCost("aabcc", new int[] {1,2,3,4,1}));
//		assertEquals(3, mincost.minCost("abaac", new int[] {1,2,3,4,5}));
//		assertEquals(26, mincost.minCost("aaabbbabbbb", new int[] {3,5,10,7,5,3,5,5,4,8,1}));
		System.out.println(mincost.minCost("aabcc", new int[] {1,2,3,4,1}));
		System.out.println(mincost.minCost("abaac", new int[] {1,2,3,4,5}));
		System.out.println(mincost.minCost("acaaa", new int[] {1,2,3,4,5}));
		System.out.println(mincost.minCost("aaabbbabbbb", new int[] {3,5,10,7,5,3,5,5,4,8,1}));
	}

}
