package medium.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.CheckSubarraySum;

class CheckSubarraySumTest {

	private CheckSubarraySum c;
	
	@BeforeEach
	public void setup() {
		c = new CheckSubarraySum();
	}
	
	@Test
	void testCaseTrue() {
		assertTrue(c.checkSubarraySum(new int[] {23,2,4,6,7}, 6));
		assertTrue(c.checkSubarraySum(new int[] {23,2,6,4,7}, 6));
		assertTrue(c.checkSubarraySum(new int[] {6,12,18,24,30}, 6));
		assertTrue(c.checkSubarraySum(new int[] {2,4,6}, 6));
		assertTrue(c.checkSubarraySum(new int[] {23,2,4,6,6}, 7));
	}
	
	@Test
	void testCaseFalse() {
		assertFalse(c.checkSubarraySum(new int[] {23,2,6,4,7}, 13));
		assertFalse(c.checkSubarraySum(new int[] {1,2,39,16,7}, 17));
		assertFalse(c.checkSubarraySum(new int[] {46,46,46,43,2}, 47));
	}

}
