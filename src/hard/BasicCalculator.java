package hard;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicCalculator {
	
	public int calculate(String s) {
		s = s.replaceAll(" ", "");
		String[] strCalArray = s.split("\\)|\\(");
		System.out.println("input : " +s);
		System.out.println(Arrays.toString(strCalArray));
		return 0;
    }
	
}
