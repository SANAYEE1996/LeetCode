package medium.test;

import org.junit.jupiter.api.Test;

import medium.LRUCache;

class LRUCacheTest {
	
	@Test
	void test01() {
		LRUCache lc = new LRUCache(2);
		lc.put(1, 1);
		lc.put(2, 2);
		System.out.println(lc.get(1));
		lc.put(3, 3);
		System.out.println(lc.get(2));
		lc.put(4, 4);
		System.out.println(lc.get(1));
		System.out.println(lc.get(3));
		System.out.println(lc.get(4));
	}
	
	@Test
	void test02() {
		System.out.println("test case 02");
		LRUCache lc = new LRUCache(3);
		lc.put(1, 1);
		lc.put(2, 2);
		lc.put(3, 3);
		lc.put(4, 4);
		System.out.println(lc.get(4));  //4
		System.out.println(lc.get(3));  //3
		System.out.println(lc.get(2));  //2
		System.out.println(lc.get(1));  //-1
		lc.put(5, 5);
		System.out.println(lc.get(1));  //-1
		System.out.println(lc.get(2));	//2
		System.out.println(lc.get(3));  //3
		System.out.println(lc.get(4));  //-1
		System.out.println(lc.get(5));  //5
	}

}
