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
		assertEquals(3,mp.maxPoints(points));
	}
	
	@Test
	void test02() {
		int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
		assertEquals(4,mp.maxPoints(points));
	}
	
	@Test
	void test03() {
		int[][] points = {{1,1},{0,0},{1,-1}};
		assertEquals(2,mp.maxPoints(points));
	}

}
