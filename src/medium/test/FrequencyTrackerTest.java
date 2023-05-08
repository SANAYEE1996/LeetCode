package medium.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FrequencyTracker;

class FrequencyTrackerTest {
	
	private FrequencyTracker ft;
	
	@BeforeEach
	public void setup() {
		ft = new FrequencyTracker();
	}

	@Test
	void test01() {
		ft.add(3);
		ft.add(3);
		assertTrue(ft.hasFrequency(2));
	}
	
	@Test
	void test02() {
		ft.add(1);
		ft.deleteOne(1);
		assertFalse(ft.hasFrequency(1));
	}
	
	@Test
	void test03() {
		assertFalse(ft.hasFrequency(2));
		ft.add(3);
		assertTrue(ft.hasFrequency(1));
	}

}
