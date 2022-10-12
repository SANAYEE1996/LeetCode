package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.SumGame;

class SumGameTest {
	
	private SumGame sg;
	
	@BeforeEach
	public void setup() {
		sg = new SumGame();
	}

	@Test
	void test() {
		assertEquals(false,sg.sumGame("?3295???"));
		System.out.println();
		assertEquals(false,sg.sumGame("5023"));
		System.out.println();
		assertEquals(true,sg.sumGame("25??"));
		System.out.println();
		assertEquals(true,sg.sumGame("9?"));
	}

}
