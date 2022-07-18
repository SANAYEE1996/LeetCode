package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals("123",gp.getPermutation(3, 1));
		assertEquals("132",gp.getPermutation(3, 2));
		assertEquals("213",gp.getPermutation(3, 3));
		assertEquals("231",gp.getPermutation(3, 4));
		assertEquals("312",gp.getPermutation(3, 5));
		assertEquals("321",gp.getPermutation(3, 6));
		assertEquals("1234",gp.getPermutation(4, 1));
		assertEquals("1243",gp.getPermutation(4, 2));
		assertEquals("1324",gp.getPermutation(4, 3));
		assertEquals("1342",gp.getPermutation(4, 4));
		assertEquals("1423",gp.getPermutation(4, 5));
		assertEquals("1432",gp.getPermutation(4, 6));
	}

}
