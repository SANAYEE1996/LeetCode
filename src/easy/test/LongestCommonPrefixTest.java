package easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.LongestCommonPrefix;

class LongestCommonPrefixTest {
	
	private LongestCommonPrefix lcp;
	
	@BeforeEach
	public void setup() {
		lcp = new LongestCommonPrefix();
	}
	
	@Test
	void test() {
		assertEquals("fl",lcp.longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}

}
