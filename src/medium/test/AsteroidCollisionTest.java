package medium.test;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.AsteroidCollision;

class AsteroidCollisionTest {
	
	private AsteroidCollision ac;
	
	@BeforeEach
	void setup() {
		ac = new AsteroidCollision();
	}
	

	@Test
	void test01() {
		int[] asteroids = {5,10,-5};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}
	
	@Test
	void test02() {
		int[] asteroids = {8,-8};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}
	
	@Test
	void test03() {
		int[] asteroids = {10,2,-5};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}
	
	@Test
	void test04() {
		int[] asteroids = {-1,-2,-4,5,8,13,-19,4,47,-40,5,98,1,13,7,8,-4,-5,-8,-17,4,-5,4,-5};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}
	
	@Test
	void test05() {
		int[] asteroids = {1,2,3,4,5,6,7,8,9,-10};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}
	
	@Test
	void test06() {
		int[] asteroids = {-1,-2,-4,5,8,13,-19};
		System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
	}

}
