package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumString {
	
	/**
	 * https://leetcode.com/problems/shortest-string-that-contains-three-strings/
	 **/
	
	public String minimumString(String a, String b, String c) {
		List<String> list = new ArrayList<>();
		list.add(addTwoString(addTwoString(a, b), c));
		list.add(addTwoString(a, addTwoString(b, c)));
		list.add(addTwoString(addTwoString(a, c), b));
		list.add(addTwoString(a, addTwoString(c, b)));
		list.add(addTwoString(addTwoString(b, a), c));
		list.add(addTwoString(b, addTwoString(a, c)));
		list.add(addTwoString(addTwoString(b, c), a));
		list.add(addTwoString(b, addTwoString(c, a)));
		list.add(addTwoString(addTwoString(c, a), b));
		list.add(addTwoString(c, addTwoString(a, b)));
		list.add(addTwoString(addTwoString(c, b), a));
		list.add(addTwoString(c, addTwoString(b, a)));
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return Integer.compare(o1.length(), o2.length());
			}
		});
		return list.get(0);
	}

	private String addTwoString(String a, String b){
		if(a.contains(b)){
			return a;
		}
		int length;
		for(int i = 0; i < a.length(); i++){
			String x = a.substring(i);
			length = x.length();
			if(length > b.length()){
				continue;
			}
			if(x.equals(b.substring(0,length))){
				return a + b.substring(length);
			}
		}
		return a+b;
	}
}
