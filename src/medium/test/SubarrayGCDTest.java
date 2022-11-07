package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SubarrayGCD;

class SubarrayGCDTest {
	
	private SubarrayGCD sg;
	
	@BeforeEach
	public void setup() {
		sg = new SubarrayGCD();
	}
	
	@Test
	void test() {
		assertEquals(0,sg.subarrayGCD(new int[] {9,3,1,2,6,3}, 3));
		assertEquals(0,sg.subarrayGCD(new int[] {4}, 7));
	}

}
