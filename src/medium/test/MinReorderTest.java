package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinReorder;

class MinReorderTest {
	
	private MinReorder mr;
	
	@BeforeEach
	public void setup() {
		mr = new MinReorder();
	}

	@Test
	void test() {
		System.out.println("test 00");
		int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
		assertEquals(3,mr.minReorder(6, connections));
	}
	
	@Test
	void test01() {
		System.out.println("test 01");
		int[][] connections = {{1,0},{1,2},{3,2},{3,4}};
		assertEquals(2,mr.minReorder(5, connections));
	}

}
