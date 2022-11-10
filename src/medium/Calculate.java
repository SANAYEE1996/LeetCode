package medium;

import java.util.ArrayList;

public class Calculate {
	public int calculate(String s) {
        s = s.replaceAll(" ","");
        System.out.println("input String : "+s);
        int value = 0;
        ArrayList<String> calNumList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
        	if(48 <= s.charAt(i) && s.charAt(i) <= 57) {
        		StringBuilder sb = new StringBuilder();
        		for(; i < s.length(); i++) {
        			if(!(48 <= s.charAt(i) && s.charAt(i) <= 57)) {
        				break;
        			}
        			sb.append(s.charAt(i));
        		}
        		calNumList.add(sb.toString());
        	}
        	if(i < s.length()) {
        		calNumList.add(String.valueOf(s.charAt(i)));
        	}
        }
        System.out.println(calNumList);
        String nowString;
        for(int i = 0; i < calNumList.size(); i++) {
        	nowString = calNumList.get(i);
        	if(nowString.matches("^[0-9]*$")) {
        		if(i > 0) {
        			if(calNumList.get(i-1).equals("+")) {
        				
        			}
        			else if(calNumList.get(i-1).equals("-")) {
        				
        			}
        		}
        		else {
        			value += Integer.parseInt(nowString);
        			continue;
        		}
        	}
        }
        return 0;
    }
}
