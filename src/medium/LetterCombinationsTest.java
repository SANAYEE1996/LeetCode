package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterCombinationsTest {
	
	private LetterCombinations lc;
	
	@BeforeEach
	public void setup() {
		lc = new LetterCombinations();
	}
	
	@Test
	void test() {
		System.out.println(lc.letterCombinations("2345"));
	}

}
