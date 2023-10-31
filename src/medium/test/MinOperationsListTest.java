package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinOperationsList;

class MinOperationsListTest {
	
	private MinOperationsList mol;
	
	@BeforeEach
	void init() {
		mol = new MinOperationsList();
	}

	@Test
	void test01() {
		int[] nums = {3,1,6,8};
		int[] queriess = {1,5};
		List<Long> expected = Arrays.asList(14L, 10L);
		assertEquals(expected, mol.minOperations(nums, queriess));
	}
	
	@Test
	void test02() {
		int[] nums = {2,9,6,3};
		int[] queriess = {10};
		List<Long> expected = Arrays.asList(20L);
		assertEquals(expected, mol.minOperations(nums, queriess));
	}

}
