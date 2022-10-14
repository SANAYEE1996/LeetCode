package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SimplifyPath;

class SimplifyPathTest {
	
	private SimplifyPath sp;
	
	@BeforeEach
	public void setup() {
		sp = new SimplifyPath();
	}

	@Test
	void test01() {
		assertEquals("/home",sp.simplifyPath("/home/"));
	}
	
	@Test
	void test02() {
		assertEquals("/c",sp.simplifyPath("/a/./b/../../c/"));
	}
	
	@Test
	void test03() {
		assertEquals("/c",sp.simplifyPath("/a/../../b/../c//.//"));
	}
	
	@Test
	void test04() {
		assertEquals("/a/b/c",sp.simplifyPath("/a//b////c/d//././/.."));
	}

}
