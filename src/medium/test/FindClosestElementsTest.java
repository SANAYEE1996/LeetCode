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
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2,3,4})), s.findClosestElements(a, 4, 3));
		assertEquals(new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2,3,4})), s.findClosestElements(a, 4, -1));
		System.out.println(s.findClosestElements(new int[] {1,1,1,10,10,10},1,9));
		System.out.println(s.findClosestElements(new int[] {1},1,-100));
		System.out.println(s.findClosestElements(new int[] {1,2,3,4,5},4,3));
	}

}
