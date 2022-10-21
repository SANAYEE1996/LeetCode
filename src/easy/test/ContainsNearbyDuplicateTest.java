package easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.ContainsNearbyDuplicate;

class ContainsNearbyDuplicateTest {

	private ContainsNearbyDuplicate c;
	
	@BeforeEach
	public void setup() {
		c = new ContainsNearbyDuplicate();
	}
	
	@Test
	void test() {
		assertEquals(true,c.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
		assertEquals(true,c.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
		assertEquals(false,c.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
	}

}
