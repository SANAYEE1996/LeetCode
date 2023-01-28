package easy.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.IsSubsequence;

class IsSubsequenceTest {
	
	private IsSubsequence s;
	
	@BeforeEach
	public void setup() {
		s = new IsSubsequence();
	}
	
	@Test
	void test() {
		assertFalse(s.isSubsequence("axc", "ahbgdc"));
	}
	
	@Test
	void test02() {
		assertTrue(s.isSubsequence("abc", "ahbgdc"));
	}

}
