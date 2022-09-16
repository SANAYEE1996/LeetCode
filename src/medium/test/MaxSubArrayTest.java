package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxSubArray;

class MaxSubArrayTest {
	
	private MaxSubArray maxSubArray;
	
	@BeforeEach
	public void setup() {
		maxSubArray = new MaxSubArray();
	}
	
	@Test
	void test() {
		System.out.println(maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(maxSubArray.maxSubArray(new int[] {1,2,3,4,5}));
	}

}
