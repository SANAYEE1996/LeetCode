package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MinExtraChar;

class MinExtraCharTest {
	
	private MinExtraChar me;
	
	@BeforeEach
	void setup() {
		me = new MinExtraChar();
	}

	@Test
	void test01() {
		String[] dictionary = {"leet","code","leetcode"};
		assertEquals(1, me.minExtraChar("leetscode", dictionary));
	}
	
	@Test
	void test02() {
		String[] dictionary = {"hello","world"};
		assertEquals(3, me.minExtraChar("sayhelloworld", dictionary));
	}
	
	@Test
	void test03() {
		String[] dictionary = {"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
		assertEquals(7, me.minExtraChar("dwmodizxvvbosxxw", dictionary));
	}

}
