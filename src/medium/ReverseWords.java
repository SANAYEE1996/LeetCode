package medium;

import java.util.ArrayList;

public class ReverseWords {
	public String reverseWords(String s) {
		s = s.trim();
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				if(sb.toString() != null && !"".equals(sb.toString())) {
					list.add(sb.toString());
				}
				sb.setLength(0);
				continue;
			}
			sb.append(s.charAt(i));
		}
		list.add(sb.toString());
		sb.setLength(0);
		for(int i = list.size()-1 ; i >= 0; i--) {
			sb.append(list.get(i));
			if(i > 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
    }
}
