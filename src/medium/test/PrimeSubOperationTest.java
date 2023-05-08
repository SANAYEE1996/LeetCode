package medium.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.PrimeSubOperation;

class PrimeSubOperationTest {
	
	private PrimeSubOperation pso;
	
	@BeforeEach
	public void setup() {
		pso = new PrimeSubOperation();
	}

	@Test
	void test01() {
		assertTrue(pso.primeSubOperation(new int[] {4, 9, 6, 10}));
	}
	
	@Test
	void test02() {
		assertFalse(pso.primeSubOperation(new int[] {13, 21, 12, 7, 3, 1}));
	}
	
	@Test
	void test03() {
		assertTrue(pso.primeSubOperation(new int[] {15,20,17,7,16}));
	}
	
	@Test
	void test04() {
		assertFalse(pso.primeSubOperation(new int[] {2,2}));
	}
}
