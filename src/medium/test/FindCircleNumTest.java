package medium.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindCircleNum;

class FindCircleNumTest {
	
	private FindCircleNum fc;
	
	@BeforeEach
	void setup() {
		fc = new FindCircleNum();
	}

	@Test
	void test() {
		int[][] nums = {{1,1,0},{1,1,0},{0,0,1}};
		assertEquals(0, fc.findCircleNum(nums));
	}

}
