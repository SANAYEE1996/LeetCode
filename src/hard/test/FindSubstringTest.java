package hard.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.FindSubstring;

class FindSubstringTest {
	
	private FindSubstring fs;
	
	@BeforeEach
	public void setup() {
		fs = new FindSubstring();
	}
	
	
	
	
	
	@Test
	void test() {
		System.out.println(fs.findSubstring("foobar", new String[] {"foo","bar"}));
		System.out.println(fs.findSubstring("barfoothefoobarman", new String[] {"foo","bar"}));
		System.out.println(fs.findSubstring("wordgoodgoodgoodbestword", new String[] {"word","good","best","word"}));
		System.out.println(fs.findSubstring("barfoofoobarthefoobarman", new String[] {"bar","foo","the"}));
		System.out.println(fs.findSubstring("", new String[] {""}));
		System.out.println(fs.findSubstring("wordgoodgoodgoodbestword", new String[] {"word","good","best","good"}));
		System.out.println(fs.findSubstring("ababaab", new String[] {"ab","ba","ba"}));
	}

}
