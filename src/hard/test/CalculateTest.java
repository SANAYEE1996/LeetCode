package hard.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.Calculate;

class CalculateTest {
	
	private Calculate cc;
	
	@BeforeEach
	void setup() {
		cc = new Calculate();
	}

	@Test
	void test01() {
		assertEquals(8, cc.calculate("5+3"));
	}
	
	@Test
	void test02() {
		assertEquals(2, cc.calculate("1 + 1"));
	}
	
	@Test
	void test03() {
		assertEquals(3, cc.calculate(" 2-1 + 2 "));
	}
	
	@Test
	void test04() {
		assertEquals(23, cc.calculate("(1+(4+5+2)-3)+(6+8)"));
	}
	
	@Test
	void test05() {
		assertEquals(-138, cc.calculate("1-(4+7-(3-9)+4+100)-(13-(1+(2-3))+5)"));
	}
	
	@Test
	void test06() {
		assertEquals(8, cc.calculate("5+3"));
	}

}
