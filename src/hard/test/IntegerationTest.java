package hard.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hard.Candy;
import hard.LadderLength;

class IntegerationTest {
	
	private Candy candy;
	private LadderLength ladderLength;
	
	@BeforeEach
	public void setup() {
		candy = new Candy();
		ladderLength = new LadderLength();
	}
	
	@Test
	void test() {
		List<String> inputList = new ArrayList<>(Arrays.asList(new String[] {"hot","dot","dog","lot","log","cog"}));
		List<String> inputList2 = new ArrayList<>(Arrays.asList(new String[] {"hot","dot","dog","lot","log"}));
		System.out.println(candy.candy(new int[] {1,0,2}));
		System.out.println(ladderLength.ladderLength("hit", "cog", inputList));
		System.out.println(ladderLength.ladderLength("hit", "cog", inputList2));
	}

}
