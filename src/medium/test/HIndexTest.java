package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.HIndex;

class HIndexTest {
	
	private HIndex h;
	
	@BeforeEach
	public void setup() {
		h = new HIndex();
	}

	@Test
	void test01() {
		assertEquals(3,h.hIndex(new int[] {3,0,6,1,5}));
	}
	
	@Test
	void test02() {
		assertEquals(1,h.hIndex(new int[] {1,3,1}));
	}
	
	@Test
	void test03() {
		assertEquals(1,h.hIndex(new int[] {100}));
	}

}
