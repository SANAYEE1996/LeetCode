package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ThreeSum;

class ThreeSumTest {
	
	private ThreeSum ts;
	
	@BeforeEach
	public void setup() {
		ts = new ThreeSum();
	}

	@Test
	void test() {
		System.out.println(ts.threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(ts.threeSum(new int[] {0,1,1}));
		System.out.println(ts.threeSum(new int[] {3,0,-2,-1,1,2}));
		System.out.println(ts.threeSum(new int[] {0,0,0}));
		System.out.println(ts.threeSum(new int[] {1,1,-2}));
		System.out.println(ts.threeSum(new int[] {3,1,-2,0}));
		System.out.println(ts.threeSum(new int[] {3,0,-2,-1,1,2}));
	}
	
}
