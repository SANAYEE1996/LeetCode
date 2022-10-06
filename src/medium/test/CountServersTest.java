package medium.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.CountServers;

class CountServersTest {
	
	private CountServers cs;
	
	@BeforeEach
	public void setup() {
		cs = new CountServers();
	}
	
	@Test
	void test() {
		assertEquals(0, cs.countServers(new int[][] {{1,0},{0,1}}));
	}

}
