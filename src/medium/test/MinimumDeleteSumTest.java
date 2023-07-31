package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinimumDeleteSum;

class MinimumDeleteSumTest {
	
	private MinimumDeleteSum mds;
	
	@BeforeEach
	void setup() {
		mds = new MinimumDeleteSum();
	}

	@Test
	void test01() {
		assertEquals(231, mds.minimumDeleteSum("sea", "eat"));
	}
	
	@Test
	void test02() {
		assertEquals(403, mds.minimumDeleteSum("delete", "leet"));
	}
	
	@Test
	void test03() {
		assertEquals(1613, mds.minimumDeleteSum("vwojt", "saqhgdrarwntji"));
	}

}
