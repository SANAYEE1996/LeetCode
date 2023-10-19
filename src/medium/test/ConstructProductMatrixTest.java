package medium.test;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.ConstructProductMatrix;

class ConstructProductMatrixTest {
	
	private ConstructProductMatrix cpm;
	
	@BeforeEach
	void init() {
		cpm = new ConstructProductMatrix();
	}

	@Test
	void test01() {
		int[][] grid = {{1,2},{3,4}};
		int[][] result = cpm.constructProductMatrix(grid);
		for(int[] i : result) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	@Test
	void test02() {
		int[][] grid = {{12345},{2},{1}};
		int[][] result = cpm.constructProductMatrix(grid);
		for(int[] i : result) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	@Test
	void test03() {
		int[][] grid = {{4,3,9},{3,9,10},{9,7,8},{8,4,7},{6,1,3}};
		int[][] result = cpm.constructProductMatrix(grid);
		for(int[] i : result) {
			System.out.println(Arrays.toString(i));
		}
	}

}
