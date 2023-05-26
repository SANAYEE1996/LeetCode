package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinDifference;

class MinDifferenceTest {
	
	private MinDifference md;
	
	@BeforeEach
	void setup() {
		md = new MinDifference();
	}

	@Test
	void test01() {
		int[] nums = {1,5,0,10,14};
		assertEquals(1, md.minDifference(nums));
	}
	
	@Test
	void test02() {
		int[] nums = {-44,-32,-17,-3,0,1,9,59};
		assertEquals(26, md.minDifference(nums));
	}
	
	@Test
	void test03() {
		int[] nums = {6,6,0,1,1,4,6};
		assertEquals(2, md.minDifference(nums));
	}
	
	@Test
	void test04() {
		int[] nums = {20,66,68,57,45,18,42,34,37,58};
		assertEquals(31, md.minDifference(nums));
	}

}
