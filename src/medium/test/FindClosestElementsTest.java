package medium.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.FindClosestElements;

class FindClosestElementsTest {
	
	private FindClosestElements s;
	
	@BeforeEach
	public void setup() {
		s = new FindClosestElements();
	}
	
	@Test
	void test() {
		int[] a = {1,2,3,4,5};
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[] {})), s.findClosestElements(a, 4, 3));
		
	}

}
