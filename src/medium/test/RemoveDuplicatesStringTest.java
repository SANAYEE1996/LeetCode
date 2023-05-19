package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.RemoveDuplicatesString;

class RemoveDuplicatesStringTest {
	
	private RemoveDuplicatesString rds;
	
	@BeforeEach
	public void setup() {
		rds = new RemoveDuplicatesString();
	}

	@Test
	void test01() {
		assertEquals("abcd", rds.removeDuplicates("abcd", 2));
	}
	
	@Test
	void test02() {
		assertEquals("aa", rds.removeDuplicates("deeedbbcccbdaa", 3));
	}
	
	@Test
	void test03() {
		assertEquals("ps", rds.removeDuplicates("pbbcggttciiippooaais", 2));
	}

}
