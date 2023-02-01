package easy;

import java.util.ArrayList;

public class GcdOfStrings {
	public String gcdOfStrings(String str1, String str2) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();
		
        gogo(str1, aList);
        gogo(str2, bList);
        
        if(str1.length() >= str2.length()) {
        	return getString(bList, str1);
        }
        return getString(aList, str2);
    }
	
	private void gogo(String a, ArrayList<String> list) {
		int aSize = a.length();
		String start;
		String copyString;
		for(int i = 1; i <= aSize; i++) {
			if(aSize % i != 0) {
				continue;
			}
			start = a.substring(0, i);
			copyString = a;
			while(copyString.startsWith(start) && !copyString.equals("")) {
				copyString = copyString.substring(i);
			}
			if(copyString.equals("")) {
				list.add(start);
			}
		}
	}
	
	private String getString(ArrayList<String> list, String a) {
		String answer = "";
		for(String s : list) {
			if(isContain(a, s)) {
				answer = s;
			}
		}
		return answer;
	}
	
	private boolean isContain(String big, String small) {
		if(big.length() % small.length() != 0) {
			return false;
		}
		int size = small.length();
		while(big.startsWith(small) && !big.equals("")) {
			big = big.substring(size);
		}
		return big.equals("");
	}
	
	public static void main(String[] args) {
		GcdOfStrings s = new GcdOfStrings();
		
		System.out.println(s.gcdOfStrings("ABCABC", "ABC"));
		
		System.out.println(s.gcdOfStrings("ABABAB", "ABAB"));
		
		System.out.println(s.gcdOfStrings("LEET", "CODE"));
	}
}
