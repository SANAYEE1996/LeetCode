package medium;

public class Convert {
	public String convert(String s, int numRows) {
        String[] strArray = new String[numRows];
        int i = 0;
        int index = 0;
        for(int j = 0; j < strArray.length; j++) {
        	strArray[j] = "";
        }
        while(i < s.length()) {
        	if(index <= 0) {
        		for(index = 0; index <= numRows-1; index++) {
        			strArray[index] += s.charAt(i);
        			i++;
        			if(i >= s.length()) break;
        		}
        	}
        	else if(index >= numRows-1) {
        		for(index = numRows-2; index > 0; index--) {
        			strArray[index] += s.charAt(i);
        			i++;
        			if(i >= s.length()) break;
        		}
        	}
        }
        StringBuilder sb = new StringBuilder();
        for(String j : strArray) sb.append(j);
		
		return sb.toString();
    }
}
