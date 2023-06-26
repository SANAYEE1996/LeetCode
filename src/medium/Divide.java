package medium;

public class Divide {
	public int divide(int dividend, int divisor) {
		if(divisor == 0) return 0;
		else if(divisor == 1) return dividend;
		int totalPivot = (dividend >= 0 ? 1 : -1)*(divisor >= 0 ? 1 : -1);
		dividend = Math.abs(dividend == Integer.MIN_VALUE ? dividend+1 : dividend);
		divisor = Math.abs(divisor == Integer.MIN_VALUE ? divisor + 1 : divisor);
		if(dividend < divisor) return 0;
		else if(dividend == divisor) return totalPivot;
		else if(divisor == 1) return totalPivot == 1 ? dividend : -dividend;
		int answer = gogo(dividend, divisor);
		return totalPivot*answer;
	}

	private int gogo(int dividend, int divisor){
		String a = makeBinary(dividend), originDivisor = makeBinary(divisor);
		String b = originDivisor;
		int part = divisor+1;
		int answer = 0;
		while(part > divisor){
			String ship = addMinusBinary(a, getMinus(b));
			part = getIntegerFromBinaryString(ship);
			b = addBinary(b, originDivisor);
			answer++;
		}
		return answer;
	}

	private String makeBinary(int a){
		StringBuilder sb = new StringBuilder();
		while(a > 0){
			sb.insert(0,a%2);
			a/=2;
		}
		return sb.toString();
	}

	private int getIntegerFromBinaryString(String a){
		int answer = 0;
		int j = -1;
		for(int i = a.length()-1; i >= 0; i--){
			j++;
			if(a.charAt(i) == '0') continue;
			answer += Math.pow(2,j);
		}
		return answer;
	}

	private String addBinary(String a, String b){
		int lengthDiffer = Math.abs(a.length() - b.length());
		if(a.length() > b.length()){
			b = attachZero(b,lengthDiffer);
		}
		else if(a.length() < b.length()){
			a = attachZero(a,lengthDiffer);
		}
		StringBuilder sb = new StringBuilder();
		int pivot = add(a,b,sb,0);
		if(pivot == 1) sb.insert(0,1);
		return sb.toString();
	}
	
	private String addMinusBinary(String a, String b){
		int lengthDiffer = Math.abs(a.length() - b.length());
		if(a.length() > b.length()){
			b = attachOne(b,lengthDiffer);
		}
		else if(a.length() < b.length()){
			a = attachZero(a,lengthDiffer);
		}
		StringBuilder sb = new StringBuilder();
		add(a, b, sb, 0);
		return sb.toString();
	}
	
	private String attachOne(String a, int count){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count; i++) sb.append(1);
		sb.append(a);
		return sb.toString();
	}

	private int add(String a, String b, StringBuilder sb, int pivot){
		int sum = 0;
		for(int i = a.length()-1; i >= 0; i--){
			sum = pivot + (int)(a.charAt(i)-48) + (int)(b.charAt(i)-48);
			pivot = (sum >= 2) ? 1 : 0;
			if(sum % 2 == 1) sb.insert(0,1);
			else sb.insert(0,0);
		}
		return pivot;
	}

	private String attachZero(String a, int count){
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		for(int i = 0; i < count; i++){
			sb.insert(0,0);
		}
		return sb.toString();
	}

	private String getMinus(String a){
		String minus = addOne(getMirror(a));
		return minus;
	}
	
	private String addOne(String a){
		StringBuilder sb = new StringBuilder();
		int sum = 0, pivot = 1;
		for(int i = a.length()-1; i >= 0; i--){
			sum = pivot + (int)(a.charAt(i)-48);
			pivot = sum > 1 ? 1 : 0;
			if(sum % 2 == 0) sb.insert(0,0);
			else sb.insert(0,1);
		}
		if(pivot == 1) sb.insert(0,1);
		return sb.toString();
	}

	private String getMirror(String a){
		StringBuilder sb = new StringBuilder();
		for(int i  = 0; i < a.length(); i++){
			sb.append(a.charAt(i) == '1' ? 0 : 1);
		}
		return sb.toString();
	}
}
