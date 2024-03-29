package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.NearestExit;

class NearestExitTest {
	
	private NearestExit ne;
	
	@BeforeEach
	public void setup() {
		ne = new NearestExit();
	}
	
	@Test
	void test() {
		char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
		assertEquals(2,ne.nearestExit(maze, new int[] {1,0}));
	}
	
	@Test
	void testNoWay() {
		char[][] maze =  {{'.','+'}};
		assertEquals(-1,ne.nearestExit(maze, new int[] {0,0}));
	}
	
	@Test
	void testRight() {
		char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
		assertEquals(1,ne.nearestExit(maze, new int[] {1,2}));
	}
	
	@Test
	void testPlease() {
		char[][] maze = {{'.','+','+','+','+'},{'.','+','.','.','.'},{'.','+','.','+','.'},{'.','.','.','+','.'},{'+','+','+','+','.'}};
		assertEquals(1,ne.nearestExit(maze, new int[] {0,0}));
	}
	
	@Test
	void testPlease01() {
		char[][] maze = {{'+','.','+','+','+','+','+'},
						 {'+','.','+','.','.','.','+'},
						 {'+','.','+','.','+','.','+'},
						 {'+','.','.','.','+','.','+'},
						 {'+','+','+','+','+','+','.'}};
		assertEquals(-1,ne.nearestExit(maze, new int[] {0,1}));
	}

}
