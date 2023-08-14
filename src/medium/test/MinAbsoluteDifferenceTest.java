package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinAbsoluteDifference;

class MinAbsoluteDifferenceTest {
	
	private MinAbsoluteDifference mad;
	
	@BeforeEach
	void setup() {
		mad = new MinAbsoluteDifference();
	}

	@Test
	void test01() {
		List<Integer> nums = Arrays.asList(new Integer[] {4,3,2,4});
		assertEquals(0, mad.minAbsoluteDifference(nums, 2));
	}
	
	@Test
	void test02() {
		List<Integer> nums = Arrays.asList(new Integer[] {5,3,2,10,15});
		assertEquals(1, mad.minAbsoluteDifference(nums, 1));
	}
	
	@Test
	void test03() {
		List<Integer> nums = Arrays.asList(new Integer[] {1,2,3,4});
		assertEquals(3, mad.minAbsoluteDifference(nums, 3));
	}
	
	@Test
	void test04() {
		List<Integer> nums = Arrays.asList(new Integer[] {3,8,12,6,23,7,1,23,7,2,7,35,2});
		assertEquals(4, mad.minAbsoluteDifference(nums, 2));
	}

}
