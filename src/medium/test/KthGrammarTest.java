package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.KthGrammar;

class KthGrammarTest {
	
	private KthGrammar kg;
	
	@BeforeEach
	void init() {
		kg = new KthGrammar();
	}

	@Test
	void test() {
		assertEquals(0, kg.kthGrammar(1, 1));
	}
	
	@Test
	void test02() {
		assertEquals(0, kg.kthGrammar(2, 1));
	}
	
	@Test
	void test03() {
		assertEquals(1, kg.kthGrammar(2, 2));
	}

}
