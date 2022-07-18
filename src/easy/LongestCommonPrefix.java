package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
	
	void sortOrderByLength(String[] strs) {
		Arrays.sort(strs, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		return o1.length()-o2.length();
        	}
        });
	}
	
	public String longestCommonPrefix(String[] strs) {
		sortOrderByLength(strs);
		ArrayList<String> prefixList = new ArrayList<>();
		getAllCase(strs[0], prefixList);
        String answer = "";
        for(String s : prefixList) {
        	if(isPrefix(s, strs)) answer = s;
        }
		return answer;
    }
	
	boolean isPrefix(String s, String[] strs) {
		for(int i=1; i < strs.length; i++) {
    		if(!strs[i].startsWith(s)) return false;
    	}
		return true;
	}
	
	public void getAllCase(String s, ArrayList<String> prefixList) {
		for(int i = 1; i <= s.length(); i++) 
			prefixList.add(s.substring(0,i));
	}
}
