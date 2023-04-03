package easy;

public class ConvertToTitle {
	public String convertToTitle(int columnNumber) {
        int mot = 100;
        int nam = 0;
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
        	mot = columnNumber/26;
        	nam = columnNumber%26 == 0 ? 26 : columnNumber%26;
        	sb.insert(0, (char)(nam+64));
        	columnNumber = (nam == 26) ? mot-1 : mot;
        }
		return sb.toString();
    }
}
