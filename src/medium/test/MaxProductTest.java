package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxProduct;

class MaxProductTest {
	
	private MaxProduct mp;
	
	@BeforeEach
	public void setup() {
		mp = new MaxProduct();
	}

	@Test
	void testCaseNoMinus() {
		assertEquals(0,mp.maxProduct(new int[] {1,2,3,4,5}));
	}
	
	@Test
	void testCaseOddMinus() {
		assertEquals(0,mp.maxProduct(new int[] {3,4,-1,2,5}));
	}
	
	@Test
	void testCaseEvenMinus() {
		assertEquals(0,mp.maxProduct(new int[] {1,1,-1,2,4,-2,5,-3,4,5,6,7}));
	}
	
	@Test
	void testCaseZeroExist() {
		assertEquals(0,mp.maxProduct(new int[] {-2,0,-1}));
		assertEquals(0,mp.maxProduct(new int[] {-2,0,-1,-1,-1,0,0,5}));
		assertEquals(0,mp.maxProduct(new int[] {0,0}));
	}

}
