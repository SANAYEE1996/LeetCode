package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.BulbSwitch;

class BulbSwitchTest {
	
	private BulbSwitch bs;
	
	@BeforeEach
	public void setup() {
		bs = new BulbSwitch();
	}
	
	@Test
	void test01() {
		assertEquals(1,bs.bulbSwitch(1));
	}
	
	@Test
	void test02() {
		assertEquals(2,bs.bulbSwitch(4));
	}
	
	@Test
	void test03() {
		assertEquals(3,bs.bulbSwitch(15));
	}
	
	@Test
	void test04() {
		assertEquals(4,bs.bulbSwitch(23));
	}
	
	@Test
	void test05() {
		assertEquals(5,bs.bulbSwitch(35));
	}
	
	@Test
	void test06() {
		System.out.println(bs.bulbSwitch(1000000000));
	}

}
