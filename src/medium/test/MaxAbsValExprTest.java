package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxAbsValExpr;

class MaxAbsValExprTest {
	
	private MaxAbsValExpr mav;
	
	@BeforeEach
	void setup() {
		mav = new MaxAbsValExpr();
	}

	@Test
	void test01() {
		int[] a = {1,2,3,4};
		int[] b = {-1,4,5,6};
		assertEquals(13, mav.maxAbsValExpr(a, b));
	}
	
	@Test
	void test02() {
		int[] a = {1,-2,-5,0,10};
		int[] b = {0,-2,-1,-7,-4};
		assertEquals(20, mav.maxAbsValExpr(a, b));
	}

}
