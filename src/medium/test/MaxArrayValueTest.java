package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxArrayValue;

class MaxArrayValueTest {
	
	private MaxArrayValue mav;
	
	@BeforeEach
	void setup() {
		mav = new MaxArrayValue();
	}

	@Test
	void test01() {
		int[] nums = {2,3,7,9,3};
		assertEquals(21,mav.maxArrayValue(nums));
	}
	
	@Test
	void test02() {
		int[] nums = {5,3,3};
		assertEquals(11,mav.maxArrayValue(nums));
	}
	
	@Test
	void test03() {
		int[] nums = {13,5,7,9,123,4,6,8,3,2,21,7,13,7,2,8,4,6,7,8,1,3,5,23,456,57,12};
		assertEquals(751,mav.maxArrayValue(nums));
	}
	
	@Test
	void test04() {
		int[] nums = {40,15,35,98,77,79,24,62,53,84,97,16,30,22,49};
		assertEquals(781,mav.maxArrayValue(nums));
	}
}
