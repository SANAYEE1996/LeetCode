package easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.MinDeletionSize;

class MinDeletionSizeTest {
	
	private MinDeletionSize md;
	
	@BeforeEach
	public void setup() {
		md = new MinDeletionSize();
	}
	
	@Test
	void test() {
		assertEquals(0,md.minDeletionSize(new String[] {}));
	}

}
