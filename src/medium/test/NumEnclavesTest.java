package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NumEnclaves;

class NumEnclavesTest {
	
	private NumEnclaves ne;
	
	@BeforeEach
	public void setup() {
		ne = new NumEnclaves();
	}

	@Test
	void test01() {
		int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
		assertEquals(3,ne.numEnclaves(grid));
	}
	
	@Test
	void test02() {
		int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
		assertEquals(3,ne.numEnclaves(grid));
	}

}
