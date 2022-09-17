package medium.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Insert;

class InsertTest {
	
	private Insert insert;
	
	@BeforeEach
	public void setup() {
		insert = new Insert();
	}

	@Test
	void test() {
		/*
		 * [[1,2],[3,5],[6,7],[8,10],[12,16]]
		 * */
		int[][] a = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] b = {4,8};
		int[][] c = {{1,3},{6,9}};
		int[] d = {2,5};
		int[][] e = {};
		int[] f = {5,7};
		int[][] g = {{1,5}};
		int[] h = {2,3};
		System.out.println(insert.insert(a, b));
		System.out.println(insert.insert(c, d));
		System.out.println(insert.insert(e, f));
		System.out.println(insert.insert(g, h));
	}

}
