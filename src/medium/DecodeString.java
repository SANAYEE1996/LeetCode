package medium;

public class DecodeString {
	public String decodeString(String s) {
        
		String numberString = "";
		int frequent = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				numberString = getIntegerFromString(s, i);
				i += numberString.length();
				frequent = Integer.parseInt(numberString);
			}
			else if(s.charAt(i) == '[') {
				
			}
		}
		
		return s;
    }
	
	private String getIntegerFromString(String s, int startIndex) {
		StringBuilder sb = new StringBuilder();
		for(int i = startIndex; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				break;
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	private String getRepeatedString(String s, int frequent) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < frequent; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	
	private String getStringInBucket(String s, int startIndex) {
		StringBuilder sb = new StringBuilder();
		for(int i = startIndex; i < s.length(); i++) {
			if(s.charAt(i) == ']') {
				break;
			}
			else if(s.charAt(i) == '[') {
				sb.append(getStringInBucket(s, i+1));
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
