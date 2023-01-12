package medium.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.IsNStraightHand;

class IsNStraightHandTest {
	
	private IsNStraightHand ish;
	
	@BeforeEach
	public void setup() {
		ish = new IsNStraightHand();
	}

	@Test
	void test() {
		assertFalse(ish.isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));
	}

}
