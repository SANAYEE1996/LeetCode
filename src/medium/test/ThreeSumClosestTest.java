package medium.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ThreeSumClosest;

class ThreeSumClosestTest {
	
	private ThreeSumClosest tsc;
	
	@BeforeEach
	void setup() {
		tsc = new ThreeSumClosest();
	}

	@Test
	void test01() {
		int[] nums = {-1,2,1,-4}; 
		int target = 1;
		assertEquals(2,tsc.threeSumClosest(nums, target));
	}
	
	@Test
	void test02() {
		int[] nums = {0,0,0}; 
		int target = 1;
		assertEquals(0,tsc.threeSumClosest(nums, target));
	}
	
	@Test
	void test03() {
		int[] nums = {-1,2,1,-4,5,9,-14,68,999,-640,-4,-47,-79,13,1,14,-20,58}; 
		int target = 59;
		assertEquals(60,tsc.threeSumClosest(nums, target));
	}

}
