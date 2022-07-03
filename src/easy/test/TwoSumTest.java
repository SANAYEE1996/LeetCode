package easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.TwoSum;

class TwoSumTest {
	
	private TwoSum ts;
	
	@BeforeEach
	public void setup() {
		ts = new TwoSum();
	}

	@Test
	void test() {
		int[] nums = {1,1,2,3};
		int[] answer = {0,1};
		assertEquals(answer, ts.twoSum(nums, 2));
	}

}
