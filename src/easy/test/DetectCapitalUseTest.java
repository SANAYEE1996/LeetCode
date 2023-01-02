package easy.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.DetectCapitalUse;

class DetectCapitalUseTest {
	
	private DetectCapitalUse dc;
	
	@BeforeEach
	public void setup() {
		dc = new DetectCapitalUse();
	}
	
	@Test
	void test() {
		assertTrue(dc.detectCapitalUse("USA"));
		assertFalse(dc.detectCapitalUse("FlaG"));
	}

}
