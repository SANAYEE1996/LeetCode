package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.MyAtoi;

class MyAtoiTest {
	
	private MyAtoi ma;
	
	@BeforeEach
	public void setup() {
		ma = new MyAtoi();
	}

	@Test
	void test() {
		System.out.println(ma.myAtoi("+123"));
		System.out.println(ma.myAtoi("   1234"));
		System.out.println(ma.myAtoi("12   4"));
		System.out.println(ma.myAtoi("12345 567 v"));
		System.out.println(ma.myAtoi("-+12"));
		System.out.println(ma.myAtoi("+a12"));
		System.out.println(ma.myAtoi("-23a45 567 v"));
		System.out.println(ma.myAtoi("a+123 bcd 45"));
		System.out.println(ma.myAtoi("-9999999999999"));
		System.out.println(ma.myAtoi("+00999"));
		System.out.println(ma.myAtoi("-00999"));
		System.out.println(ma.myAtoi("0999"));
		System.out.println(ma.myAtoi("20000000000000000000"));
		System.out.println(ma.myAtoi("544"));
	}

}
