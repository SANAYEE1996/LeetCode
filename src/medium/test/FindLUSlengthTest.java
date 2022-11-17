package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindLUSlength;

class FindLUSlengthTest {
	
	private FindLUSlength f;
	
	@BeforeEach
	public void setup() {
		f = new FindLUSlength();
	}
	
	@Test
	void test() {
		assertEquals(3,f.findLUSlength(new String[] {"aba","cdc","eae"}));
		assertEquals(-1,f.findLUSlength(new String[] {"aaa","aaa","a"}));
		assertEquals(2,f.findLUSlength(new String[] {"aabbcc", "aabbcc","cb"}));
	}

}
