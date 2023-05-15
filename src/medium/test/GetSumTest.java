package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.GetSum;

class GetSumTest {
	
	private GetSum gs;
	
	@BeforeEach
	public void setup() {
		gs = new GetSum();
	}

	@Test
	void test01() {
		assertEquals(14,gs.getSum(10, 4));
		assertEquals(400,gs.getSum(357, 43));
		assertEquals(2000,gs.getSum(1000, 1000));
	}
	
	@Test
	void test02() {
		assertEquals(953,gs.getSum(-47, 1000));
	}

}
