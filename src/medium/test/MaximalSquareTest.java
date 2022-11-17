package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaximalSquare;

class MaximalSquareTest {
	
	private MaximalSquare m;
	
	@BeforeEach
	public void setup() {
		m = new MaximalSquare();
	}
	
	@Test
	void test01() {
		char[][] matrix = { {'1','1','1','1','0'},
				{'1','1','1','1','0'},
				{'1','1','1','1','1'},
				{'1','1','1','1','1'},
				{'0','0','1','1','1'}};
		assertEquals(16,m.maximalSquare(matrix));
	}
	
	@Test
	void test02() {
		char[][] matrix = new char[][]{  {'1','0','1','0'},
										{'1','0','1','1'},
										{'1','0','1','1'},
										{'1','1','1','1'}};
		assertEquals(4,m.maximalSquare(matrix));
	}
	
	@Test
	void test03() {
		char[][] matrix = new char[][] {{'1','0','1','0','0','1','1','1','0'},
										{'1','1','1','0','0','0','0','0','1'},
										{'0','0','1','1','0','0','0','1','1'},
										{'0','1','1','0','0','1','0','0','1'},
										{'1','1','0','1','1','0','0','1','0'},
										{'0','1','1','1','1','1','1','0','1'},
										{'1','0','1','1','1','0','0','1','0'},
										{'1','1','1','0','1','0','0','0','1'},
										{'0','1','1','1','1','0','0','1','0'},
										{'1','0','0','1','1','1','0','0','0'}};
		assertEquals(4,m.maximalSquare(matrix));
	}

}
