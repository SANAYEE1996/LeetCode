package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.GetPermutation;

class GetPermutationTest {
	
	private GetPermutation gp;
	
	@BeforeEach
	public void setup() {
		gp = new GetPermutation();
		
	}

	@Test
	void test() {
		assertEquals("",gp.getPermutation(4, 1));
		assertEquals("",gp.getPermutation(4, 9));
		System.out.println(Arrays.toString(gp.getPermutateArray(4)));
		System.out.println(Arrays.toString(gp.getPermutateArray(8)));
		System.out.println(Arrays.toString(gp.getPermutateArray(9)));
		System.out.println(Arrays.toString(gp.getPermutateArray(10)));
		System.out.println(Arrays.toString(gp.getPermutateArray(11)));
	}

}
