package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Compress;

class CompressTest {
	
	private Compress c;
	
	@BeforeEach
	public void setup() {
		c = new Compress();
	}
	
	@Test
	void test01() {
		System.out.println(c.compress(new char[] {'a','a','a','a'}));
		assertEquals(2,c.compress(new char[]{'a','a','a','a'}));
	}

}
