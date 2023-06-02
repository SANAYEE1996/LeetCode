package medium.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaximumDetonation;

class MaximumDetonationTest {
	
	private MaximumDetonation md;
	
	@BeforeEach
	void setup() {
		md = new MaximumDetonation();
	}

	@Test
	void test01() {
		int[][] bombs = {{2,1,3},{6,1,4}};
		assertEquals(2,md.maximumDetonation(bombs));
	}
	
	@Test
	void test02() {
		int[][] bombs = {{1,1,5},{10,10,5}};
		assertEquals(1,md.maximumDetonation(bombs));
	}
	
	@Test
	void test03() {
		int[][] bombs = {{1,2,3},{2,3,1},{3,4,2},{4,5,3},{5,6,4}};
		assertEquals(5,md.maximumDetonation(bombs));
	}
	
	
	@Test
	void test04() {
		int[][] bombs = {{54,95,4},{99,46,3},{29,21,3},{96,72,8},
						 {49,43,3},{11,20,3},{2,57,1},{69,51,7},
						 {97,1,10},{85,45,2},{38,47,1},{83,75,3},
						 {65,59,3},{33,4,1},{32,10,2},{20,97,8},{35,37,3}};
		assertEquals(1,md.maximumDetonation(bombs));
	}
	
	@Test
	void test05() {
		int[][] bombs = {{951,331,78},{213,123,49},{354,174,40},
						{899,249,70},{563,6,36},{809,795,67},
						{308,745,1},{118,639,87},{379,279,9},
						{783,906,34},{975,656,52},{579,388,16},{993,104,3}};
		assertEquals(1,md.maximumDetonation(bombs));
	}
}
