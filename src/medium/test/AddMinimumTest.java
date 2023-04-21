package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.AddMinimum;

class AddMinimumTest {
	
	private AddMinimum am;
	
	@BeforeEach
	public void setup() {
		am = new AddMinimum();
	}

	@Test
	void test01() {
		assertEquals(8,am.addMinimum("aaaa"));
	}
	
	@Test
	void test02() {
		assertEquals(0,am.addMinimum("abc"));
	}
	
	@Test
	void test03() {
		assertEquals(9,am.addMinimum("abbbcaacb"));
	}
	
	@Test
	void test04() {
		assertEquals(2,am.addMinimum("a"));
	}
	
	@Test
	void test05() {
		assertEquals(6,am.addMinimum("abcabcccabababc"));
	}

}
