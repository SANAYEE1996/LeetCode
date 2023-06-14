package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.MaximalRectangle;

class MaximalRectangleTest {
	
	private MaximalRectangle mr;
	
	@BeforeEach
	void setup() {
		mr = new MaximalRectangle();
	}

	@Test
	void test01() {
		char[][] matrix = { {'1','0','1','0','0'},
							{'0','1','0','1','1'},
							{'1','1','1','1','1'},
							{'1','0','0','1','0'}};
		assertEquals(4,mr.maximalRectangle(matrix));
	}
	
	@Test
	void test02() {
		char[][] matrix = { {'1','0','1','0','1','1'},
							{'1','1','1','1','1','0'},
							{'1','1','0','1','1','1'},
							{'1','0','1','1','1','1'},
							{'1','1','1','0','1','0'}};
		assertEquals(6,mr.maximalRectangle(matrix));
	}
	
	@Test
	void test03() {
		char[][] matrix = { {'0','0','1','0'},
							{'0','0','1','0'},
							{'0','0','1','0'},
							{'0','0','1','1'},
							{'0','1','1','1'},
							{'0','1','1','1'},
							{'1','1','1','1'}};
		assertEquals(9,mr.maximalRectangle(matrix));
	}

}
