package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinOperationsForArray;

class MinOperationsForArrayTest {
	
	private MinOperationsForArray mofa;
	
	@BeforeEach
	void init() {
		mofa = new MinOperationsForArray();
	}
	
	@Test
	void test01() {
		assertEquals(4, mofa.minOperations(new int[] {2,3,3,2,2,4,2,3,4}));
	}
	
	@Test
	void test02() {
		assertEquals(-1, mofa.minOperations(new int[] {2,1,2,2,3,3}));
	}

}
