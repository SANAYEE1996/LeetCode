package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NextPermutation;

class IntegrationTest {
	
	private NextPermutation np;
	
	@BeforeEach
	public void setup() {
		np = new NextPermutation();
	}
	
	@Test
	void test() {
		np.nextPermutation(new int[] {1,2,3});
	}

}
