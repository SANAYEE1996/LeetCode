package medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindScore;

class FindScoreTest {
	
	private FindScore fs;
	
	@BeforeEach
	public void setup() {
		fs = new FindScore();
	}
	
	@Test
	void test() {
		int[] nums = {2,1,3,4,5,2};
		assertEquals(7,fs.findScore(nums));
	}
	
	@Test
	void test01() {
		int[] nums = {2,3,5,1,3,2};
		assertEquals(5,fs.findScore(nums));
	}
	
	@Test
	void test02() {
		int[] nums = {730,1721,1993,1532,962,519,1365,1307,1992,1623,1579,1735,1015,1579,1003,1277,1255,1254,810,1767,206,1837,920,1203,1876,521,625,483,572,922,1936,1014,1835,694,19,209,1438,127,1716,1272,444,1739,148,1580,802,1093,1543,452,257,103,877,749,1418,348,1555,1552,818,555,1628,547,553,1742,1062,1199,1987,818,491,1211};
		//assertEquals(7,fs.findScore(nums));
		System.out.println(fs.findScore(nums));
	}

}
