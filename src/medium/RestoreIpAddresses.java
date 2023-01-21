package medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> wholeList = new ArrayList<>();
		for(int i = 1; i <=3; i++) {
			if(i < s.length()) {
				if(Integer.parseInt(s.substring(0, i)) <= 255) {
					gogo(wholeList, s, i, s.substring(0, i));
				}
			}
		}
		
		List<String> answerList = new ArrayList<>();
		for(String str : wholeList) {
			if(isContainOnlyThreeDot(str)) {
				answerList.add(str);
			}
		}
		return answerList;
    }
	
	private void gogo(List<String> wholeList, String originString, int startIndex, String partString) {
		if(startIndex >= originString.length()) {
			wholeList.add(partString);
			return;
		}
		String part;
		for(int i = 1; i <= 3; i++) {
			if(startIndex+i > originString.length()) {
				continue;
			}
			part = originString.substring(startIndex, startIndex+i);
			if(Integer.parseInt(part) <= 255) {
				gogo(wholeList, originString, startIndex+i, partString + "." +part);
			}
		}
	}
	
	private boolean isContainOnlyThreeDot(String s) {
		int dotCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '.') {
				dotCount++;
			}
		}
		if(dotCount == 3) {
			return isRightIpAddress(s);
		}
		return false;
	}
	
	private boolean isRightIpAddress(String s) {
		String[] splitArray = s.split("\\.");
		for(int i = 0; i < splitArray.length; i++) {
			if(splitArray[i].length() > 1 && splitArray[i].charAt(0) == '0') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		RestoreIpAddresses s= new RestoreIpAddresses();
		System.out.println(s.restoreIpAddresses("25525511135"));
		System.out.println(s.restoreIpAddresses("0000"));
		System.out.println(s.restoreIpAddresses("101023"));
	}
}
