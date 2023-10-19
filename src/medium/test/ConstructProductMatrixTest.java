package medium.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		int[][] answer = {{24,12},{8,6}};
		assertArrayEquals(answer, result);
	}
	
	@Test
	void test02() {
		int[][] grid = {{12345},{2},{1}};
		int[][] result = cpm.constructProductMatrix(grid);
		int[][] answer = {{2},{0},{0}};
		assertArrayEquals(answer, result);
	}
	
	@Test
	void test03() {
		int[][] grid = {{4,3,9},{3,9,10},{9,7,8},{8,4,7},{6,1,3}};
		int[][] answer = {{3255,225,75},{225,75,11178},{75,1860,7800},{7800,3255,1860},{6285,675,225}};
		int[][] result = cpm.constructProductMatrix(grid);
		assertArrayEquals(answer, result);
	}
	
	@Test
	void test04() {
		int[][] grid = {{10,20},{18,16},{17,14},{16,9},{14,6},{16,5},{14,8},{20,13},{16,10},{14,17}};
		int[][] result = cpm.constructProductMatrix(grid);
		int[][] answer = {{345,6345},{7050,4845},{4560,2010},{4845,1755},{2010,8805},{4845,690},{2010,9690},{6345,1215},{4845,345},{2010,4560}};
		assertArrayEquals(answer, result);
	}

}
