package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.DecodeString;

class DecodeStringTest {
	
	private DecodeString ds;
	
	@BeforeEach
	public void setup() {
		ds = new DecodeString();
	}

	@Test
	void test() {
		System.out.println(ds.decodeString("3[a]2[bc]"));
	}
	
	@Test
	void test01() {
		System.out.println(ds.decodeString("3[a2[c]]"));
	}

}
