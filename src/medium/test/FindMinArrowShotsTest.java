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
		assertEquals(0,fma.findMinArrowShots(map));
	}

}
