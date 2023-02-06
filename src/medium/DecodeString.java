package medium;

public class DecodeString {
	
	private int index;
	private StringBuilder sb;
	
	public String decodeString(String s) {
		sb = new StringBuilder();
        gogo(s, 1);
		return sb.toString();
    }
	private void gogo(String s, int frequentNumber){
		System.out.println("StringBuilder : " +sb.toString());
		StringBuilder sBuilder = new StringBuilder();
		for(; index < s.length(); index++){
			if(Character.isDigit(s.charAt(index))){
				frequentNumber = getNumberFromString(s);
				index--;
			}
			else if(s.charAt(index) == '['){
				index++;
				gogo(s, frequentNumber);
			}
			else if(s.charAt(index) == ']'){
				attachString(sBuilder.toString(), frequentNumber);
				frequentNumber = 1;
				sBuilder.setLength(0);
			}
			else{
				sBuilder.append(s.charAt(index));
			}
		}
	}
	
	private int getNumberFromString(String s) {
		StringBuilder sbNumber = new StringBuilder();
		for(; index < s.length(); index++) {
			if(!Character.isDigit(s.charAt(index))){
				break;
			}
			sbNumber.append(s.charAt(index));
		}
		return Integer.parseInt(sbNumber.toString());
	}
	
	private void attachString(String part, int frequent) {
		for(int i = 0; i < frequent; i++) {
			sb.append(part);
		}
	}
	
}
