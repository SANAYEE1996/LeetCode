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
		System.out.println(Arrays.toString(gp.getPermutateArray(3)));
		assertEquals("",gp.getPermutation(3, 1));
		assertEquals("",gp.getPermutation(3, 2));
		assertEquals("",gp.getPermutation(3, 3));
		assertEquals("",gp.getPermutation(3, 4));
		assertEquals("",gp.getPermutation(3, 5));
		assertEquals("",gp.getPermutation(3, 6));
		assertEquals("",gp.getPermutation(4, 1));
		assertEquals("",gp.getPermutation(4, 2));
		assertEquals("",gp.getPermutation(4, 3));
		assertEquals("",gp.getPermutation(4, 4));
		assertEquals("",gp.getPermutation(4, 5));
		assertEquals("",gp.getPermutation(4, 6));
		assertEquals("",gp.getPermutation(4, 9));
		assertEquals("",gp.getPermutation(4, 13));
		assertEquals("",gp.getPermutation(4, 14));
		assertEquals("",gp.getPermutation(4, 24));
	}

}
