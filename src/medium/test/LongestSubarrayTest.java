package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LongestSubarray;

class LongestSubarrayTest {
	
	private LongestSubarray ls;
	
	@BeforeEach
	void setup() {
		ls = new LongestSubarray();
	}

	@Test
	void test01() {
		int[] nums = {0,1,1,1,0,0,1,1,1,1,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1};
		assertEquals(9,ls.longestSubarray(nums));
	}
	
	@Test
	void test02() {
		int[] nums = {1,1,0,1};
		assertEquals(3,ls.longestSubarray(nums));
	}
	
	@Test
	void test03() {
		int[] nums = {0,1,1,1,0,1,1,0,1};
		assertEquals(5,ls.longestSubarray(nums));
	}
	
	@Test
	void test04() {
		int[] nums = {1,1,1};
		assertEquals(2,ls.longestSubarray(nums));
	}
	
	@Test
	void test05() {
		int[] nums = {1};
		assertEquals(0,ls.longestSubarray(nums));
	}

}
