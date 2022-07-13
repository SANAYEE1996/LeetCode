package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.Trap;

class TrapTest {
	
	private Trap t;
	
	@BeforeEach
	public void setup() {
		t = new Trap();
	}
	
	
	@Test
	void test() {
		assertEquals(0,t.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
