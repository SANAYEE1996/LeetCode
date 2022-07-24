package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.PrintSolution;

class PrintSolutionTest {

	private PrintSolution ps;
	
	@BeforeEach
	public void setup() {
		ps = new PrintSolution();
	}
	
	@Test
	void test() {
		int[][] a = {{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}};
		int[][] b = {{1, 0, 3}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}};
		int[][] c = {{1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}};
		
		System.out.println(ps.print(a));
		System.out.println(ps.print(b));
		System.out.println(ps.print(c));
	}

}
