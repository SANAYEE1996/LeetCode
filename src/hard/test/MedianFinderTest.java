package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.MedianFinder;

class MedianFinderTest {
	
	private MedianFinder m;
	
	@BeforeEach
	public void setup() {
		m = new MedianFinder();
	}

	@Test
	void testGetIndex() {
		m.addNum(3);
		assertEquals(3, m.findMedian());
		m.addNum(4);
		m.addNum(5);
		assertEquals(4, m.findMedian());
		m.addNum(6);
		assertEquals(4.5, m.findMedian());
	}
	
	@Test
	void testGetIndex02() {
		m.addNum(5);
		m.addNum(3);
		m.addNum(4);
		m.addNum(5);
		m.addNum(6);
		assertEquals(5, m.findMedian());
		m.addNum(3);
		m.addNum(13);
		m.addNum(100);
		m.addNum(1);
		assertEquals(5, m.findMedian());
	}
	
	@Test
	void findMedianTest() {
		m.addNum(1);
		m.addNum(2);
		assertEquals(1.5, m.findMedian());
		m.addNum(3);
		assertEquals(2, m.findMedian());
	}
	
	@Test
	void findMedianTest02() {
		m.addNum(6);
		m.addNum(10);
		m.addNum(2);
		m.addNum(6);
		m.addNum(5);
		m.addNum(0);
		m.addNum(6);
		m.addNum(3);
		assertEquals(5.5, m.findMedian());
		m.addNum(1);
		m.addNum(0);
		m.addNum(0);
		assertEquals(3, m.findMedian());
	}
}
