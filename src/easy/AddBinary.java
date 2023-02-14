package easy;


public class AddBinary {
	public String addBinary(String a, String b) {
		a = getBack(a);
		b = getBack(b);
		if(a.length() <= b.length()) {
			return gogo(a, b);
		}
		return gogo(b, a);
    }
	
	private String getBack(String a) {
		StringBuilder sb = new StringBuilder();
		for(int i = a.length()-1; i>= 0; i--) {
			sb.append(a.charAt(i));
		}
		return sb.toString();
	}
	
	private String gogo(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int pivot = 0;
		for(int i = 0; i < a.length(); i++) {
			pivot = getPivot(a.charAt(i), b.charAt(i), pivot, sb);
		}
		for(int i = a.length(); i < b.length(); i++) {
			pivot = getPivot(b.charAt(i), pivot, sb);
		}
		if(pivot == 0) {
			return sb.toString();
		}
		sb.insert(0, 1);
		return sb.toString();
	}
	
	private int getPivot(char a, char b, int pivot, StringBuilder sb) {
		if(a + b == 96) { 
			sb.insert(0, pivot);
			return 0;
		}
		else if(a + b == 98) { 
			if(pivot == 1) {
				sb.insert(0, 1);
				return pivot;
			}
			sb.insert(0, 0);
			return 1;
		}
		else { 
			if(pivot == 1) {
				sb.insert(0, 0);
				return pivot;
			}
			sb.insert(0, 1);
			return 0;
		}
	}
	
	private int getPivot(char a, int pivot, StringBuilder sb) {
		if(a == '1' && pivot == 1) {
			sb.insert(0, 0);
			return 1;
		}
		else if(a == '0' && pivot == 0) {
			sb.insert(0, 0);
			return 0;
		}
		sb.insert(0, 1);
		return 0;
	}
}
