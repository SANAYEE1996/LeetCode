package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinimumRounds;

class MinimumRoundsTest {
	
	private MinimumRounds mr;
	
	@BeforeEach
	public void setup() {
		mr = new MinimumRounds();
	}
	
	@Test
	void testCase01() {
		assertEquals(4,mr.minimumRounds(new int[] {2,2,3,3,2,4,4,4,4,4}));
	}
	
	@Test
	void testCase02() {
		assertEquals(-1,mr.minimumRounds(new int[] {2,3,3}));
	}
	
	@Test
	void testCase03() {
		assertEquals(0,mr.minimumRounds(new int[] {}));
	}

}
