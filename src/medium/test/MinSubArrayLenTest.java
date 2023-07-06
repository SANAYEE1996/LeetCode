package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinSubArrayLen;

class MinSubArrayLenTest {
	
	private MinSubArrayLen msa;
	
	@BeforeEach
	void setup() {
		msa = new MinSubArrayLen();
	}

	@Test
	void test01() {
		int target = 7;
		int[] nums = {2,3,1,2,4,3};
		assertEquals(2,msa.minSubArrayLen(target, nums));
	}
	
	@Test
	void test02() {
		int target = 4;
		int[] nums = {1,4,4};
		assertEquals(1,msa.minSubArrayLen(target, nums));
	}
	
	@Test
	void test03() {
		int target = 11;
		int[] nums = {1,1,1,1,1,1,1,1};
		assertEquals(0,msa.minSubArrayLen(target, nums));
	}
	
	@Test
	void test04() {
		int target = 37;
		int[] nums = {4,7,9,1,3,7,8,5,6,2,5,12,19,1,3,6};
		assertEquals(4,msa.minSubArrayLen(target, nums));
	}
	
	@Test
	void test05() {
		int target = 80;
		int[] nums = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};
		assertEquals(6,msa.minSubArrayLen(target, nums));
	}

}
