package hard.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.Candy;

class IntegerationTest {
	
	private Candy candy;
	
	@BeforeEach
	public void setup() {
		candy = new Candy();
	}
	
	@Test
	void test() {
		System.out.println(candy.candy(new int[] {1,0,2}));
	}

}
