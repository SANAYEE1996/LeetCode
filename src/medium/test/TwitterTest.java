package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.Twitter;

class TwitterTest {

	private Twitter t;
	
	@BeforeEach
	public void setup() {
		t = new Twitter();
	}
	
	
	@Test
	void test() {
		t.postTweet(1, 5);
		System.out.println(t.getNewsFeed(1));
		t.follow(1, 2);
		t.postTweet(2, 6);
		System.out.println(t.getNewsFeed(1));
	}
	
	@Test
	void test01() {
		t.postTweet(1, 4);
		t.postTweet(2, 5);
		t.unfollow(1, 2);
		System.out.println(t.getNewsFeed(1));
	}

}
