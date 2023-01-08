package hard.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.MaxPoints;

class MaxPointsTest {
	
	private MaxPoints mp;
	
	@BeforeEach
	public void setup() {
		mp = new MaxPoints();
	}
	
	@Test
	void test() {
		int[][] points = {{1,1},{2,2},{3,3}};
		assertEquals(0,mp.maxPoints(points));
	}

}
