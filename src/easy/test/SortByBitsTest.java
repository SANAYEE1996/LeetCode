package easy.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.SortByBits;

class SortByBitsTest {
	
	private SortByBits sbbt;
	
	@BeforeEach
	void init() {
		sbbt = new SortByBits();
	}

	@Test
	void test01() {
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int[] respected = {0,1,2,4,8,3,5,6,7};
		assertArrayEquals(respected, sbbt.sortByBits(arr));
	}
	
	@Test
	void test02() {
		int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
		int[] respected = {1,2,4,8,16,32,64,128,256,512,1024};
		assertArrayEquals(respected, sbbt.sortByBits(arr));
	}

}
