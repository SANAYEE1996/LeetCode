package easy.test;

import org.junit.jupiter.api.Test;

import easy.KthLargest;

class KthLargestTest {
	
	private KthLargest kl;
	

	@Test
	void test() {
		int[] nums = {2,4,8,7};
		kl = new KthLargest(3, nums);
		System.out.println(kl.add(3));
		System.out.println(kl.add(5));
		System.out.println(kl.add(5));
		System.out.println(kl.add(10));
		System.out.println(kl.add(0));
		System.out.println(kl.add(50));
		System.out.println(kl.add(5));
		System.out.println(kl.add(6));
	}

}
