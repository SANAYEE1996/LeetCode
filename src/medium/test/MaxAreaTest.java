package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxArea;

class MaxAreaTest {
	
	private MaxArea area;
	
	@BeforeEach
	public void setup() {
		area = new MaxArea();
	}
	
	@Test
	void testCase01() {
		assertEquals(49, area.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}

}
