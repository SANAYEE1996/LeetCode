package easy;

public class ReplaceDigits {
	public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(48 <= s.charAt(i) && s.charAt(i) <= 57){
                sb.append((char)(s.charAt(i-1) + s.charAt(i)-48));
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
