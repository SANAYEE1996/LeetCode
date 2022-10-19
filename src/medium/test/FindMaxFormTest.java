package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindMaxForm;

class FindMaxFormTest {
	
	private FindMaxForm f;
	
	@BeforeEach
	public void setup() {
		f = new FindMaxForm();
	}
	
	
	@Test
	void test01() {
		assertEquals(0, f.findMaxForm(new String[] {"10","0001","111001","1","0"}, 5, 3));
	}
	
	@Test
	void test02() {
		assertEquals(0, f.findMaxForm(new String[] {"10","0","1"}, 1, 1));
	}
	
	@Test
	void test03() {
		assertEquals(0, f.findMaxForm(new String[] {"10","0001","111001","1","0"}, 5, 3));
	}
	
	@Test
	void test04() {
		assertEquals(0, f.findMaxForm(new String[] {"10","0001","111001","1","0"}, 5, 3));
	}
	
	@Test
	void test05() {
		assertEquals(0, f.findMaxForm(new String[] {"10","0001","111001","1","0"}, 5, 3));
	}

}
