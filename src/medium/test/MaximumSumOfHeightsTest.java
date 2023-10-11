package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaximumSumOfHeights;

class MaximumSumOfHeightsTest {
	
	private MaximumSumOfHeights msh;
	
	@BeforeEach
	void init() {
		msh = new MaximumSumOfHeights();
	}

	@Test
	void test01() {
		List<Integer> maxHeights = Arrays.asList(new Integer[] {5,3,4,1,1});
		assertEquals(13, msh.maximumSumOfHeights(maxHeights));
	}
	
	@Test
	void test02() {
		List<Integer> maxHeights = Arrays.asList(new Integer[] {6,5,3,9,2,7});
		assertEquals(22, msh.maximumSumOfHeights(maxHeights));
	}

	@Test
	void test03() {
		List<Integer> maxHeights = Arrays.asList(new Integer[] {3,2,5,5,2,3});
		assertEquals(18, msh.maximumSumOfHeights(maxHeights));
	}
}
