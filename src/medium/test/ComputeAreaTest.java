package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ComputeArea;

class ComputeAreaTest {
	
	private ComputeArea c;
	
	@BeforeEach
	public void setup() {
		c = new ComputeArea();
	}
	
	@Test
	void test() {
		assertEquals(45,c.computeArea(-3,0,3,4,0,-1,9,2));
	}
	
	@Test
	void test02() {
		assertEquals(16,c.computeArea(-2,-2,2,2,-1,-1,1,1));
	}
	
	@Test
	void test03() {
		assertEquals(24,c.computeArea(-2,-2,2,2,-3,-3,3,-1));
	}

}
