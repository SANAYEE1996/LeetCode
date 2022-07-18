package medium;

import java.util.ArrayList;

public class LengthOfLongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
		 if(s.equals("")) return 0;
		 ArrayList<Character> list = new ArrayList<>();
		 list.add(s.charAt(0));
		 int max = list.size();
		 int index = 0;
		 for(int i = 1; i < s.length(); i++) {
			 if(list.contains(s.charAt(i))) {
				 max = Math.max(max, list.size());
				 index = list.indexOf(s.charAt(i));
				 list.remove(index);
				 list.add(s.charAt(i));
				 continue;
			 }
			 list.add(s.charAt(i));
		 }
		 System.out.println(list);
		 return Math.max(list.size(), max);
	 }
}
