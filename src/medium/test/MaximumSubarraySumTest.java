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
		assertEquals(0,mss.maximumSubarraySum(new int[] {1,5,4,2,9,9,9},3));
		assertEquals(0,mss.maximumSubarraySum(new int[] {4,4,4},3));
	}

}
