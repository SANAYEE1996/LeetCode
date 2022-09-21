package medium.test;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SumEvenAfterQueries;

class SumEvenAfterQueriesTest {
	
	private SumEvenAfterQueries seaq;
	
	@BeforeEach
	public void setup() {
		seaq = new SumEvenAfterQueries();
	}

	@Test
	void test() {
		int[] a = {3,2};
		int[][] b = {{4,0},{3,0}};
		System.out.println(Arrays.toString(seaq.sumEvenAfterQueries(a, b)));
	}

}
