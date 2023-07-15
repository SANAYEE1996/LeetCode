package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.LongestSubsequence;

class LongestSubsequenceTest {
	
	private LongestSubsequence ls;
	
	@BeforeEach
	void setup() {
		ls = new LongestSubsequence();
	}

	@Test
	void test01() {
		int[] arr = {1,2,3,4};
		int difference = 1;
		assertEquals(4,ls.longestSubsequence(arr, difference));
	}
	
	@Test
	void test02() {
		int[] arr = {1,3,5,7};
		int difference = 1;
		assertEquals(1,ls.longestSubsequence(arr, difference));
	}
	
	@Test
	void test03() {
		int[] arr = {1,5,7,8,5,3,4,2,1};
		int difference = -2;
		assertEquals(4,ls.longestSubsequence(arr, difference));
	}
	
	@Test
	void test04() {
		int[] arr = {3,4,-3,-2,-4};
		int difference = -5;
		assertEquals(2,ls.longestSubsequence(arr, difference));
	}
	
	@Test
	void test05() {
		int[] arr = {3,0,-3,4,-4,7,6};
		int difference = 3;
		assertEquals(2,ls.longestSubsequence(arr, difference));
	}
	
	@Test
	void test06() {
		int[] arr = {4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8};
		int difference = 0;
		assertEquals(2,ls.longestSubsequence(arr, difference));
	}

}
