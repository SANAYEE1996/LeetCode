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
		np.nextPermutation(new int[] {3,9,8,7,5});
		np.nextPermutation(new int[] {3,9,7,8,5});
		np.nextPermutation(new int[] {1,1,5});
		np.nextPermutation(new int[] {1});
		np.nextPermutation(new int[] {1,1});
		np.nextPermutation(new int[] {5,4,3,2,1});
	}

}
