package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MaxUniqueSplit;

class MaxUniqueSplitTest {
	
	private MaxUniqueSplit mus;
	
	@BeforeEach
	void init() {
		mus = new MaxUniqueSplit();
	}

	@Test
	void test() {
		assertEquals(5, mus.maxUniqueSplit("ababccc"));
	}

}
