package easy.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.MaxScore;

class MaxScoreTest {
	
	private MaxScore ms;
	
	@BeforeEach
	void init() {
		ms = new MaxScore();
	}

	@Test
	void test01() {
		assertEquals(ms.maxScore("011101"), 5);
	}
	
	@Test
	void test02() {
		assertEquals(ms.maxScore("00111"), 5);
	}
	
	@Test
	void test03() {
		assertEquals(ms.maxScore("1111"), 3);
	}

}
