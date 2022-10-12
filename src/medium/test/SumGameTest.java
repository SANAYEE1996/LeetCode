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
		assertEquals(false,sg.sumGame(""));
	}

}
