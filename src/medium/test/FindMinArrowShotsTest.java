package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindMinArrowShots;

class FindMinArrowShotsTest {
	
	private FindMinArrowShots fma;
	
	@BeforeEach
	public void setup() {
		fma = new FindMinArrowShots();
	}
	
	@Test
	void test() {
		int[][] map = {{10,16},{2,8},{1,6},{7,12}};
		assertEquals(2,fma.findMinArrowShots(map));
	}
	
	@Test
	void test02() {
		int[][] map = {{10,16},{2,8},{1,6},{7,12},{1,4}};
		assertEquals(2,fma.findMinArrowShots(map));
	}
	
	@Test
	void test03() {
		int[][] map = {{1,2},{3,4},{5,6},{7,8}};
		assertEquals(4,fma.findMinArrowShots(map));
	}
	
	@Test
	void test04() {
		int[][] map = {{1,2},{2,3},{3,4},{4,5}};
		assertEquals(2,fma.findMinArrowShots(map));
	}
	
	@Test
	void test05() {
		int[][] map = {{2,8},{2,9},{3,4},{3,5},{4,5},{4,6},{5,6}};
		assertEquals(2,fma.findMinArrowShots(map));
	}
	
	@Test
	void test06() {
		int[][] map = {{2147483646,2147483646},{-2147483646,-2147483646}};
		assertEquals(2,fma.findMinArrowShots(map));
	}

}
