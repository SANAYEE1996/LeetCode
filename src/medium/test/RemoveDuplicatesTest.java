package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.RemoveDuplicates;

class RemoveDuplicatesTest {
	
	private RemoveDuplicates rd;
	
	@BeforeEach
	public void setup() {
		rd = new RemoveDuplicates();
	}
	
	@Test
	void testOneCase() {
		assertEquals(5,rd.removeDuplicates(new int[] {1,1,1,2,2,3}));
	}
	
	@Test
	void testTwoCase() {
		assertEquals(7,rd.removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
	}

}
