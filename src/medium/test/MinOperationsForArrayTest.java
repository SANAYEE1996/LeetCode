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
	void minCountTest() {
		assertEquals(1, mofa.getMinCount(2));
		assertEquals(1, mofa.getMinCount(3));
		assertEquals(2, mofa.getMinCount(4));
		assertEquals(2, mofa.getMinCount(5));
		assertEquals(2, mofa.getMinCount(6));
		assertEquals(3, mofa.getMinCount(7));
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
