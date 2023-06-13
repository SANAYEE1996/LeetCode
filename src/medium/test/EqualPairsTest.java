package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.EqualPairs;

class EqualPairsTest {
	
	private EqualPairs ep;
	
	@BeforeEach
	void setup() {
		ep = new EqualPairs();
	}

	@Test
	void test01() {
		int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
		assertEquals(1,ep.equalPairs(grid));
	}
	
	@Test
	void test02() {
		int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		assertEquals(3,ep.equalPairs(grid));
	}

}
