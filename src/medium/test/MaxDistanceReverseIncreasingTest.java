package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxDistanceReverseIncreasing;

class MaxDistanceReverseIncreasingTest {

	private MaxDistanceReverseIncreasing mdr;
	
	@BeforeEach
	public void setup() {
		mdr = new MaxDistanceReverseIncreasing();
	}
	
	@Test
	void test01() {
		int[] a = {55,30,5,4,2};
		int[] b = {100,20,10,10,5};
		assertEquals(2,mdr.maxDistance(a, b));
	}
	
	@Test
	void test02() {
		int[] a = {2,2,2};
		int[] b = {10,10,1};
		assertEquals(1,mdr.maxDistance(a, b));
	}
	
	@Test
	void test03() {
		int[] a = {30,29,19,5};
		int[] b = {25,25,25,25,25};
		assertEquals(2,mdr.maxDistance(a, b));
	}

}
