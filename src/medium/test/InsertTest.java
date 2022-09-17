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
		System.out.println(insert.insert(a, b));
	}

}
