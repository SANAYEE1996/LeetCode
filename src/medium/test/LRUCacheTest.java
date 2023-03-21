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

}
