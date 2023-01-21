package medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> wholeList = new ArrayList<>();
		String part;
		for(int i = 1; i <=3; i++) {
			if(i < s.length()) {
				part = s.substring(0, i);
				if(Integer.parseInt(part) <= 255 && !(part.length() > 1 && part.charAt(0) == '0')) {
					gogo(wholeList, s, i, s.substring(0, i), 0);
				}
			}
		}
		return wholeList;
    }
	
	private void gogo(List<String> wholeList, String originString, int startIndex, String partString, int dotCount) {
		if(startIndex >= originString.length() && dotCount == 3) {
			wholeList.add(partString);
			return;
		}
		String part;
		for(int i = 1; i <= 3; i++) {
			if(startIndex+i > originString.length()) {
				continue;
			}
			part = originString.substring(startIndex, startIndex+i);
			if(Integer.parseInt(part) <= 255 && !(part.length() > 1 && part.charAt(0) == '0') && dotCount < 3) {
				gogo(wholeList, originString, startIndex+i, partString + "." +part, dotCount+1);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		RestoreIpAddresses s= new RestoreIpAddresses();
		System.out.println(s.restoreIpAddresses("25525511135"));
		System.out.println(s.restoreIpAddresses("0000"));
		System.out.println(s.restoreIpAddresses("101023"));
	}
}
