package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MakeIntegerBeautiful;

class MakeIntegerBeautifulTest {
	
	private MakeIntegerBeautiful m;
	
	@BeforeEach
	public void setup() {
		m = new MakeIntegerBeautiful();
	}
	
	@Test
	void test() {
		assertEquals(4,m.makeIntegerBeautiful(16, 6));
		assertEquals(33,m.makeIntegerBeautiful(467, 6));
		assertEquals(0,m.makeIntegerBeautiful(1, 1));
		assertEquals(65495273,m.makeIntegerBeautiful(734504727, 10));
	}

}
