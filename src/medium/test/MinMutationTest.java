package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinMutation;

class MinMutationTest {
	
	private MinMutation m;
	
	@BeforeEach
	public void setup() {
		m = new MinMutation();
	}
	
	@Test
	void test() {
		assertEquals(1,m.minMutation("AACCGGTT", "AACCGGTA", new String[] {"AACCGGTA"}));
		assertEquals(2,m.minMutation("AACCGGTT", "AAACGGTA", new String[] {"AACCGGTA","AACCGCTA","AAACGGTA"}));
		assertEquals(3,m.minMutation("AAAAACCC", "AACCCCCC", new String[] {"AAAACCCC","AAACCCCC","AACCCCCC"}));
	}
	
	@Test
	void infinityTest() {
		assertEquals(-1,m.minMutation("AA", "AZ", new String[] {"AB","AC","AD","AE","AF","AH","AY","AK"}));
	}
	
	@Test
	void notMatchAnytingTest() {
		assertEquals(-1,m.minMutation("A", "Z", new String[] {"B","C","D","E","F","H","Y","K"}));
	}
	
	@Test
	void ntooManyAnswerExistTest() {
		assertEquals(1,m.minMutation("AB", "AZ", new String[] {"AC","DC","DE","AE","AH","ZH","ZZ","AZ"}));
	}

}
