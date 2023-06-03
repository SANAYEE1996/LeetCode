package medium.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.JumpGame;

class JumpGameTest {
	
	private JumpGame jg;
	
	@BeforeEach
	void setup() {
		jg = new JumpGame();
	}

	@Test
	void test01() {
		int[] nums = {2,3,1,1,4};
		assertEquals(2,jg.jump(nums));
	}
	
	@Test
	void test02() {
		int[] nums = {2,3,0,1,4};
		assertEquals(2,jg.jump(nums));
	}
	
	@Test
	void test03() {
		int[] nums = {0};
		assertEquals(0,jg.jump(nums));
	}
	
	@Test
	void test04() {
		int[] nums = {1};
		assertEquals(0,jg.jump(nums));
	}
	
	@Test
	void test05() {
		int[] nums = {4,1,1,3,1,1,1};
		assertEquals(2,jg.jump(nums));
	}
	
	@Test
	void test06() {
		int[] nums = {2,3,5,1,4,0,0,1,1};
		assertEquals(3,jg.jump(nums));
	}
	
	@Test
	void test08() {
		int[] nums = {7,9,13,4,4,4,6,7,1,12,12,4,3,3,3,2,8,1,5,3,9,2};
		assertEquals(3,jg.jump(nums));
	}
	
	@Test
	void test09() {
		int[] nums = {1,2};
		assertEquals(1,jg.jump(nums));
	}
	
	@Test
	void test10() {
		int[] nums = {1,1,3,1,1};
		assertEquals(3,jg.jump(nums));
	}
	
	@Test
	void test11() {
		int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
		assertEquals(3,jg.jump(nums));
	}

}
