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
		assertEquals(2,c.compress(new char[]{'a','a','a','a'}));
	}
	
	@Test
	void test02() {
		assertEquals(6,c.compress(new char[]{'a','a','b','b','c','c','c'}));
	}
	
	@Test
	void test03() {
		assertEquals(1,c.compress(new char[]{'a'}));
	}
	
	@Test
	void test04() {
		assertEquals(4,c.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
	}

}
