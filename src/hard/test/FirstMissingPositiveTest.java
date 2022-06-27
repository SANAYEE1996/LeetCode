package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.FirstMissingPositive;

class FirstMissingPositiveTest {
	
	private FirstMissingPositive f;
	
	@BeforeEach
	public void setup() {
		f = new FirstMissingPositive();
	}
	
	@Test
	void test() {
		
		assertEquals(1, f.firstMissingPositive(new int[] {7,8,9,11,12}));
		assertEquals(3, f.firstMissingPositive(new int[] {1,2,0}));
		assertEquals(2, f.firstMissingPositive(new int[] {3,4,-1,1}));
	}

}
