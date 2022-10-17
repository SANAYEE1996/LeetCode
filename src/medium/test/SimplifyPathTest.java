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
	
	@Test
	void test05() {
		assertEquals("/...",sp.simplifyPath("/..."));
	}
	
	@Test
	void test06() {
		assertEquals("/..abdad",sp.simplifyPath("/..abdad"));
	}
	
	@Test
	void test07() {
		assertEquals("/",sp.simplifyPath("/."));
	}
	
	@Test
	void test08() {
		assertEquals("/...",sp.simplifyPath("/.../"));
	}
	
	@Test
	void test09() {
		assertEquals("/",sp.simplifyPath("/../"));
	}
	
	@Test
	void test10() {
		assertEquals("/a",sp.simplifyPath("/a"));
	}

}
