package medium.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxWidthOfVerticalArea;

class MaxWidthOfVerticalAreaTest {
	
	private MaxWidthOfVerticalArea mwv;
	
	@BeforeEach
	void init() {
		mwv = new MaxWidthOfVerticalArea();
	}

	@Test
	void test01() {
		int[][] points = {{8,7},{9,9},{7,4},{9,7}};
		assertEquals(mwv.maxWidthOfVerticalArea(points), 1);
	}

	@Test
	void test02() {
		int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
		assertEquals(mwv.maxWidthOfVerticalArea(points), 3);
	}
}
