package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.PartitionString;

class PartitionStringTest {
	
	private PartitionString ps;
	
	@BeforeEach
	public void setup() {
		ps = new PartitionString();
	}

	@Test
	void test01() {
		assertEquals(4,ps.partitionString("abacaba"));
	}
	
	@Test
	void test02() {
		assertEquals(6,ps.partitionString("ssssss"));
	}

}
