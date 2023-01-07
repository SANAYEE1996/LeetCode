package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.CanCompleteCircuit;

class CanCompleteCircuitTest {
	
	private CanCompleteCircuit ccc;
	
	@BeforeEach
	public void setup() {
		ccc = new CanCompleteCircuit();
	}
	
	@Test
	void test() {
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		assertEquals(3,ccc.canCompleteCircuit(gas, cost));
	}
	
	@Test
	void test02() {
		int[] gas = {2,3,4};
		int[] cost = {3,4,3};
		assertEquals(-1,ccc.canCompleteCircuit(gas, cost));
	}
	
	@Test
	void test03() {
		int[] gas = {2,3,4,1};
		int[] cost = {3,4,3,5};
		assertEquals(-1,ccc.canCompleteCircuit(gas, cost));
	}

}
