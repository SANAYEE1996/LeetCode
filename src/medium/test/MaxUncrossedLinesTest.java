package medium.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxUncrossedLines;

class MaxUncrossedLinesTest {
	
	private MaxUncrossedLines ml;
	
	@BeforeEach
	public void setup() {
		ml = new MaxUncrossedLines();
	}

	@Test
	void test() {
		int[] a = {2,3,4,1,3,3,2,4,2,2,1,5,2,4,3,4,4,5,1,5,1,5,4,3,1,2,5,2,4,4};
		int[] b = {2,2,4,2,4,1,1,5,5,3,2,1,1,1,3,1,2,5,2,4,3,4,5,5,3,3,5,1,4,3};
		System.out.println(ml.maxUncrossedLines(a, b));
	}

}
