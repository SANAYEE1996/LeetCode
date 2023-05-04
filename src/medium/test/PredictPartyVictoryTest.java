package medium.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.PredictPartyVictory;

class PredictPartyVictoryTest {
	
	private PredictPartyVictory ppv;
	
	@BeforeEach
	public void setup() {
		ppv = new PredictPartyVictory();
	}

	@Test
	void test01() {
		assertEquals("Radiant",ppv.predictPartyVictory("RD"));
	}
	
	@Test
	void test02() {
		assertEquals("Dire",ppv.predictPartyVictory("RDD"));
	}
	
	@Test
	void test03() {
		assertEquals("Dire",ppv.predictPartyVictory("RDDRDRDDDDDRRRRDDRDDRRDRDDDR"));
	}
	
	@Test
	void test04() {
		assertEquals("Dire",ppv.predictPartyVictory("DDRRR"));
	}
	
	@Test
	void test05() {
		assertEquals("Radiant",ppv.predictPartyVictory("DRRDRDRDRDDRDRDR"));
	}

}
