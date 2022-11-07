package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaximumSubarraySum;

class MaximumSubarraySumTest {
	
	private MaximumSubarraySum mss;
	
	@BeforeEach
	public void setup() {
		mss = new MaximumSubarraySum();
	}
	
	@Test
	void test() {
		assertEquals(15,mss.maximumSubarraySum(new int[] {1,5,4,2,9,9,9},3));
		assertEquals(0,mss.maximumSubarraySum(new int[] {4,4,4},3));
		assertEquals(24,mss.maximumSubarraySum(new int[] {1,1,1,7,8,9},3));
		assertEquals(8,mss.maximumSubarraySum(new int[] {1,2,1,2,5,1,2},3));
		assertEquals(8,mss.maximumSubarraySum(new int[] {3,5,3,4},2));
		assertEquals(0,mss.maximumSubarraySum(new int[] {5,3,3,1,1},3));
		assertEquals(8,mss.maximumSubarraySum(new int[] {3,5,2,4},2));
	}

}
