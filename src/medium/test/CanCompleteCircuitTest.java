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
		int[] gas = new int[5];
		int[] cost = new int[5];
		assertEquals(0,ccc.canCompleteCircuit(gas, cost));
	}

}
