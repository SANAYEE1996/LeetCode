package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NumRabbits;

class NumRabbitsTest {
	
	private NumRabbits nr;
	
	@BeforeEach
	public void setup() {
		nr=  new NumRabbits();
	}
	
	@Test
	void test01() {
		assertEquals(5,nr.numRabbits(new int[] {1,1,2}));
	}
	
	@Test
	void test02() {
		assertEquals(11,nr.numRabbits(new int[] {10,10,10}));
	}
	
	@Test
	void test03() {
		assertEquals(43,nr.numRabbits(new int[] {1,4,7,12,12,14}));
	}
	
	@Test
	void test04() {
		assertEquals(5,nr.numRabbits(new int[] {0,1,0,1,0}));
	}
			
	@Test
	void test05() {
		assertEquals(6,nr.numRabbits(new int[] {0,0,1,1,1}));
	}

}
