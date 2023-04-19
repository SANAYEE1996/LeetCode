package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindMaxLength;

class FindMaxLengthTest {

	private FindMaxLength fml;
	
	@BeforeEach
	public void setup() {
		fml = new FindMaxLength();
	}
	
	@Test
	void test01() {
		assertEquals(8,fml.findMaxLength(new int[] {0,1,1,1,1,0,0,0,0}));
	}
	
	@Test
	void test02() {
		assertEquals(4,fml.findMaxLength(new int[] {0,1,1,0,1,1,1,0}));
	}
	
	@Test
	void test03() {
		assertEquals(6,fml.findMaxLength(new int[] {0,0,1,0,0,0,1,1}));
	}
	
	@Test
	void test04() {
		assertEquals(12,fml.findMaxLength(new int[] {0,0,0,0,1,1,1,1,0,0,1,1}));
	}
	
	@Test
	void test05() {
		assertEquals(2,fml.findMaxLength(new int[] {0,1,1,1,1,1,0}));
	}

}
