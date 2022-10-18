package medium;

import java.util.ArrayList;

public class CountAndSay {
	public String countAndSay(int n) {
        ArrayList<String> sayList = new ArrayList<>();
        sayList.add("1");
        makeList(sayList,n);
        return sayList.get(n-1);
    }
	
	private void makeList(ArrayList<String> sayList, int n) {
		int index = 0;
		while (sayList.size() <= n) {
			sayList.add(getSayAndCount(sayList.get(index)));
			index++;
		}
	}
	
	private String getSayAndCount(String s) {
		if(s.length() == 1) {
			return "1" + s;
		}
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i-1) == s.charAt(i)) {
				count++;
			}
			else {
				sb.append(count);
				sb.append(s.charAt(i-1));
				count = 1;
			}
		}
		sb.append(count);
		sb.append(s.charAt(s.length()-1));
		return sb.toString();
	}
	
	public static void main(String[] args) {
		CountAndSay s = new CountAndSay();
		System.out.println(s.getSayAndCount("1"));
		System.out.println(s.getSayAndCount("11"));
		System.out.println(s.getSayAndCount("21"));
		System.out.println(s.getSayAndCount("5"));
		System.out.println(s.getSayAndCount("3322251"));
		for(int i = 1; i <= 30; i++) {
			System.out.println(i+" 숫자인 : "+s.countAndSay(i));
		}
	}
}
