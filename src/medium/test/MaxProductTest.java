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
		assertEquals(0,mp.maxProduct(new int[] {1,1,-1,2,4,-2,5}));
	}

}
