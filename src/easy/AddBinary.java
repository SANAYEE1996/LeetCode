package easy;


public class AddBinary {
	public String addBinary(String a, String b) {
        try {
			int aNumber = getIntegerFromBinaryString(a);
			int bNumber = getIntegerFromBinaryString(b);
			return getStringFromInteger(aNumber + bNumber);
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
    }
	
	private int getIntegerFromBinaryString(String a) throws Exception{
		int numb = 0;
		int twoSquare = -1;
		for(int i = a.length()-1; i >= 0; i--) {
			twoSquare++;
			if(a.charAt(i) == '0') {
				continue;
			}
			else if(a.charAt(i) == '1') {
				numb += Math.pow(2, twoSquare);
			}
			else {
				throw new Exception("It is not binary String");
			}
		}
		return numb;
	}
	
	private String getStringFromInteger(int a) {
		if(a == 0) return "0";
		StringBuilder sb = new StringBuilder();
		while(a != 0) {
			if(a%2 == 0) {
				sb.insert(0, 0);
			}
			else {
				sb.insert(0, 1);
			}
			a/=2;
		}
		return sb.toString();
	}

}
