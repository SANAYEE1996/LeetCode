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
	
//	@Test
//	void testCaseTrue() {
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//		assertTrue(c.checkSubarraySum(new int[] {}, 3));
//	}
	
	@Test
	void testCaseFalse() {
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
		assertFalse(c.checkSubarraySum(new int[] {}, 3));
	}

}
