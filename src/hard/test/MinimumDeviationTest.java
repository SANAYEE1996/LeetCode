package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.MinimumDeviation;

class MinimumDeviationTest {
	
	private MinimumDeviation m;
	
	@BeforeEach
	public void setup() {
		m = new MinimumDeviation();
	}

	@Test
	void test01() {
		assertEquals(1,m.minimumDeviation(new int[] {1,2,3,4}));
	}
	
	@Test
	void test02() {
		assertEquals(3,m.minimumDeviation(new int[] {4,1,5,20,3}));
	}
	
	@Test
	void test03() {
		assertEquals(3,m.minimumDeviation(new int[] {2,10,8}));
	}

}
