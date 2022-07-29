package medium.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import medium.GenerateParenthesis;

class GenerateParenthesisTest {
	
	private GenerateParenthesis gp;
	
	@BeforeEach
	public void setup() {
		gp = new GenerateParenthesis();
	}

	@Test
	void test() {
		System.out.println(gp.generateParenthesis(8));
	}

}
