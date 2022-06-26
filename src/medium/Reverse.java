package medium;

public class Reverse {
	public int reverse(int x) {
        int pivot = 1;
        String str = String.valueOf(x);
        if(x < 0) {
        	pivot = -1;
        	str = str.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
        	sb.append(str.charAt(i));
        }
        long result = pivot*Long.parseLong(sb.toString());
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
		return (int) result;
    }
}
