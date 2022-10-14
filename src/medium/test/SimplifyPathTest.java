package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SimplifyPath;

class SimplifyPathTest {
	
	private SimplifyPath sp;
	
	@BeforeEach
	public void setup() {
		sp = new SimplifyPath();
	}

	@Test
	void test() {
		assertEquals("/home",sp.simplifyPath("/home/"));
	}

}
